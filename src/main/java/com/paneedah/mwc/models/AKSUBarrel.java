package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKSUBarrel extends ModelBase {
	private final ModelRenderer barrelGroup;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer irons;
	private final ModelRenderer frontSightBlock;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer ironsights_r8;
	private final ModelRenderer ironsights_r9;
	private final ModelRenderer ironsights_r10;
	private final ModelRenderer ironsights_r11;
	private final ModelRenderer ironsights_r12;
	private final ModelRenderer ironsights_r13;
	private final ModelRenderer ironsights_r14;
	private final ModelRenderer ironsights_r15;
	private final ModelRenderer sights;
	private final ModelRenderer bone2;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun249_r6;
	private final ModelRenderer gun248_r4;
	private final ModelRenderer gun247_r1;

	public AKSUBarrel() {
		textureWidth = 304;
		textureHeight = 304;

		barrelGroup = new ModelRenderer(this);
		barrelGroup.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 272, 283, 0.0F, 2.175F, 3.15F, 1, 1, 2, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 284, 3, 0.0F, 3.5892F, 3.15F, 1, 1, 2, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 284, 6, 0.7071F, 2.8821F, 3.15F, 1, 1, 2, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 284, 9, -0.7071F, 2.8821F, 3.15F, 1, 1, 2, 0.0F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(1.0F, 3.8821F, -6.35F);
		barrelGroup.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 30, 284, -0.5F, -0.5F, 9.5F, 1, 1, 2, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 3.8821F, -6.35F);
		barrelGroup.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 24, 284, -0.5F, -0.5F, 9.5F, 1, 1, 2, 0.0F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(1.0F, 2.8821F, -6.35F);
		barrelGroup.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 284, 0, -0.5F, -0.5F, 9.5F, 1, 1, 2, 0.0F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.0F, 2.8821F, -6.35F);
		barrelGroup.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 278, 283, -0.5F, -0.5F, 9.5F, 1, 1, 2, 0.0F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroup.addChild(irons);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -0.8F);
		irons.addChild(frontSightBlock);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -39.0623F, -125.0403F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 98, 284, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -36.7123F, -124.7403F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 170, 283, -0.175F, 0.6F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 282, 279, -0.375F, 0.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 36, 284, -0.375F, -0.35F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-1.5F, -36.7123F, -124.3153F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.0F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 130, 282, -1.4F, 0.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 284, 56, -1.4F, -0.35F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.299F, -38.9371F, -124.9153F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, -0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 284, 53, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.814F, -38.4753F, -124.9153F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 284, 50, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(0.1627F, -37.5033F, -124.9153F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 48, 284, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-2.2757F, -37.965F, -124.9153F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, -0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 42, 284, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-0.875F, -32.4F, -123.65F);
		frontSightBlock.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, 0.0F, -1.5708F, -0.7854F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 286, 286, -0.4F, -2.0F, 0.0F, 1, 1, 1, -0.1F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(-1.5F, -32.4F, -123.55F);
		frontSightBlock.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.0F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 280, 22, -1.4F, -2.0F, -1.0F, 2, 2, 2, -0.2F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(-0.875F, -32.4F, -124.225F);
		frontSightBlock.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, -0.7854F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 162, 284, -1.4F, -2.0F, 0.0F, 2, 1, 1, -0.1F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-1.5F, -31.8F, -124.125F);
		frontSightBlock.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, 0.0F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 280, 202, -1.4F, -1.0F, -1.0F, 2, 1, 2, -0.2F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-2.7F, -30.3123F, -124.5153F);
		frontSightBlock.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 58, 275, -1.4F, -5.0F, -2.0F, 2, 4, 2, -0.4F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-2.3F, -30.3123F, -124.5153F);
		frontSightBlock.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 164, 274, -1.4F, -5.0F, -2.0F, 2, 4, 2, -0.4F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-1.7F, -35.4734F, -123.188F);
		frontSightBlock.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 220, 279, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		ironsights_r15 = new ModelRenderer(this);
		ironsights_r15.setRotationPoint(-1.3F, -35.4734F, -123.188F);
		frontSightBlock.addChild(ironsights_r15);
		setRotationAngle(ironsights_r15, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r15.cubeList.add(new ModelBox(ironsights_r15, 136, 75, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, -35.9F, -146.35F);
		irons.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 284, 232, -2.0F, -2.55F, 20.0F, 1, 2, 1, -0.4F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 42.3899F, 51.15F);
		barrelGroup.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 204, 27, -2.0F, -42.6071F, -45.95F, 1, 1, 19, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 204, 47, -2.0F, -41.4757F, -45.95F, 1, 1, 19, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 206, 67, -1.4343F, -42.0414F, -45.95F, 1, 1, 19, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 206, 87, -2.5657F, -42.0414F, -45.95F, 1, 1, 19, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 176, -2.0F, -39.8899F, -47.15F, 1, 1, 22, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 192, 107, -1.5757F, -39.4657F, -47.15F, 1, 1, 22, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 138, 194, -2.4243F, -39.4657F, -47.15F, 1, 1, 22, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 266, 279, -2.495F, -39.495F, -47.075F, 1, 1, 3, -0.15F, false));
		bone2.cubeList.add(new ModelBox(bone2, 274, 279, -1.505F, -39.495F, -47.075F, 1, 1, 3, -0.15F, false));
		bone2.cubeList.add(new ModelBox(bone2, 280, 14, -2.0F, -39.99F, -47.075F, 1, 1, 3, -0.15F, false));
		bone2.cubeList.add(new ModelBox(bone2, 46, 199, -2.0F, -39.0414F, -47.15F, 1, 1, 22, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 280, 18, -2.0F, -39.0F, -47.075F, 1, 1, 3, -0.15F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(-1.85F, -39.345F, -38.575F);
		bone2.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 258, 279, -0.5F, -0.5F, -8.5F, 1, 1, 3, -0.15F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(-1.15F, -39.345F, -38.575F);
		bone2.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 250, 279, -0.5F, -0.5F, -8.5F, 1, 1, 3, -0.15F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(-1.15F, -38.645F, -38.575F);
		bone2.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 242, 279, -0.5F, -0.5F, -8.5F, 1, 1, 3, -0.15F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(-1.85F, -38.645F, -38.575F);
		bone2.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 234, 279, -0.5F, -0.5F, -8.5F, 1, 1, 3, -0.15F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(-1.2F, -38.6657F, -41.65F);
		bone2.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 0, 199, -0.5F, -0.5F, -5.5F, 1, 1, 22, -0.2F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(-1.8F, -38.6657F, -41.65F);
		bone2.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 184, 194, -0.5F, -0.5F, -5.5F, 1, 1, 22, -0.2F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(-1.2F, -39.2657F, -41.65F);
		bone2.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 92, 177, -0.5F, -0.5F, -5.5F, 1, 1, 22, -0.2F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(-1.8F, -39.2657F, -41.65F);
		bone2.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 46, 176, -0.5F, -0.5F, -5.5F, 1, 1, 22, -0.2F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(-1.9F, -41.1414F, -45.45F);
		bone2.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 212, 170, -0.5F, -0.5F, -0.5F, 1, 1, 19, -0.1F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(-1.1F, -41.1414F, -45.45F);
		bone2.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 212, 150, -0.5F, -0.5F, -0.5F, 1, 1, 19, -0.1F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(-1.1F, -41.9414F, -45.45F);
		bone2.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 212, 130, -0.5F, -0.5F, -0.5F, 1, 1, 19, -0.1F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(-1.9F, -41.9414F, -45.45F);
		bone2.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 210, 0, -0.5F, -0.5F, -0.5F, 1, 1, 19, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelGroup.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}