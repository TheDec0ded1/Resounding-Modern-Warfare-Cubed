package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKRStock extends ModelBase {
	private final ModelRenderer gun234;
	private final ModelRenderer gun237;
	private final ModelRenderer gun241;
	private final ModelRenderer gun242;
	private final ModelRenderer gun243;
	private final ModelRenderer gun244;
	private final ModelRenderer gun245;
	private final ModelRenderer gun366;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;

	public AKRStock() {
		textureWidth = 512;
		textureHeight = 256;

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-3.5F, -11.9F, -1.5F);
		setRotationAngle(gun234, -1.5708F, 0.0F, 0.0F);
		gun234.cubeList.add(new ModelBox(gun234, 135, 23, 0.0F, -5.8966F, -0.109F, 4, 2, 6, 0.0F, false));

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-3.0F, -11.5F, 12.95F);
		setRotationAngle(gun237, -0.1002F, 0.0F, 0.0F);
		gun237.cubeList.add(new ModelBox(gun237, 137, 30, 0.0F, 0.0F, -10.0F, 3, 2, 4, 0.0F, false));

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, 0.1F, 28.6F);
		setRotationAngle(gun241, -0.1115F, 0.0F, 0.0F);
		gun241.cubeList.add(new ModelBox(gun241, 136, 17, 0.001F, 0.5241F, -0.1312F, 4, 2, 1, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -9.9F, 30.8F);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 161, 11, 0.0F, 0.2196F, -0.1507F, 2, 3, 1, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -8.9F, 29.7F);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 142, 17, 0.0F, 0.4208F, -0.1768F, 3, 11, 2, 0.0F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -8.9F, 29.7F);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 153, 3, 0.0F, 0.4208F, -0.1761F, 1, 11, 2, 0.0F, false));

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-1.1F, -9.9F, 30.8F);
		setRotationAngle(gun245, -0.0873F, 0.0F, 0.0F);
		gun245.cubeList.add(new ModelBox(gun245, 153, 9, 0.0F, 0.2194F, -0.1501F, 1, 3, 1, 0.0F, false));

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.5F, -7.6F, 12.5F);
		setRotationAngle(gun366, -0.0292F, 0.0F, 0.0F);
		gun366.cubeList.add(new ModelBox(gun366, 131, 15, 1.501F, -1.3202F, -7.6558F, 1, 1, 10, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -9.5F, 11.95F);
		gun2.cubeList.add(new ModelBox(gun2, 137, 30, 1.0F, -1.0F, -9.25F, 2, 4, 4, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -7.6F, 12.5F);
		setRotationAngle(gun3, -0.5091F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 108, 6, 1.501F, -2.2535F, 1.4697F, 1, 1, 8, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -7.6F, 18.5F);
		setRotationAngle(gun4, -1.12F, 0.0F, 0.0F);
		gun4.cubeList.add(new ModelBox(gun4, 133, 17, 1.501F, -1.877F, 3.8505F, 1, 1, 8, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -1.6F, 18.5F);
		setRotationAngle(gun5, 1.1053F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 133, 17, 1.501F, 2.4828F, 2.9922F, 1, 1, 8, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -7.6F, 18.5F);
		setRotationAngle(gun6, -0.5091F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 138, 22, 1.501F, 5.0788F, 10.2104F, 1, 1, 3, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -7.6F, 18.5F);
		setRotationAngle(gun7, 0.5381F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 138, 22, 0.501F, 13.4799F, 1.3408F, 3, 1, 3, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -20.6F, 22.5F);
		setRotationAngle(gun8, -0.5091F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 138, 22, 0.501F, 5.3285F, 9.8906F, 3, 1, 3, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-1.499F, -9.9906F, 27.908F);
		setRotationAngle(gun9, 0.2763F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 166, 16, -1.5F, -0.9208F, -2.0832F, 3, 1, 3, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-1.1F, -9.9F, 29.8F);
		setRotationAngle(gun10, -0.0873F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 149, 5, 0.0F, 0.0202F, -4.1675F, 1, 3, 5, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-2.9F, -9.9F, 29.8F);
		setRotationAngle(gun11, -0.0873F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 157, 7, 0.0F, 0.0204F, -4.1681F, 2, 3, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun234.render(f5);
		gun237.render(f5);
		gun241.render(f5);
		gun242.render(f5);
		gun243.render(f5);
		gun244.render(f5);
		gun245.render(f5);
		gun366.render(f5);
		gun2.render(f5);
		gun3.render(f5);
		gun4.render(f5);
		gun5.render(f5);
		gun6.render(f5);
		gun7.render(f5);
		gun8.render(f5);
		gun9.render(f5);
		gun10.render(f5);
		gun11.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}