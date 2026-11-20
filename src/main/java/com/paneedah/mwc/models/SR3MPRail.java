package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3MPRail extends ModelBase {
	private final ModelRenderer railmount;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer gun27;
	private final ModelRenderer gun30;

	public SR3MPRail() {
		textureWidth = 256;
		textureHeight = 256;

		railmount = new ModelRenderer(this);
		railmount.setRotationPoint(1.0937F, -13.0413F, -42.0F);
		setRotationAngle(railmount, 0.0F, 0.0F, 1.5708F);
		railmount.cubeList.add(new ModelBox(railmount, 98, 190, -1.0F, -0.0135F, -6.5F, 2, 1, 9, -0.1F, false));
		railmount.cubeList.add(new ModelBox(railmount, 106, 198, -1.0F, -0.0135F, 1.9F, 2, 1, 1, -0.1F, false));
		railmount.cubeList.add(new ModelBox(railmount, 110, 101, 0.0F, -0.5135F, 2.1F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 110, 103, 0.0F, -0.5135F, 1.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 73, 112, -1.0F, -0.5135F, 2.1F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 98, 113, -1.0F, -0.5135F, 1.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 90, 12, 0.0F, -0.5135F, -2.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 90, 21, 0.0F, -0.5135F, -3.1F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 90, 33, -1.0F, -0.5135F, -2.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 26, 92, -1.0F, -0.5135F, -3.1F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 98, 2, 0.0F, -0.5135F, -1.5F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 101, 88, 0.0F, -0.5135F, -1.1F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 98, 101, -1.0F, -0.5135F, -1.1F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 33, 104, -1.0F, -0.5135F, -1.5F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 78, 17, 0.0F, -0.5135F, -5.9F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 12, 82, 0.0F, -0.5135F, -6.3F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 84, 21, -1.0F, -0.5135F, -5.9F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 84, 23, -1.0F, -0.5135F, -6.3F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 64, 68, 0.0F, -0.5135F, -6.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 77, 10, -1.0F, -0.5135F, -6.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 41, 85, 0.0F, -0.5135F, -4.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 81, 85, 0.0F, -0.5135F, -4.3F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 34, 88, -1.0F, -0.5135F, -4.3F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 90, 0, -1.0F, -0.5135F, -4.7F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 33, 106, 0.0F, -0.5135F, 0.5F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 110, 37, 0.0F, -0.5135F, 0.1F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 110, 39, -1.0F, -0.5135F, 0.5F, 1, 1, 1, -0.301F, false));
		railmount.cubeList.add(new ModelBox(railmount, 110, 60, -1.0F, -0.5135F, 0.1F, 1, 1, 1, -0.301F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.6637F, 14.5218F, 6.5F);
		railmount.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.2793F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(5.0637F, 14.5218F, 6.5F);
		railmount.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.2793F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(5.0637F, 14.5218F, 6.5F);
		railmount.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.5236F, 0.0F, -0.2793F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.6637F, 14.5218F, 6.5F);
		railmount.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.5236F, 0.0F, 0.2793F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.6637F, 14.5218F, 5.5F);
		railmount.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.4712F, 0.0F, 0.2793F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(4.3637F, 18.7218F, 33.5F);
		railmount.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.2269F, 0.0F, 0.0F);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(3.1637F, 13.8218F, 13.8F);
		railmount.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.8029F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 110, 98, -13.0804F, -7.2698F, -13.3F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 110, 78, -13.0804F, -7.2698F, -13.7F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 89, 89, -13.0804F, -7.2698F, -18.1F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 89, 42, -13.0804F, -7.2698F, -18.5F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 63, -13.0804F, -7.2698F, -20.5F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 84, 33, -13.0804F, -7.2698F, -20.1F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 84, 31, -13.0804F, -7.2698F, -19.7F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 98, 103, -13.0804F, -7.2698F, -14.9F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 101, 98, -13.0804F, -7.2698F, -15.3F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 98, 0, -13.0804F, -7.2698F, -16.9F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 92, -13.0804F, -7.2698F, -16.5F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 73, 114, -13.0804F, -7.2698F, -12.1F, 1, 1, 1, -0.302F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 49, 114, -13.0804F, -7.2698F, -11.7F, 1, 1, 1, -0.302F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(4.5637F, 13.8218F, 13.8F);
		railmount.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.8029F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 109, 11, 6.7128F, -12.8287F, -13.3F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 106, 6.7128F, -12.8287F, -13.7F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 90, 10, 6.7128F, -12.8287F, -18.1F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 90, 2, 6.7128F, -12.8287F, -18.5F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 65, 75, 6.7128F, -12.8287F, -20.5F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 84, 12, 6.7128F, -12.8287F, -19.7F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 84, 10, 6.7128F, -12.8287F, -20.1F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 59, 104, 6.7128F, -12.8287F, -14.9F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 104, 6.7128F, -12.8287F, -15.3F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 90, 31, 6.7128F, -12.8287F, -16.5F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 90, 23, 6.7128F, -12.8287F, -16.9F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 49, 112, 6.7128F, -12.8287F, -11.7F, 1, 1, 1, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 98, 111, 6.7128F, -12.8287F, -12.1F, 1, 1, 1, -0.302F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(1.6137F, 16.8718F, 18.5F);
		railmount.addChild(gun27);
		setRotationAngle(gun27, -0.0873F, 0.0F, 0.0F);
		

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(1.6137F, 17.3718F, 24.45F);
		railmount.addChild(gun30);
		setRotationAngle(gun30, -0.8198F, -0.0596F, 0.0638F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railmount.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}