package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBU191Barrel extends ModelBase {
	private final ModelRenderer barrelQBU;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;

	public QBU191Barrel() {
		textureWidth = 416;
		textureHeight = 416;

		barrelQBU = new ModelRenderer(this);
		barrelQBU.setRotationPoint(0.0F, 23.5F, -45.5F);
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 0, 0, -2.0F, -35.0F, -43.4F, 1, 1, 61, -0.1F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 124, 0, -2.5657F, -35.5657F, -43.4F, 1, 1, 61, -0.1F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 124, 62, -1.4343F, -35.5657F, -43.4F, 1, 1, 61, -0.1F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 124, 186, -2.0F, -36.1314F, -43.4F, 1, 1, 61, -0.1F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 0, 248, -2.0F, -37.7314F, -27.4F, 1, 1, 45, -0.1F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 130, 400, -2.0F, -38.5314F, -28.1F, 1, 2, 1, -0.1F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 402, 49, -2.0F, -34.8422F, -41.2F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 402, 53, -2.7071F, -35.5493F, -41.2F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 402, 57, -2.0F, -36.2564F, -41.2F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 402, 59, -2.0F, -34.8422F, -42.45F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 402, 63, -2.7071F, -35.5493F, -42.45F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 402, 67, -2.0F, -36.2564F, -42.45F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 360, 193, -2.0F, -36.2564F, -47.7F, 1, 1, 5, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 388, 0, -2.7071F, -35.5493F, -47.7F, 1, 1, 5, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 388, 6, -1.2929F, -35.5493F, -47.7F, 1, 1, 5, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 68, 402, -1.2929F, -35.5493F, -42.45F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 402, 69, -1.2929F, -35.5493F, -41.2F, 1, 1, 1, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 158, 388, -2.0F, -34.8422F, -47.7F, 1, 1, 5, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 56, 349, -1.5757F, -37.7321F, -27.5F, 1, 1, 7, -0.2F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 384, 170, -2.0F, -38.1564F, -27.5F, 1, 1, 7, -0.2F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 384, 186, -2.4243F, -37.7321F, -27.5F, 1, 1, 7, -0.2F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 384, 244, -2.0F, -37.3078F, -27.5F, 1, 1, 7, -0.2F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 278, 397, -2.0F, -36.2564F, -29.8F, 1, 1, 2, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 170, 388, -2.5F, -37.2564F, -26.8F, 2, 2, 4, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 296, 397, -1.2929F, -35.5493F, -29.8F, 1, 1, 2, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 302, 397, -2.7071F, -35.5493F, -29.8F, 1, 1, 2, 0.0F, false));
		barrelQBU.cubeList.add(new ModelBox(barrelQBU, 398, 29, -2.0F, -34.8422F, -29.8F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.2929F, -34.5493F, -72.8F);
		barrelQBU.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 398, 26, -1.0F, -1.0F, 43.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 388, 18, -1.0F, -1.0F, 25.1F, 1, 1, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 402, -1.0F, -1.0F, 30.35F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 402, 51, -1.0F, -1.0F, 31.6F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.2929F, -34.5493F, -72.8F);
		barrelQBU.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 398, -1.0F, -1.0F, 43.0F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 388, 12, -1.0F, -1.0F, 25.1F, 1, 1, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 402, 61, -1.0F, -1.0F, 30.35F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 402, -1.0F, -1.0F, 31.6F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.2929F, -35.5493F, -72.8F);
		barrelQBU.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 290, 397, -1.0F, -1.0F, 43.0F, 1, 1, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 385, -1.0F, -1.0F, 25.1F, 1, 1, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 402, -1.0F, -1.0F, 30.35F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 402, 55, -1.0F, -1.0F, 31.6F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2929F, -35.5493F, -72.8F);
		barrelQBU.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 284, 397, -1.0F, -1.0F, 43.0F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 193, -1.0F, -1.0F, 25.1F, 1, 1, 5, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 402, 65, -1.0F, -1.0F, 30.35F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 402, -1.0F, -1.0F, 31.6F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0929F, -36.9321F, -72.5F);
		barrelQBU.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 384, 236, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0929F, -37.5321F, -72.5F);
		barrelQBU.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 384, 178, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.4929F, -36.9321F, -72.5F);
		barrelQBU.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 384, 162, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.4929F, -37.5321F, -72.5F);
		barrelQBU.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 384, 154, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.3929F, -35.4657F, -27.4F);
		barrelQBU.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 186, -1.0F, -1.0F, -16.0F, 1, 1, 61, -0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.1929F, -35.4657F, -27.4F);
		barrelQBU.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 124, 124, -1.0F, -1.0F, -16.0F, 1, 1, 61, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.3929F, -34.6657F, -27.4F);
		barrelQBU.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 124, -1.0F, -1.0F, -16.0F, 1, 1, 61, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.1929F, -34.6657F, -27.4F);
		barrelQBU.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 62, -1.0F, -1.0F, -16.0F, 1, 1, 61, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelQBU.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}