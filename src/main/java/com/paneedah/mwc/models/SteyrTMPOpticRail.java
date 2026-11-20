package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SteyrTMPOpticRail extends ModelBase {
	private final ModelRenderer railAdapter;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;

	public SteyrTMPOpticRail() {
		textureWidth = 288;
		textureHeight = 288;

		railAdapter = new ModelRenderer(this);
		railAdapter.setRotationPoint(-1.4737F, -23.5631F, -10.7368F);
		setRotationAngle(railAdapter, 0.0F, 0.0F, 0.0F);
		railAdapter.cubeList.add(new ModelBox(railAdapter, 280, 128, -0.0237F, 8.7368F, -4.3632F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 210, -0.0237F, 8.7368F, -3.1132F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 212, 278, -0.0237F, 8.7368F, -1.8632F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 212, -0.0237F, 8.7368F, -0.6132F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 214, -0.0237F, 8.7368F, 0.6368F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 216, 278, -0.0237F, 8.7368F, 3.1368F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 216, -0.0237F, 8.7368F, 1.8868F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 220, 278, -0.0237F, 8.7368F, 5.6368F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 224, 278, -0.0237F, 8.7368F, 4.3868F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 225, -0.0237F, 8.7368F, 8.1368F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 227, -0.0237F, 8.7368F, 6.8868F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 228, 278, -0.0237F, 8.7368F, 10.6368F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 231, -0.0237F, 8.7368F, 11.0368F, 1, 1, 1, -0.198F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 232, 278, -0.0237F, 8.7368F, 9.3868F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 233, -1.0213F, 8.7344F, 11.0378F, 1, 1, 1, -0.198F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 235, -1.0213F, 8.7344F, 10.6378F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 236, 278, -1.0213F, 8.7344F, 9.3878F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 237, -1.0213F, 8.7344F, 8.1378F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 252, -1.0213F, 8.7344F, 6.8878F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 254, -1.0213F, 8.7344F, 5.6378F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 256, -1.0213F, 8.7344F, 4.3878F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 278, 266, -1.0213F, 8.7344F, 3.1378F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 0, 279, -1.0213F, 8.7344F, 1.8878F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 4, 279, -1.0213F, 8.7344F, -0.6122F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 84, 279, -1.0213F, 8.7344F, 0.6378F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 88, 279, -1.0213F, 8.7344F, -1.8622F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 92, 279, -1.0213F, 8.7344F, -3.1122F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 280, 130, -1.0213F, 8.7344F, -4.3622F, 1, 1, 1, -0.199F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 208, 119, -0.9237F, 9.3368F, -4.1632F, 2, 1, 16, -0.001F, false));
		railAdapter.cubeList.add(new ModelBox(railAdapter, 214, 69, -1.1238F, 9.3368F, -4.1632F, 1, 1, 16, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		railAdapter.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 0.8901F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 14, 15.8063F, -5.1883F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 16, 15.8063F, -5.1883F, 23.5F, 1, 1, 1, -0.197F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 18, 15.8063F, -5.1883F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 20, 15.8063F, -5.1883F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 22, 15.8063F, -5.1883F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 24, 15.8063F, -5.1883F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 26, 15.8063F, -5.1883F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 32, 280, 15.8063F, -5.1883F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 36, 280, 15.8063F, -5.1883F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 40, 280, 15.8063F, -5.1883F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 44, 280, 15.8063F, -5.1883F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 48, 280, 15.8063F, -5.1883F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 52, 280, 15.8063F, -5.1883F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 280, 132, 15.8068F, -5.1894F, 8.1F, 1, 1, 1, -0.198F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		railAdapter.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.8901F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 76, 280, 0.7516F, 16.4939F, 21.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 80, 280, 0.7516F, 16.4939F, 23.5F, 1, 1, 1, -0.197F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 88, 0.7516F, 16.4939F, 23.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 90, 0.7516F, 16.4939F, 19.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 92, 0.7516F, 16.4939F, 20.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 96, 280, 0.7516F, 16.4939F, 16.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 100, 280, 0.7516F, 16.4939F, 18.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 104, 280, 0.7516F, 16.4939F, 14.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 108, 280, 0.7516F, 16.4939F, 15.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 109, 0.7516F, 16.4939F, 13.1F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 111, 0.7516F, 16.4939F, 11.85F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 113, 0.7516F, 16.4939F, 10.6F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 126, 0.7516F, 16.4939F, 9.35F, 1, 1, 1, -0.198F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 280, 134, 0.7516F, 16.4939F, 8.1F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railAdapter.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}