package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBB95Upper extends ModelBase {
	private final ModelRenderer carryhandle;
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
	private final ModelRenderer upperhandguard;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public QBB95Upper() {
		textureWidth = 480;
		textureHeight = 480;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 453, 134, -3.2858F, -45.55F, 10.2F, 3, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 389, 159, -3.5858F, -46.6625F, -10.0002F, 1, 2, 20, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 389, 136, -0.4392F, -46.6625F, -10.0002F, 1, 2, 20, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 452, 316, -3.5858F, -45.6625F, -12.4002F, 1, 1, 3, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 432, 177, -3.4392F, -45.6625F, -12.4002F, 4, 1, 3, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 431, 338, -3.5392F, -45.6625F, -10.0002F, 4, 1, 7, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 290, 450, -3.5858F, -47.0625F, 4.6998F, 1, 1, 4, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 279, 450, -0.4392F, -47.0625F, 4.6998F, 1, 1, 4, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 453, 126, -2.7392F, -45.55F, 10.2F, 3, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 30, 443, -0.7392F, -45.15F, 8.0F, 1, 7, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 314, 431, -3.2858F, -45.15F, 8.0F, 3, 7, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.2125F, -47.4089F, 10.3212F);
		carryhandle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 288, 459, 0.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 459, 346, -2.3733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5125F, -40.96F, -14.2602F);
		carryhandle.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 459, 350, -2.0733F, -1.8F, 3.6F, 1, 1, 2, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5125F, -41.466F, -13.9378F);
		carryhandle.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.0036F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 395, 459, 1.0733F, -1.8F, 3.0F, 1, 1, 2, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.3125F, -40.6839F, -14.199F);
		carryhandle.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.0036F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 432, -2.0733F, -1.8F, -3.8F, 1, 1, 9, -0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 432, 167, -2.0733F, -1.0F, -2.8F, 2, 1, 8, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.7125F, -41.1899F, -13.8766F);
		carryhandle.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.0036F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 432, 145, 1.0733F, -1.8F, -4.4F, 1, 1, 9, -0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 186, 432, 0.0733F, -1.0F, -3.4F, 2, 1, 8, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5125F, -45.1254F, -11.4763F);
		carryhandle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6109F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 451, 73, -2.0733F, -0.25F, -2.2F, 2, 1, 3, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 449, 234, -0.9267F, -0.25F, -2.2F, 3, 1, 3, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.8125F, -47.4625F, 9.4998F);
		carryhandle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 179, 363, -1.7733F, -1.0F, -22.5F, 1, 2, 23, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 378, 362, 1.3733F, -1.0F, -22.5F, 1, 2, 23, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.2125F, -47.8029F, 10.2625F);
		carryhandle.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.309F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 274, 459, 0.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 281, 459, -2.3733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.8125F, -45.1963F, 11.13F);
		carryhandle.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 451, 66, -1.7733F, -3.0F, -2.5F, 1, 3, 3, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 451, 1.3733F, -3.0F, -2.5F, 1, 3, 3, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5125F, -43.5109F, 11.5034F);
		carryhandle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 453, 130, -1.7733F, -2.0F, -0.5F, 3, 2, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 64, 461, 0.7733F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

		upperhandguard = new ModelRenderer(this);
		upperhandguard.setRotationPoint(0.0F, 0.0F, 0.0F);
		carryhandle.addChild(upperhandguard);
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 61, 363, -0.7071F, -38.9071F, -16.7F, 1, 2, 28, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 120, 363, -3.2929F, -38.9071F, -16.7F, 1, 2, 28, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 304, 456, -3.2929F, -38.9071F, -35.0F, 1, 2, 2, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 297, 456, -0.7071F, -38.9071F, -35.0F, 1, 2, 2, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 29, 417, -3.2929F, -37.9071F, -33.0F, 1, 1, 13, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 0, 417, -0.7071F, -37.9071F, -33.0F, 1, 1, 13, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 346, 456, -0.7071F, -38.9071F, -30.0F, 1, 2, 2, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 339, 456, -3.2929F, -38.9071F, -30.0F, 1, 2, 2, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 360, 456, -0.7071F, -38.9071F, -25.0F, 1, 2, 2, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 353, 456, -3.2929F, -38.9071F, -25.0F, 1, 2, 2, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 449, 443, -0.7071F, -38.9071F, -20.0F, 1, 2, 4, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 408, 449, -3.2929F, -38.9071F, -20.0F, 1, 2, 4, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 389, 46, -2.3715F, -39.8612F, -35.4F, 2, 1, 20, -0.4F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 389, 68, -2.6285F, -39.8612F, -35.4F, 2, 1, 20, -0.4F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 449, 188, -3.0F, -39.8933F, -35.0009F, 3, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -39.2661F, -32.3274F);
		upperhandguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 288, 456, -1.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -37.7017F, -17.489F);
		upperhandguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.6545F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 453, 24, 0.7929F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 453, 29, -1.7929F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.4929F, -44.1964F, 7.9393F);
		upperhandguard.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 459, 397, -1.7929F, -1.0F, -1.1F, 1, 1, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 402, 459, 0.7537F, -1.0F, -1.1F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.5321F, -39.1964F, 7.9393F);
		upperhandguard.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 222, 461, 0.7929F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 227, 461, -1.7537F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.7145F, -39.0955F, -25.9F);
		upperhandguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 1.0908F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 179, 389, -0.5F, -1.0F, -9.5F, 1, 2, 20, -0.4F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.2855F, -39.0955F, -25.9F);
		upperhandguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.0908F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 222, 393, -0.5F, -1.0F, -9.5F, 1, 2, 20, -0.4F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		carryhandle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}