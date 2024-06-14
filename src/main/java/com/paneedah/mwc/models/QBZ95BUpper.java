package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95BUpper extends ModelBase {
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
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer upperhandguard;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r16;

	public QBZ95BUpper() {
		textureWidth = 512;
		textureHeight = 512;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 123, 74, -3.2858F, -45.55F, 10.2F, 3, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 197, 197, -3.5858F, -46.6625F, -10.0002F, 1, 2, 20, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 205, 102, -0.4392F, -46.6625F, -10.0002F, 1, 2, 20, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 20, 16, -3.5858F, -45.6625F, -16.4002F, 1, 1, 7, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 117, 80, -3.4392F, -45.6625F, -16.4002F, 4, 1, 7, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 41, 69, -3.5392F, -45.6625F, -10.0002F, 4, 1, 7, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 157, 76, -3.5858F, -47.0625F, 4.6998F, 1, 1, 4, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 157, 149, -0.4392F, -47.0625F, 4.6998F, 1, 1, 4, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 134, 34, -2.7392F, -45.55F, 10.2F, 3, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 0, -2.7392F, -45.15F, 8.0F, 3, 7, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 24, 0, -3.2858F, -45.15F, 8.0F, 3, 7, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5125F, -41.9086F, -16.2803F);
		carryhandle.addChild(cube_r1);
		setRotationAngle(cube_r1, -2.9671F, 0.0F, 3.1416F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 59, -1.7733F, -3.2414F, -0.7197F, 3, 7, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 56, -1.2267F, -3.2414F, -0.7197F, 3, 7, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.2125F, -47.4089F, 10.3212F);
		carryhandle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6981F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 144, 161, 0.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.8125F, -47.4089F, 10.3212F);
		carryhandle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 137, 161, -1.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.8125F, -47.5148F, 10.0976F);
		carryhandle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 142, -1.7733F, -0.3F, -24.8F, 1, 1, 5, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 137, 141, -1.7733F, -0.6F, -26.5F, 1, 1, 6, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 166, -1.7733F, -1.0F, -26.9F, 1, 1, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 142, -1.7733F, -1.0F, -26.5F, 1, 1, 6, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.2125F, -47.5148F, 10.0976F);
		carryhandle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 140, 0.7733F, -0.3F, -24.9F, 1, 1, 5, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 102, 140, 0.7733F, -0.6F, -26.5F, 1, 1, 6, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 75, 166, 0.7733F, -1.0F, -26.9F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 111, 143, 0.7733F, -1.0F, -26.5F, 1, 1, 6, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.8125F, -47.4625F, 9.4998F);
		carryhandle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 193, 36, -1.7733F, -1.0F, -20.5F, 1, 2, 21, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.2125F, -47.4625F, 9.4998F);
		carryhandle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 189, 0.7733F, -1.0F, -20.5F, 1, 2, 21, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.2125F, -47.8029F, 10.2625F);
		carryhandle.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.309F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 158, 161, 0.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.8125F, -47.8029F, 10.2625F);
		carryhandle.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.309F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 151, 161, -1.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.8125F, -45.1963F, 11.13F);
		carryhandle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 100, 0, -1.7733F, -3.0F, -2.5F, 1, 3, 3, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.2125F, -45.1963F, 11.13F);
		carryhandle.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 67, 0.7733F, -3.0F, -2.5F, 1, 3, 3, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5125F, -43.5109F, 11.5034F);
		carryhandle.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 132, 74, -1.7733F, -2.0F, -0.5F, 3, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 87, 128, -1.2267F, -2.0F, -0.5F, 3, 2, 1, 0.0F, false));

		upperhandguard = new ModelRenderer(this);
		upperhandguard.setRotationPoint(0.0F, 0.0F, 0.0F);
		carryhandle.addChild(upperhandguard);
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 0, 120, -0.7071F, -38.9071F, -20.7F, 1, 2, 32, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 117, 90, -3.2929F, -38.9071F, -20.7F, 1, 2, 32, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 45, 166, -0.7321F, -39.6071F, -20.7F, 1, 1, 1, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 113, 151, -2.5071F, -39.6071F, -21.0F, 2, 1, 1, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 65, 166, -3.2929F, -39.6071F, -20.7F, 1, 1, 1, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 35, 166, -0.7321F, -39.6071F, -21.0F, 1, 1, 1, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 40, 166, -3.2929F, -39.6071F, -21.0F, 1, 1, 1, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 137, 125, -0.7071F, -38.9071F, -21.0F, 1, 2, 1, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 137, 133, -3.2929F, -38.9071F, -21.0F, 1, 2, 1, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 35, 155, -3.4929F, -38.8071F, -16.0F, 1, 1, 27, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 35, 122, -0.4929F, -38.8071F, -16.0F, 1, 1, 27, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 8, 155, -0.4929F, -39.6071F, 8.0F, 1, 1, 3, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 21, 155, -3.4929F, -39.6071F, 8.0F, 1, 1, 3, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5125F, -41.9086F, -16.2803F);
		upperhandguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 2.5307F, 0.0F, -3.1416F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 150, 74, 0.7733F, -2.066F, -3.8695F, 1, 1, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 99, 14, -1.7733F, -2.066F, -3.8695F, 3, 1, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 152, 90, -1.7733F, 1.4695F, 0.866F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 150, 58, 0.7733F, 1.4695F, 0.866F, 1, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.4929F, -44.1964F, 7.9393F);
		upperhandguard.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 160, 139, -1.7929F, -1.0F, -1.1F, 1, 1, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 160, 115, 0.7537F, -1.0F, -1.1F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.5321F, -39.1964F, 7.9393F);
		upperhandguard.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 140, 0.7929F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 129, 139, -1.7537F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.1794F, -38.0851F, -25.2F);
		upperhandguard.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.1309F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.8206F, -38.0851F, -25.2F);
		upperhandguard.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.1309F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.5F, -37.7017F, -35.489F);
		upperhandguard.addChild(bone8);
		setRotationAngle(bone8, 1.0908F, 0.0F, 0.0F);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.0125F, 13.9935F, 9.6455F);
		bone8.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 82, 82, 0.8733F, -0.0993F, -1.1935F, 1, 2, 4, -0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 53, -1.8733F, -0.0993F, -1.1935F, 1, 2, 4, -0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 59, 0, 0.8733F, -0.9993F, -1.4935F, 1, 2, 8, -0.1F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 42, -1.8733F, -0.9993F, -1.4935F, 1, 2, 8, -0.1F, false));
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