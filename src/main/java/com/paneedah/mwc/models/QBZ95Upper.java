package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95Upper extends ModelBase {
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
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r20;

	public QBZ95Upper() {
		textureWidth = 464;
		textureHeight = 464;

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 439, 133, -3.2858F, -45.55F, 10.2F, 3, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 45, 368, -3.5858F, -46.6625F, -10.0002F, 1, 2, 20, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 241, 359, -0.4392F, -46.6625F, -10.0002F, 1, 2, 20, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 400, 437, -3.5858F, -45.6625F, -12.4002F, 1, 1, 3, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 423, 301, -3.4392F, -45.6625F, -12.4002F, 4, 1, 3, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 335, 285, -3.5392F, -45.6625F, -10.0002F, 4, 1, 7, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 430, 276, -3.5858F, -47.0625F, 4.6998F, 1, 1, 4, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 429, 177, -0.4392F, -47.0625F, 4.6998F, 1, 1, 4, -0.3F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 9, 439, -2.7392F, -45.55F, 10.2F, 3, 2, 1, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 25, 413, -2.7392F, -45.15F, 8.0F, 3, 7, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 307, 344, -3.2858F, -45.15F, 8.0F, 3, 7, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.2125F, -47.4089F, 10.3212F);
		carryhandle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 442, 3, 0.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 442, 7, -2.3733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5125F, -41.466F, -13.9378F);
		carryhandle.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 442, 41, 1.0733F, -0.7F, 3.6F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 442, 26, 1.0733F, -1.0F, 3.6F, 1, 1, 2, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5125F, -40.96F, -14.2602F);
		carryhandle.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.0036F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 442, 45, -2.0733F, -0.7F, 4.2F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 442, 11, -2.0733F, -1.0F, 4.2F, 1, 1, 2, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.3125F, -40.6839F, -14.199F);
		carryhandle.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.0036F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 171, 416, -2.0733F, -1.0F, -2.8F, 2, 1, 8, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.7125F, -41.1899F, -13.8766F);
		carryhandle.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.0036F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 287, 416, 0.0733F, -1.0F, -3.4F, 2, 1, 8, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5125F, -45.1254F, -11.4763F);
		carryhandle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6109F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 433, -2.0733F, -0.25F, -2.2F, 2, 1, 3, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 429, 52, -0.9267F, -0.25F, -2.2F, 3, 1, 3, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.8125F, -47.4625F, 9.4998F);
		carryhandle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 341, 141, -1.7733F, -1.0F, -21.5F, 1, 2, 22, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 341, 166, 1.3733F, -1.0F, -21.5F, 1, 2, 22, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.2125F, -47.8029F, 10.2625F);
		carryhandle.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.309F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 441, 388, 0.7733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 441, 439, -2.3733F, -1.0F, -1.5F, 1, 1, 2, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.8125F, -45.1963F, 11.13F);
		carryhandle.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 432, 380, -1.7733F, -3.0F, -2.5F, 1, 3, 3, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 432, 387, 1.3733F, -3.0F, -2.5F, 1, 3, 3, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5125F, -43.5109F, 11.5034F);
		carryhandle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 439, -1.7733F, -2.0F, -0.5F, 3, 2, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 131, 445, 0.7733F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

		upperhandguard = new ModelRenderer(this);
		upperhandguard.setRotationPoint(0.0F, 0.0F, 0.0F);
		carryhandle.addChild(upperhandguard);
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 323, 294, -0.7071F, -38.9071F, -16.7F, 1, 2, 28, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 323, 325, -3.2929F, -38.9071F, -16.7F, 1, 2, 28, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 335, 256, -3.4929F, -38.8071F, -16.0F, 1, 1, 27, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 341, 0, -0.4929F, -38.8071F, -16.0F, 1, 1, 27, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 418, 428, -0.4929F, -45.6071F, 8.0F, 1, 7, 3, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 428, 357, -3.4929F, -45.6071F, 8.0F, 1, 7, 3, -0.1F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 388, 141, -1.906F, -39.2523F, -35.0F, 1, 1, 19, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 388, 162, -2.094F, -39.2523F, -35.0F, 1, 1, 19, 0.0F, false));
		upperhandguard.cubeList.add(new ModelBox(upperhandguard, 431, 255, -2.5F, -39.8933F, -35.0009F, 2, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -39.2661F, -32.3274F);
		upperhandguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 244, 443, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -37.7017F, -17.489F);
		upperhandguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.6545F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 438, 218, 0.7929F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 438, 223, -1.7929F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.4929F, -44.1964F, 7.9393F);
		upperhandguard.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 442, 49, -1.7929F, -1.0F, -1.1F, 1, 1, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 442, 53, 0.7537F, -1.0F, -1.1F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.5321F, -39.1964F, 7.9393F);
		upperhandguard.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 136, 445, 0.7929F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 141, 445, -1.7537F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.3071F, -46.8414F, 8.6259F);
		upperhandguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 396, 101, -0.5F, -1.0F, -13.5F, 1, 2, 15, -0.4F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 396, 83, -4.1F, -1.0F, -13.5F, 1, 2, 15, -0.4F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.3071F, -46.3683F, 9.2125F);
		upperhandguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.6981F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 257, 434, -0.5F, -1.0F, -1.5F, 1, 2, 3, -0.4F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 248, 434, -4.1F, -1.0F, -1.5F, 1, 2, 3, -0.4F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.3071F, -45.6405F, 9.6541F);
		upperhandguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 266, 434, -0.5F, -1.0F, -1.5F, 1, 2, 3, -0.4F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 239, 434, -4.1F, -1.0F, -1.5F, 1, 2, 3, -0.4F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.3071F, -46.4183F, 8.7125F);
		upperhandguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.6981F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 237, 440, -0.5F, -1.0F, -1.5F, 1, 2, 2, -0.4F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 230, 440, -4.1F, -1.0F, -1.5F, 1, 2, 2, -0.4F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.1794F, -38.0851F, -25.2F);
		upperhandguard.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.1309F);
		bone.cubeList.add(new ModelBox(bone, 396, 29, -0.5851F, 0.2362F, -9.8F, 1, 1, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 445, -0.2851F, -0.8638F, 3.6F, 1, 2, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 447, 125, -0.5851F, -0.5638F, 1.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 445, 104, -0.2851F, -0.8638F, -1.5F, 1, 2, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 126, 447, -0.5851F, -0.5638F, -3.9F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 445, 112, -0.2851F, -0.8638F, -6.3F, 1, 2, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 447, 119, -0.5851F, -0.5638F, -9.8F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 440, 426, -0.5851F, -0.5638F, -9.6F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 440, 345, -0.5851F, -0.5638F, 6.2F, 1, 1, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.0009F, -0.0306F, 0.45F);
		bone.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.9599F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 155, 359, 0.0752F, -1.5652F, -10.65F, 1, 2, 20, -0.4F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.8206F, -38.0851F, -25.2F);
		upperhandguard.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.1309F);
		bone2.cubeList.add(new ModelBox(bone2, 440, 341, -0.4149F, -0.5638F, 6.2F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 352, -0.4149F, 0.2362F, -9.8F, 1, 1, 16, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 38, 445, -0.7149F, -0.8638F, 3.6F, 1, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 447, 122, -0.4149F, -0.5638F, 1.0F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 96, 445, -0.7149F, -0.8638F, -1.5F, 1, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 447, 145, -0.4149F, -0.5638F, -3.9F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 445, 108, -0.7149F, -0.8638F, -6.3F, 1, 2, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 121, 447, -0.4149F, -0.5638F, -9.8F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 440, 430, -0.4149F, -0.5638F, -9.6F, 1, 1, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0009F, -0.0306F, 0.45F);
		bone2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.9599F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 198, 359, -1.0753F, -1.5652F, -10.65F, 1, 2, 20, -0.4F, false));
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