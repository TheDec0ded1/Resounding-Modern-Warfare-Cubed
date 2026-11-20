package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stoner63AutoRifleMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone8;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10_r2;

	public Stoner63AutoRifleMag() {
		textureWidth = 576;
		textureHeight = 576;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, -12.9F, 5.5F);
		setRotationAngle(mag, 0.1745F, 0.0F, 0.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.9927F, -23.8674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, 8.9916F, -0.4344F);
		bone5.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.0001F, 0.0F, 3.1416F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 552, 155, -1.75F, -11.6714F, -3.0178F, 2, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 547, 97, -1.75F, -10.7506F, -3.0222F, 2, 5, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 129, 546, -1.75F, -11.2714F, -0.0678F, 2, 5, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 156, 552, -1.75F, -11.6464F, -0.0678F, 2, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 188, 545, -1.75F, -11.5701F, 2.2898F, 2, 6, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 165, 552, -1.75F, -11.6464F, 2.2822F, 2, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 310, 548, -1.75F, -11.6509F, 4.9002F, 2, 6, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 178, 546, -0.25F, -10.7506F, -3.0222F, 2, 5, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 552, 147, -0.25F, -11.6464F, 2.2822F, 2, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 552, 143, -0.25F, -11.6714F, -3.0178F, 2, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 552, 139, -0.25F, -11.6464F, -0.0678F, 2, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 548, 517, -2.15F, -8.1714F, 2.2822F, 2, 3, 2, -0.3F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 548, 523, -2.15F, -8.1714F, -0.0678F, 2, 3, 2, -0.3F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 548, 529, -2.15F, -8.1714F, -3.0678F, 2, 3, 2, -0.3F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 548, 511, 0.15F, -8.1714F, 2.2822F, 2, 3, 2, -0.3F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 513, 548, 0.15F, -8.1714F, -3.0678F, 2, 3, 2, -0.3F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 504, 548, 0.15F, -8.1714F, -0.0678F, 2, 3, 2, -0.3F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 120, 546, -0.25F, -11.2714F, -0.0678F, 2, 5, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 448, 502, -0.25F, -11.5701F, 2.2898F, 2, 6, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 208, 548, -0.25F, -11.6509F, 4.9002F, 2, 6, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 530, 53, -1.5F, -11.6509F, -2.0998F, 3, 6, 7, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(0.0F, 8.9916F, -0.4344F);
		bone5.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.0F, 2.3562F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 509, 229, 7.001F, -9.4759F, -1.0998F, 1, 1, 7, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 442, 161, 8.4759F, -8.001F, -1.0998F, 1, 1, 7, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.9927F, -23.8674F);
		mag.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(0.0F, 8.9714F, 0.743F);
		bone7.addChild(bone12_r1);
		setRotationAngle(bone12_r1, -0.2617F, 0.0F, 3.1416F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 69, 546, -1.75F, -5.568F, -3.7641F, 2, 6, 2, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 497, 548, -1.75F, -6.3727F, 4.1121F, 2, 6, 1, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 412, 544, -1.75F, -6.0824F, 1.526F, 2, 6, 2, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 78, 546, -1.75F, -6.47F, -0.9029F, 2, 6, 2, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 367, 545, -0.25F, -5.568F, -3.7641F, 2, 6, 2, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 358, 545, -0.25F, -6.47F, -0.9029F, 2, 6, 2, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 269, 544, -0.25F, -6.0824F, 1.526F, 2, 6, 2, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 339, 548, -0.25F, -6.3727F, 4.1121F, 2, 6, 1, 0.001F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 248, 532, -1.5F, -6.3727F, -2.8879F, 3, 6, 7, 0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.6512F, -24.0008F);
		mag.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.6883F, 3.9002F, -0.2287F);
		bone8.addChild(bone10_r1);
		setRotationAngle(bone10_r1, -0.5235F, 0.0F, 3.1416F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 490, 548, -1.75F, -1.0367F, 4.0197F, 2, 6, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 403, 544, -1.75F, -0.5418F, 1.485F, 2, 6, 2, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 394, 545, -1.75F, -0.6091F, -0.9737F, 2, 6, 2, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 60, 546, -1.75F, 0.6587F, -3.6927F, 2, 6, 2, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 385, 545, -0.25F, 0.6587F, -3.6927F, 2, 6, 2, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 376, 545, -0.25F, -0.6091F, -0.9737F, 2, 6, 2, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 278, 544, -0.25F, -0.5418F, 1.485F, 2, 6, 2, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 346, 548, -0.25F, -1.0367F, 4.0197F, 2, 6, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 526, 91, -1.5F, -1.0367F, -2.9804F, 3, 6, 7, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -18.045F, -25.1985F);
		mag.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		

		bone10_r2 = new ModelRenderer(this);
		bone10_r2.setRotationPoint(1.6883F, -1.3196F, -1.8417F);
		bone9.addChild(bone10_r2);
		setRotationAngle(bone10_r2, -0.9599F, 0.0F, -3.1416F);
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 534, 257, -1.75F, 11.6592F, -2.1252F, 2, 1, 8, 0.0F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 311, 532, -1.75F, 3.7592F, 4.9748F, 2, 8, 1, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 448, 491, -1.75F, 4.5745F, 2.5837F, 2, 8, 2, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 532, 543, -1.75F, 5.0411F, 0.1687F, 2, 7, 2, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 147, 546, -1.75F, 6.8674F, -2.2114F, 2, 5, 2, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 534, 247, -0.25F, 11.6592F, -2.1252F, 2, 1, 8, 0.0F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 138, 546, -0.25F, 6.8674F, -2.2114F, 2, 5, 2, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 523, 543, -0.25F, 5.0411F, 0.1687F, 2, 7, 2, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 448, 480, -0.25F, 4.5745F, 2.5837F, 2, 8, 2, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 488, 106, -0.25F, 3.7592F, 4.9748F, 2, 8, 1, 0.001F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 530, 37, -1.5F, 3.7592F, -2.0252F, 3, 8, 7, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}