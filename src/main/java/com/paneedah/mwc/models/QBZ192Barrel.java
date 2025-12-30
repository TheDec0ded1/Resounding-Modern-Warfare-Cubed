package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ192Barrel extends ModelBase {
	private final ModelRenderer barrelQBZ192;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public QBZ192Barrel() {
		textureWidth = 400;
		textureHeight = 400;

		barrelQBZ192 = new ModelRenderer(this);
		barrelQBZ192.setRotationPoint(0.0F, 23.5F, -45.5F);
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 0, 200, -2.0F, -35.0F, -21.4F, 1, 1, 40, -0.1F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 82, 200, -2.5657F, -35.5657F, -21.4F, 1, 1, 40, -0.1F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 200, 82, -1.4343F, -35.5657F, -21.4F, 1, 1, 40, -0.1F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 0, 241, -2.0F, -36.1314F, -21.4F, 1, 1, 40, -0.1F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 82, 241, -2.0F, -37.7314F, -13.4F, 1, 1, 32, -0.1F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 170, 393, -2.0F, -38.5314F, -14.1F, 1, 2, 1, -0.1F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 326, 395, -2.0F, -34.8422F, -19.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 338, 395, -2.7071F, -35.5493F, -19.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 350, 395, -2.0F, -36.2564F, -19.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 354, 395, -2.0F, -34.8422F, -20.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 366, 395, -2.7071F, -35.5493F, -20.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 378, 395, -2.0F, -36.2564F, -20.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 382, 395, -2.0F, -36.2564F, -21.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 386, 395, -2.7071F, -35.5493F, -21.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 0, 396, -1.2929F, -35.5493F, -21.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 4, 396, -1.2929F, -35.5493F, -20.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 8, 396, -1.2929F, -35.5493F, -19.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 12, 396, -2.0F, -34.8422F, -21.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 16, 396, -2.0F, -36.2564F, -25.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 20, 396, -2.7071F, -35.5493F, -25.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 24, 396, -1.2929F, -35.5493F, -25.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 28, 396, -2.0F, -34.8422F, -25.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 16, 382, -1.5757F, -37.7321F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 64, 382, -2.0F, -38.1564F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 154, 382, -2.4243F, -37.7321F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 218, 382, -2.0F, -37.3078F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 256, 382, -2.0F, -36.2564F, -15.8F, 1, 1, 7, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 376, 384, -2.5F, -37.2564F, -12.8F, 2, 2, 4, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 384, 100, -1.2929F, -35.5493F, -15.8F, 1, 1, 7, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 384, 108, -2.7071F, -35.5493F, -15.8F, 1, 1, 7, 0.0F, false));
		barrelQBZ192.cubeList.add(new ModelBox(barrelQBZ192, 384, 132, -2.0F, -34.8422F, -15.8F, 1, 1, 7, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.2929F, -34.5493F, -58.8F);
		barrelQBZ192.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 384, 124, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 364, 384, -1.0F, -1.0F, 33.1F, 1, 1, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 358, 395, -1.0F, -1.0F, 38.35F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 330, 395, -1.0F, -1.0F, 39.6F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.2929F, -34.5493F, -58.8F);
		barrelQBZ192.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 384, 116, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 372, 100, -1.0F, -1.0F, 33.1F, 1, 1, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 362, 395, -1.0F, -1.0F, 38.35F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 334, 395, -1.0F, -1.0F, 39.6F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.2929F, -35.5493F, -58.8F);
		barrelQBZ192.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 383, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 360, 100, -1.0F, -1.0F, 33.1F, 1, 1, 5, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 370, 395, -1.0F, -1.0F, 38.35F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 342, 395, -1.0F, -1.0F, 39.6F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.2929F, -35.5493F, -58.8F);
		barrelQBZ192.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 272, 382, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 348, 100, -1.0F, -1.0F, 33.1F, 1, 1, 5, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 395, -1.0F, -1.0F, 38.35F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 346, 395, -1.0F, -1.0F, 39.6F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0929F, -36.9321F, -58.5F);
		barrelQBZ192.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 170, 382, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0929F, -37.5321F, -58.5F);
		barrelQBZ192.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 138, 382, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.4929F, -36.9321F, -58.5F);
		barrelQBZ192.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 382, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.4929F, -37.5321F, -58.5F);
		barrelQBZ192.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 382, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.3929F, -35.4657F, -13.4F);
		barrelQBZ192.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 164, 200, -1.0F, -1.0F, -8.0F, 1, 1, 40, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.1929F, -35.4657F, -13.4F);
		barrelQBZ192.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 200, 123, -1.0F, -1.0F, -8.0F, 1, 1, 40, -0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.3929F, -34.6657F, -13.4F);
		barrelQBZ192.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 200, 41, -1.0F, -1.0F, -8.0F, 1, 1, 40, -0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.1929F, -34.6657F, -13.4F);
		barrelQBZ192.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 200, 0, -1.0F, -1.0F, -8.0F, 1, 1, 40, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelQBZ192.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}