package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALstockPoly extends ModelBase {
	private final ModelRenderer stock;
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
	private final ModelRenderer cube_r18;

	public FALstockPoly() {
		textureWidth = 624;
		textureHeight = 624;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 488, 376, -3.0F, -35.9882F, 7.9106F, 3, 3, 6, 0.251F, false));
		stock.cubeList.add(new ModelBox(stock, 248, 596, -2.5113F, -33.1188F, 8.7366F, 2, 1, 4, 0.225F, false));
		stock.cubeList.add(new ModelBox(stock, 536, 96, -3.0F, -35.7601F, 13.9932F, 3, 3, 21, 0.249F, false));
		stock.cubeList.add(new ModelBox(stock, 584, 16, -3.0F, -32.8601F, 26.9932F, 3, 4, 12, 0.251F, false));
		stock.cubeList.add(new ModelBox(stock, 314, 234, -3.0F, -28.3601F, 30.9932F, 3, 1, 8, 0.251F, false));
		stock.cubeList.add(new ModelBox(stock, 290, 195, -3.0F, -32.3601F, 18.4932F, 3, 1, 8, 0.251F, false));
		stock.cubeList.add(new ModelBox(stock, 452, 519, -3.0F, -30.8601F, 23.2932F, 3, 1, 4, 0.249F, false));
		stock.cubeList.add(new ModelBox(stock, 82, 597, -3.0F, -26.8601F, 35.9932F, 3, 1, 3, 0.251F, false));
		stock.cubeList.add(new ModelBox(stock, 538, 495, -2.0006F, -37.5209F, 14.0672F, 1, 1, 21, 0.175F, false));
		stock.cubeList.add(new ModelBox(stock, 200, 594, -2.0006F, -38.1209F, 35.3172F, 1, 2, 5, 0.175F, false));
		stock.cubeList.add(new ModelBox(stock, 320, 609, -2.0006F, -26.6209F, 33.3172F, 1, 2, 1, 0.175F, false));
		stock.cubeList.add(new ModelBox(stock, 308, 575, -3.0F, -36.3601F, 35.2432F, 3, 3, 5, 0.25F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -38.2385F, 10.4305F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.0036F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 198, 606, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.2499F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.502F, -26.7975F, 37.1232F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 466, 505, -1.5F, -7.0F, 1.5F, 3, 9, 1, 0.249F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5117F, -36.1435F, 38.5232F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.0036F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 484, 424, -0.5407F, -1.7154F, -3.4809F, 2, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 552, 517, -0.5407F, -1.7154F, -3.0309F, 2, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.4883F, -36.1435F, 38.5232F);
		stock.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.0036F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 478, 424, -1.4593F, -1.7154F, -3.4809F, 2, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 538, 517, -1.4593F, -1.7154F, -3.0309F, 2, 1, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.4883F, -35.5435F, 17.7232F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.0036F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 538, 120, -1.4593F, -1.7154F, -4.4809F, 2, 1, 22, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5117F, -35.5435F, 17.7232F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -1.0036F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 402, 172, -0.5407F, -1.7154F, -4.4809F, 2, 1, 22, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.4934F, -36.663F, 12.5482F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4575F, -0.6062F, -0.8582F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 608, 593, -0.0689F, -2.016F, 0.529F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.4934F, -36.663F, 12.5482F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 166, 606, -1.0F, -1.6685F, 0.729F, 2, 2, 2, 0.2F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 400, 232, -1.5066F, -0.8758F, 1.1656F, 3, 1, 1, 0.25F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.4934F, -36.663F, 12.5482F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4575F, 0.6062F, 0.8582F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 608, 590, -0.9311F, -2.016F, 0.529F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.4934F, -36.663F, 12.5482F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.143F, -0.2201F, -0.9877F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 464, 419, -0.4529F, -1.7713F, -4.668F, 1, 1, 6, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.4934F, -36.663F, 12.5482F);
		stock.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.143F, 0.2201F, 0.9877F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 450, 188, -0.5471F, -1.7713F, -4.668F, 1, 1, 6, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -30.1905F, 21.2017F);
		stock.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1678F, 0.2564F, 0.9819F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 510, 524, -0.8995F, 0.5031F, -8.6245F, 1, 1, 28, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, -30.1905F, 21.2017F);
		stock.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1678F, -0.2564F, -0.9819F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 452, 524, -0.1005F, 0.5031F, -8.6245F, 1, 1, 28, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.5F, -30.1905F, 21.2017F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 306, 524, -1.0113F, -0.3326F, -8.8495F, 2, 1, 28, 0.225F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 366, 525, -1.5F, -1.202F, -8.3755F, 3, 1, 26, 0.25F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.5606F, -32.5842F, 10.9616F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 1.0036F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 60, 603, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.4394F, -32.5842F, 10.9616F);
		stock.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.0036F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 603, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.4934F, -36.663F, 12.5482F);
		stock.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 504, 300, -1.5066F, -0.3258F, -4.918F, 3, 2, 6, 0.25F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 603, -1.0F, -1.2131F, -1.868F, 2, 2, 3, 0.2F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.5F, -38.8882F, 9.4106F);
		stock.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 158, 606, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}