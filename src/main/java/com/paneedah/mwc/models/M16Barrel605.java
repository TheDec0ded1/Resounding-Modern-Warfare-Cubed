package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16Barrel605 extends ModelBase {
	private final ModelRenderer barrel605;
	private final ModelRenderer flashider;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer colt_fs;
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
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer pencilbarrel;
	private final ModelRenderer Cube_r20;
	private final ModelRenderer Cube_r21;
	private final ModelRenderer Cube_r22;
	private final ModelRenderer Cube_r23;

	public M16Barrel605() {
		textureWidth = 672;
		textureHeight = 672;

		barrel605 = new ModelRenderer(this);
		barrel605.setRotationPoint(-1.5F, -13.8929F, -38.001F);
		barrel605.cubeList.add(new ModelBox(barrel605, 406, 439, -0.5F, -2.5071F, -25.5F, 1, 1, 42, -0.2F, false));

		flashider = new ModelRenderer(this);
		flashider.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel605.addChild(flashider);
		flashider.cubeList.add(new ModelBox(flashider, 658, 0, 0.0F, -0.2929F, -11.8F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 0, 658, -0.7071F, -1.0F, -11.8F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 656, 657, 0.0F, -1.7071F, -11.8F, 1, 1, 1, 0.0F, false));
		flashider.cubeList.add(new ModelBox(flashider, 652, 657, 0.7071F, -1.0F, -11.8F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, -12.3F);
		flashider.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 378, 643, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, -1.0F, -12.3F);
		flashider.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 414, 643, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0F, -12.3F);
		flashider.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 426, 643, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, -12.3F);
		flashider.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 438, 643, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		colt_fs = new ModelRenderer(this);
		colt_fs.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel605.addChild(colt_fs);
		colt_fs.cubeList.add(new ModelBox(colt_fs, 652, 270, -2.5F, -41.75F, -64.3F, 2, 3, 1, -0.2F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 320, 569, -2.5F, -45.275F, -68.95F, 2, 7, 1, -0.2F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 492, 653, -2.5F, -38.05F, -68.95F, 2, 2, 1, -0.2F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 516, 653, -2.5F, -38.35F, -64.3F, 2, 2, 1, -0.2F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 488, 581, -2.5F, -45.2738F, -67.2568F, 2, 1, 1, -0.2F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 650, 8, -2.5F, -45.2738F, -68.7068F, 2, 2, 2, -0.2F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 548, 657, -1.2929F, -38.5929F, -64.5F, 1, 1, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 20, 656, -2.0F, -40.3F, -64.5F, 1, 2, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 604, 657, -2.7071F, -38.5929F, -64.5F, 1, 1, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 600, 657, -2.0F, -37.8858F, -64.5F, 1, 1, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 648, 657, -1.2929F, -38.5929F, -68.75F, 1, 1, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 78, 656, -2.0F, -40.3F, -68.75F, 1, 2, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 366, 643, -2.0F, -40.5F, -68.55F, 1, 1, 5, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 632, 657, -2.0F, -37.8858F, -68.75F, 1, 1, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 628, 657, -2.7071F, -38.5929F, -68.75F, 1, 1, 1, 0.0F, false));
		colt_fs.cubeList.add(new ModelBox(colt_fs, 656, 81, -2.0F, -46.3F, -68.35F, 1, 2, 1, -0.4F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, -37.5929F, -68.25F);
		colt_fs.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 624, 657, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 620, 657, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0F, -37.5929F, -68.25F);
		colt_fs.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 636, 657, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 560, 657, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -38.5929F, -68.25F);
		colt_fs.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 640, 657, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 556, 657, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -38.5929F, -68.25F);
		colt_fs.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 644, 657, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 552, 657, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -40.8826F, -63.9843F);
		colt_fs.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 616, 635, -1.0F, -5.0F, 0.0F, 2, 5, 1, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.825F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.1309F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 658, 2, -0.5F, -1.0733F, -0.6829F, 1, 1, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.175F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3927F, 0.0F, -0.1309F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 658, 4, -0.5F, -1.0733F, -0.6829F, 1, 1, 1, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.175F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6109F, 0.0F, -0.1309F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 578, 653, -0.5F, -0.3926F, -1.158F, 1, 1, 2, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.825F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.6109F, 0.0F, 0.1309F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 584, 653, -0.5F, -0.3926F, -1.158F, 1, 1, 2, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.175F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.1309F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 334, 652, -0.5F, -0.5403F, -1.1791F, 1, 2, 2, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 82, 656, -0.5F, -1.021F, -0.5801F, 1, 2, 1, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.825F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.1309F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 388, 652, -0.5F, -0.5403F, -1.1791F, 1, 2, 2, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 86, 656, -0.5F, -1.021F, -0.5801F, 1, 2, 1, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.825F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.0908F, 0.0F, 0.1309F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 566, 653, -0.5F, -0.5266F, -1.0051F, 1, 1, 2, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.175F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.0908F, 0.0F, -0.1309F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 572, 653, -0.5F, -0.5266F, -1.0051F, 1, 1, 2, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.175F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.6981F, 0.0F, -0.1309F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 300, 652, -0.5F, -0.4057F, -0.9917F, 1, 2, 2, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.825F, -45.5849F, -67.8314F);
		colt_fs.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.6981F, 0.0F, 0.1309F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 294, 652, -0.5F, -0.4057F, -0.9917F, 1, 2, 2, -0.3F, false));

		pencilbarrel = new ModelRenderer(this);
		pencilbarrel.setRotationPoint(-0.5F, 0.8679F, -144.2F);
		barrel605.addChild(pencilbarrel);
		pencilbarrel.cubeList.add(new ModelBox(pencilbarrel, 312, 439, 0.0F, -2.0F, 115.0F, 1, 1, 46, -0.15F, false));
		pencilbarrel.cubeList.add(new ModelBox(pencilbarrel, 378, 109, 0.0F, -1.01F, 115.0F, 1, 1, 46, -0.15F, false));
		pencilbarrel.cubeList.add(new ModelBox(pencilbarrel, 124, 439, 0.495F, -1.505F, 115.0F, 1, 1, 46, -0.15F, false));
		pencilbarrel.cubeList.add(new ModelBox(pencilbarrel, 218, 439, -0.495F, -1.505F, 115.0F, 1, 1, 46, -0.15F, false));

		Cube_r20 = new ModelRenderer(this);
		Cube_r20.setRotationPoint(-0.5642F, -2.7692F, 106.5F);
		pencilbarrel.addChild(Cube_r20);
		setRotationAngle(Cube_r20, 0.0F, 0.0F, -0.7854F);
		Cube_r20.cubeList.add(new ModelBox(Cube_r20, 378, 250, -0.5F, 1.5F, 8.5F, 1, 1, 46, -0.15F, false));

		Cube_r21 = new ModelRenderer(this);
		Cube_r21.setRotationPoint(1.5642F, 0.0592F, 106.5F);
		pencilbarrel.addChild(Cube_r21);
		setRotationAngle(Cube_r21, 0.0F, 0.0F, -0.7854F);
		Cube_r21.cubeList.add(new ModelBox(Cube_r21, 378, 203, -0.5F, -2.5F, 8.5F, 1, 1, 46, -0.15F, false));

		Cube_r22 = new ModelRenderer(this);
		Cube_r22.setRotationPoint(-0.5642F, -2.0692F, 106.5F);
		pencilbarrel.addChild(Cube_r22);
		setRotationAngle(Cube_r22, 0.0F, 0.0F, -0.7854F);
		Cube_r22.cubeList.add(new ModelBox(Cube_r22, 378, 156, -0.5F, 1.5F, 8.5F, 1, 1, 46, -0.15F, false));

		Cube_r23 = new ModelRenderer(this);
		Cube_r23.setRotationPoint(1.5642F, 0.7592F, 106.5F);
		pencilbarrel.addChild(Cube_r23);
		setRotationAngle(Cube_r23, 0.0F, 0.0F, -0.7854F);
		Cube_r23.cubeList.add(new ModelBox(Cube_r23, 378, 62, -0.5F, -2.5F, 8.5F, 1, 1, 46, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel605.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}