package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class grozaSilencer extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
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

	public grozaSilencer() {
		textureWidth = 512;
		textureHeight = 256;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(0.0F, 24.0F, 0.0F);
		suppressor.cubeList.add(new ModelBox(suppressor, 142, 13, -2.5F, -38.2F, -25.0F, 2, 6, 7, 0.0F, false));
		suppressor.cubeList.add(new ModelBox(suppressor, 114, 0, -2.5F, -38.2F, -44.5F, 2, 6, 28, -0.6F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-12.7187F, 26.3932F, 1.5F);
		suppressor.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 114, 0, 50.5F, -38.2F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-13.4459F, 27.1204F, 1.5F);
		suppressor.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 114, 0, 50.5F, -38.2F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.9492F, 25.1627F, 1.5F);
		suppressor.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 0, 50.5F, -34.3F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-14.6764F, 25.8899F, 1.5F);
		suppressor.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 114, 0, 50.5F, -34.3F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.3444F, 13.869F, 1.5F);
		suppressor.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 114, 0, -36.5F, -34.3F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0716F, 13.1418F, 1.5F);
		suppressor.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 114, 0, -36.5F, -34.3F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5749F, 15.0996F, 1.5F);
		suppressor.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 114, 0, -36.5F, -38.2F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.3021F, 14.3723F, 1.5F);
		suppressor.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 114, 0, -36.5F, -38.2F, -46.0F, 3, 3, 28, -0.6F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -35.2F, -17.5F);
		suppressor.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.5708F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 114, 0, -1.0F, -3.0F, -27.0F, 2, 6, 28, -0.6F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 142, 13, -1.0F, -3.0F, -7.5F, 2, 6, 7, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-14.0765F, 25.6413F, 0.0F);
		suppressor.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 142, 13, 50.5F, -34.3F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-14.1978F, 25.7627F, 0.0F);
		suppressor.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 142, 13, 51.5F, -34.3F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-13.1974F, 26.5204F, 0.0F);
		suppressor.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 142, 13, 50.5F, -38.2F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-13.3187F, 26.6417F, 0.0F);
		suppressor.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 142, 13, 51.5F, -38.2F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.823F, 13.7418F, 0.0F);
		suppressor.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 142, 13, -36.5F, -34.3F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.9444F, 13.6205F, 0.0F);
		suppressor.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 142, 13, -35.5F, -34.3F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.8234F, 14.4996F, 0.0F);
		suppressor.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 142, 13, -35.5F, -38.2F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.7021F, 14.6209F, 0.0F);
		suppressor.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 142, 13, -36.5F, -38.2F, -25.0F, 2, 3, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}