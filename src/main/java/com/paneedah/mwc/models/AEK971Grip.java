package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AEK971Grip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer grip_r1;
	private final ModelRenderer grip_r2;
	private final ModelRenderer grip_r3;
	private final ModelRenderer grip_r4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer gun108;
	private final ModelRenderer gun370;
	private final ModelRenderer gun373;
	private final ModelRenderer gun368;
	private final ModelRenderer gun73;
	private final ModelRenderer gun371;
	private final ModelRenderer gun375;
	private final ModelRenderer gun372;
	private final ModelRenderer grip2;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip13_r1;

	public AEK971Grip() {
		textureWidth = 416;
		textureHeight = 416;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-0.8335F, -7.0705F, -5.908F);
		grip.cubeList.add(new ModelBox(grip, 296, 394, 1.0836F, 0.0705F, 3.908F, 1, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 228, 284, -3.4166F, 0.0705F, 3.908F, 5, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 404, 85, 1.0836F, -0.1545F, 5.908F, 1, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 106, 45, -3.4166F, -0.1545F, 5.908F, 5, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 82, 404, 1.0815F, 0.0705F, -9.492F, 1, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 94, 45, -3.4164F, 0.0705F, -9.492F, 5, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 54, 357, -3.4165F, -0.9295F, -9.092F, 5, 2, 13, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 378, 346, 1.0835F, -0.9295F, -9.092F, 1, 2, 8, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 136, 387, 0.8335F, -0.9295F, -1.092F, 1, 2, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 312, 86, -2.6655F, 5.5705F, -1.417F, 4, 1, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.1237F, 0.4847F, -3.092F);
		grip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 310, 375, -0.5F, -2.5F, -6.0F, 1, 1, 13, 0.0F, false));

		grip_r1 = new ModelRenderer(this);
		grip_r1.setRotationPoint(-0.6655F, 5.4702F, -7.5422F);
		grip.addChild(grip_r1);
		setRotationAngle(grip_r1, 0.2618F, 0.0F, 0.0F);
		grip_r1.cubeList.add(new ModelBox(grip_r1, 280, 387, -2.0F, -5.5F, -1.0F, 4, 5, 2, 0.0F, false));

		grip_r2 = new ModelRenderer(this);
		grip_r2.setRotationPoint(-0.6655F, 5.8659F, -7.1851F);
		grip.addChild(grip_r2);
		setRotationAngle(grip_r2, -0.0436F, 0.0F, 0.0F);
		grip_r2.cubeList.add(new ModelBox(grip_r2, 118, 373, -1.0F, -3.5F, -2.0F, 2, 4, 1, 0.0F, false));

		grip_r3 = new ModelRenderer(this);
		grip_r3.setRotationPoint(-0.6655F, 5.8659F, -2.2851F);
		grip.addChild(grip_r3);
		setRotationAngle(grip_r3, -0.2182F, 0.0F, 0.0F);
		grip_r3.cubeList.add(new ModelBox(grip_r3, 378, 58, -2.0F, -0.5F, -6.0F, 4, 1, 7, 0.0F, false));

		grip_r4 = new ModelRenderer(this);
		grip_r4.setRotationPoint(-0.6655F, 1.0705F, 5.483F);
		grip.addChild(grip_r4);
		setRotationAngle(grip_r4, 0.7854F, 0.0F, 0.0F);
		grip_r4.cubeList.add(new ModelBox(grip_r4, 34, 368, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.5335F, -0.6295F, 1.208F);
		grip.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 400, 20, -0.25F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 338, 380, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.1263F, 1.0705F, 1.908F);
		grip.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 338, 394, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.3763F, -0.9295F, -3.092F);
		grip.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 304, 394, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.9165F, 0.0711F, 5.7105F);
		grip.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 320, 394, 4.0F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 312, 394, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.3335F, -0.2001F, -8.8387F);
		grip.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 404, 113, -3.749F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 404, 83, 0.749F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(0.6335F, -2.4295F, 2.408F);
		grip.addChild(gun108);
		gun108.cubeList.add(new ModelBox(gun108, 368, 401, 0.3F, 0.0F, -0.7F, 1, 1, 1, 0.0F, false));
		gun108.cubeList.add(new ModelBox(gun108, 86, 404, 0.3F, 0.0F, -12.7F, 1, 1, 1, 0.0F, false));

		gun370 = new ModelRenderer(this);
		gun370.setRotationPoint(0.8335F, -3.4295F, 0.408F);
		grip.addChild(gun370);
		setRotationAngle(gun370, -0.4833F, 0.0F, 0.0F);
		gun370.cubeList.add(new ModelBox(gun370, 208, 398, -0.002F, -0.2876F, 0.9784F, 1, 1, 2, 0.0F, false));

		gun373 = new ModelRenderer(this);
		gun373.setRotationPoint(1.0335F, -2.7295F, -5.592F);
		grip.addChild(gun373);
		gun373.cubeList.add(new ModelBox(gun373, 338, 60, 0.001F, 0.0F, 1.0F, 1, 1, 5, 0.0F, false));

		gun368 = new ModelRenderer(this);
		gun368.setRotationPoint(-0.2F, -0.7F, -8.0F);
		gun373.addChild(gun368);
		gun368.cubeList.add(new ModelBox(gun368, 60, 372, 0.0F, 0.2F, 2.0F, 1, 2, 13, 0.0F, false));
		gun368.cubeList.add(new ModelBox(gun368, 382, 398, -0.001F, 1.1294F, 14.7709F, 1, 1, 2, 0.0F, false));
		gun368.cubeList.add(new ModelBox(gun368, 388, 398, -0.002F, 1.5294F, 14.7709F, 1, 1, 2, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(1.0335F, -2.7295F, -6.292F);
		grip.addChild(gun73);
		gun73.cubeList.add(new ModelBox(gun73, 388, 401, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		gun73.cubeList.add(new ModelBox(gun73, 402, 369, -0.001F, 0.3F, 1.0F, 1, 1, 1, 0.0F, false));

		gun371 = new ModelRenderer(this);
		gun371.setRotationPoint(0.8335F, -1.6295F, -8.092F);
		grip.addChild(gun371);
		gun371.cubeList.add(new ModelBox(gun371, 46, 368, -0.001F, -0.3F, 1.0F, 1, 1, 3, 0.0F, false));

		gun375 = new ModelRenderer(this);
		gun375.setRotationPoint(1.0335F, -2.7295F, -7.892F);
		grip.addChild(gun375);
		gun375.cubeList.add(new ModelBox(gun375, 392, 401, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		gun375.cubeList.add(new ModelBox(gun375, 402, 371, -0.001F, 0.3F, 1.0F, 1, 1, 1, 0.0F, false));

		gun372 = new ModelRenderer(this);
		gun372.setRotationPoint(1.0335F, -2.7295F, -13.592F);
		grip.addChild(gun372);
		gun372.cubeList.add(new ModelBox(gun372, 344, 186, 0.001F, 0.0F, 2.0F, 1, 1, 5, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(0.8335F, 32.0705F, 6.483F);
		grip.addChild(grip2);
		grip2.cubeList.add(new ModelBox(grip2, 48, 394, -3.0F, -30.9F, -1.6F, 3, 5, 1, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 88, 386, -3.499F, -31.0F, -6.0F, 4, 4, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -26.0F, -5.5F);
		grip2.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 68, 266, 0.0F, -1.5F, 0.0F, 4, 12, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -29.0F, -1.0F);
		grip2.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 344, 359, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 372, 160, 0.499F, -0.424F, -0.1956F, 3, 1, 12, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip2.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.2231F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 312, 350, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 142, 45, 0.0F, -0.001F, 6.45F, 4, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 142, 398, 0.5F, -0.0352F, 6.8137F, 3, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 150, 398, 0.501F, -0.2852F, 6.8127F, 3, 1, 1, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip2.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.0782F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 152, 45, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-3.6F, -26.0F, -5.5F);
		grip2.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.3665F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 168, 193, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 158, 224, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}