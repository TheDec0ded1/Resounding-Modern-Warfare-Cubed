package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QCW05Upper extends ModelBase {
	private final ModelRenderer carry_handle;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer carryhandle;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer upperhandguard;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer carryhandle2;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer upperhandguard2;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public QCW05Upper() {
		textureWidth = 320;
		textureHeight = 320;

		carry_handle = new ModelRenderer(this);
		carry_handle.setRotationPoint(0.0F, 25.0F, 0.0F);
		carry_handle.cubeList.add(new ModelBox(carry_handle, 236, 284, -0.7515F, -45.09F, 2.3F, 1, 7, 3, 0.0F, false));
		carry_handle.cubeList.add(new ModelBox(carry_handle, 297, 193, -3.2485F, -45.1356F, 4.8209F, 3, 1, 1, 0.0F, false));
		carry_handle.cubeList.add(new ModelBox(carry_handle, 70, 302, -0.7515F, -45.1356F, 4.8209F, 1, 1, 1, 0.0F, false));
		carry_handle.cubeList.add(new ModelBox(carry_handle, 40, 285, -3.2485F, -45.09F, 2.3F, 1, 7, 3, 0.0F, false));
		carry_handle.cubeList.add(new ModelBox(carry_handle, 41, 231, -3.2485F, -40.19F, -15.7F, 1, 1, 18, 0.0F, false));
		carry_handle.cubeList.add(new ModelBox(carry_handle, 217, 42, -0.7515F, -40.19F, -15.7F, 1, 1, 18, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5485F, -44.7186F, 5.1837F);
		carry_handle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 296, -1.0F, -3.6F, -1.0F, 1, 4, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 296, 2.0969F, -3.6F, -1.0F, 1, 4, 2, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5724F, -39.4935F, -14.7F);
		carry_handle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.9599F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 300, 221, -1.0F, -2.0F, -10.0F, 1, 2, 1, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.1798F, -40.3126F, -14.7F);
		carry_handle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.9599F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 232, 300, -1.0F, -2.0F, -10.0F, 1, 2, 1, 0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.1159F, -38.3917F, -14.7F);
		carry_handle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 237, 300, -1.0F, -2.0F, -10.0F, 1, 2, 1, 0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.1758F, -37.9691F, -14.7F);
		carry_handle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 300, 284, -1.0F, -2.0F, -10.0F, 1, 2, 1, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.1548F, -39.9126F, -14.7F);
		carry_handle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.9599F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 98, 268, -1.0F, -2.0F, -10.0F, 1, 2, 8, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.5812F, -39.0935F, -14.7F);
		carry_handle.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.9599F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 117, 268, -1.0F, -2.0F, -10.0F, 1, 2, 8, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, -38.1F, -14.7F);
		carry_handle.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.4363F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 154, 33, -1.0F, -2.0F, -10.0F, 1, 2, 30, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.0937F, -37.6774F, -14.7F);
		carry_handle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.4363F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 154, 0, -1.0F, -2.0F, -10.0F, 1, 2, 30, 0.0F, false));

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, -20.0F, 0.0F);
		carry_handle.addChild(carryhandle);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 187, 231, -0.4392F, -25.8625F, -13.3002F, 1, 2, 16, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 113, 288, -0.4485F, -28.39F, 2.0F, 1, 4, 3, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 298, 210, -0.4485F, -28.39F, 3.6F, 1, 1, 2, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 153, 278, -3.4392F, -24.8625F, -11.7002F, 4, 1, 5, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 287, 264, -0.4392F, -26.2625F, -2.6002F, 1, 1, 4, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5248F, -23.2439F, 0.0427F);
		carryhandle.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.0036F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 297, 233, 1.0733F, -1.0F, 3.6F, 1, 2, 2, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.4892F, -22.199F, -13.6474F);
		carryhandle.addChild(cube_r12);
		setRotationAngle(cube_r12, 1.0908F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 157, 268, -1.75F, 0.5F, -4.5F, 1, 1, 8, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 82, 221, -1.35F, 0.5F, -4.5F, 3, 1, 8, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 251, 1.05F, -1.5F, -4.0F, 1, 3, 8, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.2125F, -26.6625F, 2.1998F);
		carryhandle.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 152, 231, 0.7733F, -1.0F, -15.5F, 1, 2, 16, -0.3F, false));

		upperhandguard = new ModelRenderer(this);
		upperhandguard.setRotationPoint(0.0F, 0.0F, 0.0F);
		carryhandle.addChild(upperhandguard);
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 28, 286, -0.4929F, -25.9071F, 2.7F, 1, 8, 2, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 113, 250, -0.1929F, -26.302F, -10.9719F, 1, 2, 15, -0.4F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.3071F, -26.4414F, 2.4259F);
		upperhandguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 80, 250, -0.5F, -1.0F, -13.5F, 1, 2, 15, -0.4F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0071F, -25.8671F, 3.3585F);
		upperhandguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.6981F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 197, 297, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0071F, -19.9071F, 1.9F);
		upperhandguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.4363F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 106, 209, -0.5F, 0.5F, -19.0F, 1, 1, 20, -0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 283, 297, -0.5F, -0.5F, 0.8F, 1, 2, 2, -0.1F, false));

		carryhandle2 = new ModelRenderer(this);
		carryhandle2.setRotationPoint(-12.0F, 0.0F, 0.0F);
		carryhandle.addChild(carryhandle2);
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 0, 232, 8.4608F, -25.8625F, -13.3002F, 1, 2, 16, -0.3F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 7, 287, 8.4515F, -28.39F, 2.0F, 1, 4, 3, -0.3F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 215, 298, 8.4515F, -28.39F, 3.6F, 1, 1, 2, -0.3F, false));
		carryhandle2.cubeList.add(new ModelBox(carryhandle2, 287, 270, 8.4608F, -26.2625F, -2.6002F, 1, 1, 4, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(7.3783F, -23.2439F, 0.0427F);
		carryhandle2.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.0036F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 297, 238, 1.0733F, -1.0F, 3.6F, 1, 2, 2, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(10.5108F, -22.199F, -13.6474F);
		carryhandle2.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.0908F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 263, -2.05F, -1.5F, -4.0F, 1, 3, 8, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(7.6875F, -26.6625F, 2.1998F);
		carryhandle2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 222, 231, 0.7733F, -1.0F, -15.5F, 1, 2, 16, -0.3F, false));

		upperhandguard2 = new ModelRenderer(this);
		upperhandguard2.setRotationPoint(0.0F, 0.0F, 0.0F);
		carryhandle2.addChild(upperhandguard2);
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 0, 287, 8.5071F, -25.9071F, 2.7F, 1, 8, 2, -0.1F, false));
		upperhandguard2.cubeList.add(new ModelBox(upperhandguard2, 179, 250, 8.2071F, -26.302F, -10.9719F, 1, 2, 15, -0.4F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(8.7071F, -26.4414F, 2.4259F);
		upperhandguard2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 146, 250, -0.5F, -1.0F, -13.5F, 1, 2, 15, -0.4F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(9.0071F, -25.8671F, 3.3585F);
		upperhandguard2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.6981F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 297, 228, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.1F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(9.0071F, -19.9071F, 1.9F);
		upperhandguard2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.4363F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 149, 209, -0.5F, 0.5F, -19.0F, 1, 1, 20, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 298, -0.5F, -0.5F, 0.8F, 1, 2, 2, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		carry_handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}