package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Stock extends ModelBase {
	private final ModelRenderer asval_stock;
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
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public AS_Stock() {
		textureWidth = 512;
		textureHeight = 512;

		asval_stock = new ModelRenderer(this);
		asval_stock.setRotationPoint(0.5F, -6.6F, 14.6F);
		asval_stock.cubeList.add(new ModelBox(asval_stock, 97, 135, -2.19F, -1.9F, -20.3F, 2, 1, 6, 0.0F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 43, 134, -2.19F, -1.4F, -20.3F, 2, 1, 6, -0.001F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 86, 133, -3.59F, -1.9F, -20.3F, 2, 1, 6, 0.0F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 62, 132, -3.59F, -1.4F, -20.3F, 2, 1, 6, -0.001F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 172, 92, -3.099F, -5.8127F, -15.3389F, 3, 3, 1, -0.2F, false));
		asval_stock.cubeList.add(new ModelBox(asval_stock, 43, 111, -3.699F, -5.8127F, -15.3389F, 1, 3, 1, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.5F, -3.95F, 10.55F);
		asval_stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1887F, -0.8638F, 0.1442F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 97, 133, -18.8187F, 2.031F, -14.4366F, 1, 4, 1, -0.001F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 138, -19.5887F, 2.031F, -15.0776F, 1, 4, 1, -0.001F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -0.85F, 11.55F);
		asval_stock.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1222F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 160, 150, -3.0F, 1.0322F, -20.9317F, 2, 2, 1, -0.002F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 140, -1.4F, 1.0322F, -20.9317F, 1, 2, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 107, 177, -1.4F, 1.0322F, -22.9317F, 1, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 149, -1.2F, -1.1178F, -23.9317F, 1, 1, 4, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 9, -1.2F, -1.1178F, -20.7317F, 1, 3, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 18, -1.2F, -1.1178F, -24.4317F, 1, 4, 1, -0.201F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 141, -3.0F, -0.9178F, -24.9317F, 2, 2, 5, -0.001F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 160, 146, -3.0F, 1.0322F, -23.9317F, 2, 2, 1, -0.002F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 102, 82, -2.7F, 1.8322F, -23.4317F, 2, 1, 3, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 140, 22, -1.4F, 1.0322F, -23.9317F, 1, 2, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.2F, -2.95F, 12.15F);
		asval_stock.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1228F, 0.1039F, -0.0128F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 173, 1.1028F, 2.0306F, -24.1427F, 1, 1, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.0F, -1.8F, 42.449F);
		asval_stock.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0498F, 0.0162F, 0.3138F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 100, 59, -0.0159F, -0.0513F, -29.5433F, 1, 3, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.0F, -1.8F, 42.449F);
		asval_stock.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0498F, -0.0162F, -0.3138F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 97, -0.9841F, -0.0513F, -29.5433F, 1, 3, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.92F, 8.05F, 41.93F);
		asval_stock.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.0462F, -0.0246F, -0.4881F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 158, 26, 0.0245F, -0.0488F, -29.5433F, 1, 2, 3, 0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.92F, 1.05F, 42.3F);
		asval_stock.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 114, 82, 0.0F, -0.0527F, -29.5433F, 1, 7, 3, 0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 114, 46, 2.84F, -0.0527F, -29.5433F, 1, 7, 3, 0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.08F, 8.05F, 41.93F);
		asval_stock.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0462F, 0.0246F, 0.4881F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 138, -1.0245F, -0.0488F, -29.5433F, 1, 2, 3, 0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0F, -1.8F, 42.449F);
		asval_stock.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0524F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 86, 162, -2.0F, 10.5673F, -29.5433F, 2, 1, 3, 0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 153, 106, -2.0F, 0.9473F, -27.5433F, 2, 10, 1, 0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 137, 153, -2.0F, -0.0527F, -29.5433F, 2, 1, 3, 0.001F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, -3.8F, 15.549F);
		asval_stock.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.4189F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 246, 0, -2.0F, 10.8098F, -20.1674F, 2, 2, 21, -0.5F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0F, -3.4F, 15.449F);
		asval_stock.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0524F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 140, 146, -2.001F, 9.7058F, -4.5208F, 2, 2, 4, -0.499F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 139, 109, -2.001F, 2.6072F, -25.8362F, 2, 2, 4, -0.499F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 154, 202, -2.0F, 0.1009F, -25.9262F, 2, 2, 25, -0.5F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.5F, -3.95F, 10.55F);
		asval_stock.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.1222F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 129, 131, -1.4F, 2.0322F, -23.9317F, 1, 4, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, -4.6F, 9.55F);
		asval_stock.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.1222F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 99, 74, -3.7F, 1.7322F, -24.2317F, 3, 2, 1, -0.201F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 101, -3.4F, 2.4322F, -23.9317F, 2, 1, 2, 0.098F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 96, -3.4F, 3.0322F, -23.9317F, 2, 4, 2, 0.1F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 58, -1.4F, 2.0322F, -23.9317F, 1, 5, 2, 0.101F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.0F, -2.2F, 36.249F);
		asval_stock.addChild(bone2);
		setRotationAngle(bone2, -0.2094F, 0.0F, 0.0F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.92F, 2.85F, -0.149F);
		bone2.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.0524F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 166, -0.9035F, 7.2262F, -32.167F, 1, 2, 3, -0.1F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 86, 0, -1.3035F, 6.139F, -32.1584F, 1, 4, 3, 0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0698F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 111, -2.0F, 3.1066F, -32.8876F, 2, 1, 3, 0.001F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0026F, 0.0187F, -0.3137F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 167, -2.0542F, 5.0449F, -32.6296F, 1, 2, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, -0.1247F, 0.5869F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -0.0698F, 0.0F, 0.0F);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.0524F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 12, 111, -2.3038F, 16.157F, -31.7383F, 2, 1, 3, 0.001F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.92F, 9.85F, -0.519F);
		bone3.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.0462F, 0.0246F, 0.4881F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 106, 162, 1.3314F, 5.0294F, -31.7387F, 1, 2, 3, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		asval_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}