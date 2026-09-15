package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tavor21RailedUpper extends ModelBase {
	private final ModelRenderer railedupper;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;

	public Tavor21RailedUpper() {
		textureWidth = 432;
		textureHeight = 432;

		railedupper = new ModelRenderer(this);
		railedupper.setRotationPoint(0.0F, 24.0F, 0.0F);
		railedupper.cubeList.add(new ModelBox(railedupper, 244, 414, -3.0F, -41.0F, -32.25F, 3, 3, 3, -0.2F, false));
		railedupper.cubeList.add(new ModelBox(railedupper, 56, 346, -3.0F, -40.2F, -9.25F, 3, 1, 23, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7F, -42.5F, -34.75F);
		railedupper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 388, 415, -1.8F, 0.8F, 9.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 291, -1.8F, 0.8F, 7.85F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 222, -1.8F, 0.8F, 10.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 224, -1.8F, 0.8F, 11.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 353, -1.8F, 0.8F, 4.15F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 351, -1.8F, 0.8F, 5.4F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 349, -1.8F, 0.8F, 6.65F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 226, -1.8F, 0.8F, 12.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 228, -1.8F, 0.8F, 14.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 230, -1.8F, 0.8F, 15.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 232, -1.8F, 0.8F, 16.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 234, -1.8F, 0.8F, 17.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 236, 422, -1.8F, 0.8F, 19.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 236, -1.8F, 0.8F, 20.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 251, -1.8F, 0.8F, 21.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 253, -1.8F, 0.8F, 22.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 255, -1.8F, 0.8F, 24.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 257, -1.8F, 0.8F, 25.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 376, 422, -1.8F, 0.8F, 26.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 259, -1.8F, 0.8F, 27.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 261, -1.8F, 0.8F, 29.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 268, 422, -1.8F, 0.8F, 30.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 274, 422, -1.8F, 0.8F, 31.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 280, 422, -1.8F, 0.8F, 32.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 286, 422, -1.8F, 0.8F, 34.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 320, 422, -1.8F, 0.8F, 35.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 329, -1.8F, 0.8F, 36.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 331, -1.8F, 0.8F, 37.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 333, -1.8F, 0.8F, 39.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 335, -1.8F, 0.8F, 40.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 337, -1.8F, 0.8F, 41.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 339, -1.8F, 0.8F, 42.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 341, -1.8F, 0.8F, 44.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 343, -1.8F, 0.8F, 45.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 345, -1.8F, 0.8F, 46.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 422, 347, -1.8F, 0.8F, 47.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 158, 420, -1.8F, 0.8F, 49.05F, 2, 1, 2, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 420, 160, -1.8F, 0.8F, 49.95F, 2, 1, 2, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 248, -1.7F, 1.4F, 2.75F, 2, 1, 49, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 248, 0, -1.9F, 1.4F, 2.75F, 1, 1, 49, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 54, 414, -1.8F, 0.8F, 2.55F, 2, 1, 2, -0.199F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 420, 264, 0.5771F, 0.4293F, 3.8F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 298, 0.5271F, 0.5793F, 5.2F, 1, 1, 46, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 422, 90, 0.5771F, 0.4293F, 51.2F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 422, 93, 0.5771F, 0.4293F, 50.3F, 1, 1, 2, -0.197F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 198, 424, 0.5771F, 0.4293F, 49.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 218, 424, 0.5771F, 0.4293F, 47.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 222, 424, 0.5771F, 0.4293F, 46.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 226, 424, 0.5771F, 0.4293F, 45.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 230, 424, 0.5771F, 0.4293F, 44.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 234, 424, 0.5771F, 0.4293F, 42.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 238, 424, 0.5771F, 0.4293F, 41.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 238, 0.5771F, 0.4293F, 40.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 240, 0.5771F, 0.4293F, 39.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 426, 283, 0.5771F, 0.4293F, 37.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 242, 0.5771F, 0.4293F, 36.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 244, 0.5771F, 0.4293F, 35.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 246, 0.5771F, 0.4293F, 34.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 248, 0.5771F, 0.4293F, 32.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 262, 424, 0.5771F, 0.4293F, 31.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 266, 424, 0.5771F, 0.4293F, 30.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 270, 424, 0.5771F, 0.4293F, 29.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 286, 426, 0.5771F, 0.4293F, 27.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 274, 424, 0.5771F, 0.4293F, 26.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 278, 424, 0.5771F, 0.4293F, 25.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 282, 424, 0.5771F, 0.4293F, 24.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 286, 424, 0.5771F, 0.4293F, 22.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 293, 0.5771F, 0.4293F, 21.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 295, 0.5771F, 0.4293F, 20.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 297, 0.5771F, 0.4293F, 19.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 299, 0.5771F, 0.4293F, 17.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 301, 0.5771F, 0.4293F, 16.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 303, 0.5771F, 0.4293F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 305, 0.5771F, 0.4293F, 14.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 307, 0.5771F, 0.4293F, 12.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 309, 0.5771F, 0.4293F, 11.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 311, 0.5771F, 0.4293F, 10.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 424, 313, 0.5771F, 0.4293F, 9.1F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 344, 425, 0.5771F, 0.4293F, 7.9F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 340, 425, 0.5771F, 0.4293F, 6.65F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 336, 425, 0.5771F, 0.4293F, 5.4F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 420, 267, -1.5771F, 0.4293F, 3.8F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 298, 246, -1.5271F, 0.5793F, 5.2F, 1, 1, 46, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 422, 96, -1.5771F, 0.4293F, 51.2F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 422, 99, -1.5771F, 0.4293F, 50.3F, 1, 1, 2, -0.197F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 424, 315, -1.5771F, 0.4293F, 49.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 424, 317, -1.5771F, 0.4293F, 47.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 424, 319, -1.5771F, 0.4293F, 46.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 320, 424, -1.5771F, 0.4293F, 45.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 424, 321, -1.5771F, 0.4293F, 44.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 424, 323, -1.5771F, 0.4293F, 42.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 424, 325, -1.5771F, 0.4293F, 41.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 424, 327, -1.5771F, 0.4293F, 40.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 376, 424, -1.5771F, 0.4293F, 39.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 426, 285, -1.5771F, 0.4293F, 37.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 414, 424, -1.5771F, 0.4293F, 36.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 8, 425, -1.5771F, 0.4293F, 35.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 12, 425, -1.5771F, 0.4293F, 34.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 16, 425, -1.5771F, 0.4293F, 32.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 20, 425, -1.5771F, 0.4293F, 31.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 24, 425, -1.5771F, 0.4293F, 30.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 62, 425, -1.5771F, 0.4293F, 29.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 426, 287, -1.5771F, 0.4293F, 27.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 66, 425, -1.5771F, 0.4293F, 26.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 70, 425, -1.5771F, 0.4293F, 25.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 74, 425, -1.5771F, 0.4293F, 24.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 78, 425, -1.5771F, 0.4293F, 22.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 82, 425, -1.5771F, 0.4293F, 21.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 86, 425, -1.5771F, 0.4293F, 20.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 90, 425, -1.5771F, 0.4293F, 19.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 134, 425, -1.5771F, 0.4293F, 17.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 138, 425, -1.5771F, 0.4293F, 16.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 152, 425, -1.5771F, 0.4293F, 15.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 156, 425, -1.5771F, 0.4293F, 14.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 160, 425, -1.5771F, 0.4293F, 12.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 178, 425, -1.5771F, 0.4293F, 11.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 182, 425, -1.5771F, 0.4293F, 10.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 186, 425, -1.5771F, 0.4293F, 9.1F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 332, 425, -1.5771F, 0.4293F, 7.9F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 328, 425, -1.5771F, 0.4293F, 6.65F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 324, 425, -1.5771F, 0.4293F, 5.4F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railedupper.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}