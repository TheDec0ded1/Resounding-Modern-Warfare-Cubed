package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK9Barrel extends ModelBase {
	private final ModelRenderer barrelGroup;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun251_r2;
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
	private final ModelRenderer ironsights_r16;
	private final ModelRenderer ironsights_r17;
	private final ModelRenderer sights;
	private final ModelRenderer ironsights_r18;
	private final ModelRenderer ironsights_r19;
	private final ModelRenderer ironsights_r20;
	private final ModelRenderer ironsights_r21;
	private final ModelRenderer ironsights_r22;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun249_r6;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun248_r4;
	private final ModelRenderer gun249_r7;
	private final ModelRenderer gun248_r5;
	private final ModelRenderer gun247_r1;

	public AK9Barrel() {
		textureWidth = 320;
		textureHeight = 320;

		barrelGroup = new ModelRenderer(this);
		barrelGroup.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 288, 307, 0.0F, 2.175F, 2.15F, 1, 1, 4, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 298, 307, 0.0F, 3.5892F, 2.15F, 1, 1, 4, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 168, 308, 0.7071F, 2.8821F, 2.15F, 1, 1, 4, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 178, 308, -0.7071F, 2.8821F, 2.15F, 1, 1, 4, 0.0F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(1.0F, 3.8821F, -8.35F);
		barrelGroup.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 316, 28, -0.5F, -0.5F, 10.5F, 1, 1, 1, 0.0F, false));
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 316, 8, -0.5F, -0.5F, 13.5F, 1, 1, 1, 0.0F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(0.0F, 3.8821F, -8.35F);
		barrelGroup.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 316, 30, -0.5F, -0.5F, 10.5F, 1, 1, 1, 0.0F, false));
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 316, 26, -0.5F, -0.5F, 13.5F, 1, 1, 1, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 2.8821F, -8.35F);
		barrelGroup.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 316, 32, -0.5F, -0.5F, 10.5F, 1, 1, 1, 0.0F, false));
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 316, 10, -0.5F, -0.5F, 13.5F, 1, 1, 1, 0.0F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(1.0F, 2.8821F, -8.35F);
		barrelGroup.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 316, 34, -0.5F, -0.5F, 10.5F, 1, 1, 1, 0.0F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 316, 12, -0.5F, -0.5F, 13.5F, 1, 1, 1, 0.0F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroup.addChild(irons);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -0.8F);
		irons.addChild(frontSightBlock);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -35.9123F, -121.5403F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 312, 287, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -38.3123F, -124.0403F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 312, 284, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-1.5F, -36.7123F, -123.7403F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.0F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 284, 312, -0.375F, 1.0F, -1.0F, 1, 1, 2, -0.2F, false));
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 254, 312, -0.375F, 0.4F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-1.5F, -36.7123F, -123.3153F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, 0.0F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 312, 281, -1.4F, 1.0F, -1.0F, 1, 1, 2, -0.2F, false));
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 312, 278, -1.4F, 0.4F, -1.0F, 1, 1, 2, -0.2F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-0.299F, -38.1871F, -123.9153F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, -0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 278, 312, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.814F, -37.7253F, -123.9153F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 272, 312, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(0.1627F, -36.7533F, -123.9153F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, 0.48F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 266, 312, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r8 = new ModelRenderer(this);
		ironsights_r8.setRotationPoint(-2.2757F, -37.215F, -123.9153F);
		frontSightBlock.addChild(ironsights_r8);
		setRotationAngle(ironsights_r8, 0.0F, -1.5708F, -0.48F);
		ironsights_r8.cubeList.add(new ModelBox(ironsights_r8, 260, 312, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r9 = new ModelRenderer(this);
		ironsights_r9.setRotationPoint(-1.5F, -32.9F, -125.325F);
		frontSightBlock.addChild(ironsights_r9);
		setRotationAngle(ironsights_r9, 0.0F, -1.5708F, 0.0F);
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 222, 310, 0.6F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r9.cubeList.add(new ModelBox(ironsights_r9, 310, 171, 1.2F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r10 = new ModelRenderer(this);
		ironsights_r10.setRotationPoint(-0.875F, -32.4F, -123.225F);
		frontSightBlock.addChild(ironsights_r10);
		setRotationAngle(ironsights_r10, 0.0F, -1.5708F, -0.7854F);
		ironsights_r10.cubeList.add(new ModelBox(ironsights_r10, 258, 46, -1.4F, -2.0F, 0.0F, 4, 1, 1, -0.1F, false));

		ironsights_r11 = new ModelRenderer(this);
		ironsights_r11.setRotationPoint(-1.5F, -31.7F, -123.125F);
		frontSightBlock.addChild(ironsights_r11);
		setRotationAngle(ironsights_r11, 0.0F, -1.5708F, 0.0F);
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 244, 17, -1.4F, -1.0F, -1.0F, 4, 1, 2, -0.2F, false));
		ironsights_r11.cubeList.add(new ModelBox(ironsights_r11, 160, 27, -1.4F, -2.6F, -1.0F, 4, 2, 2, -0.2F, false));

		ironsights_r12 = new ModelRenderer(this);
		ironsights_r12.setRotationPoint(-2.3F, -30.3123F, -122.5153F);
		frontSightBlock.addChild(ironsights_r12);
		setRotationAngle(ironsights_r12, 0.0F, -1.5708F, 0.0F);
		ironsights_r12.cubeList.add(new ModelBox(ironsights_r12, 242, 309, -1.4F, -5.0F, -2.0F, 1, 4, 2, -0.4F, false));

		ironsights_r13 = new ModelRenderer(this);
		ironsights_r13.setRotationPoint(-2.7F, -30.3123F, -122.5153F);
		frontSightBlock.addChild(ironsights_r13);
		setRotationAngle(ironsights_r13, 0.0F, -1.5708F, 0.0F);
		ironsights_r13.cubeList.add(new ModelBox(ironsights_r13, 208, 308, -1.4F, -5.0F, -2.0F, 1, 4, 2, -0.4F, false));

		ironsights_r14 = new ModelRenderer(this);
		ironsights_r14.setRotationPoint(-2.7F, -30.3123F, -123.5153F);
		frontSightBlock.addChild(ironsights_r14);
		setRotationAngle(ironsights_r14, 0.0F, -1.5708F, 0.0F);
		ironsights_r14.cubeList.add(new ModelBox(ironsights_r14, 100, 298, -1.4F, -5.0F, -2.0F, 1, 4, 2, -0.4F, false));

		ironsights_r15 = new ModelRenderer(this);
		ironsights_r15.setRotationPoint(-2.3F, -30.3123F, -123.5153F);
		frontSightBlock.addChild(ironsights_r15);
		setRotationAngle(ironsights_r15, 0.0F, -1.5708F, 0.0F);
		ironsights_r15.cubeList.add(new ModelBox(ironsights_r15, 40, 231, -1.4F, -5.0F, -2.0F, 1, 4, 2, -0.4F, false));

		ironsights_r16 = new ModelRenderer(this);
		ironsights_r16.setRotationPoint(-1.7F, -34.7234F, -122.188F);
		frontSightBlock.addChild(ironsights_r16);
		setRotationAngle(ironsights_r16, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r16.cubeList.add(new ModelBox(ironsights_r16, 310, 56, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		ironsights_r17 = new ModelRenderer(this);
		ironsights_r17.setRotationPoint(-1.3F, -34.7234F, -122.188F);
		frontSightBlock.addChild(ironsights_r17);
		setRotationAngle(ironsights_r17, 1.5708F, -1.3526F, -1.5708F);
		ironsights_r17.cubeList.add(new ModelBox(ironsights_r17, 298, 178, -1.4F, -2.0F, -1.0F, 1, 3, 2, -0.4F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, -35.9F, -142.35F);
		irons.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 274, 31, -2.5F, -1.76F, 35.92F, 2, 1, 6, -0.301F, false));
		sights.cubeList.add(new ModelBox(sights, 254, 81, -3.1F, -1.56F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 194, 279, -3.1F, -1.76F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 144, 281, -3.1F, -1.96F, 41.22F, 3, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 24, 292, -0.9F, -1.96F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 24, 294, -0.9F, -1.76F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 24, 296, -0.9F, -1.56F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 232, 304, -0.9F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 232, 306, -1.1F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 228, 310, -1.3F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 228, 312, -1.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 123, -1.7F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 125, -1.7F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 147, -1.5F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 149, -1.3F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 151, -1.1F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 152, 314, -0.9F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 153, -2.3F, -2.26F, 41.22F, 1, 1, 1, -0.402F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 155, -2.5F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 156, 314, -2.7F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 157, -2.9F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 160, 314, -3.1F, -2.26F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 196, -2.3F, -2.16F, 41.22F, 1, 1, 1, -0.401F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 198, -2.5F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 200, -2.9F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 202, -3.1F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 314, 204, -2.7F, -2.16F, 41.22F, 1, 1, 1, -0.4F, false));
		sights.cubeList.add(new ModelBox(sights, 28, 275, -2.0F, -1.8F, 17.0F, 1, 2, 1, -0.4F, false));

		ironsights_r18 = new ModelRenderer(this);
		ironsights_r18.setRotationPoint(-1.95F, -2.5444F, 38.3787F);
		sights.addChild(ironsights_r18);
		setRotationAngle(ironsights_r18, -1.5708F, -1.1781F, 1.5708F);
		ironsights_r18.cubeList.add(new ModelBox(ironsights_r18, 284, 237, -0.4F, 1.0F, 0.0F, 3, 2, 1, -0.2F, false));

		ironsights_r19 = new ModelRenderer(this);
		ironsights_r19.setRotationPoint(-0.05F, -2.5444F, 38.3787F);
		sights.addChild(ironsights_r19);
		setRotationAngle(ironsights_r19, -1.5708F, -1.1781F, 1.5708F);
		ironsights_r19.cubeList.add(new ModelBox(ironsights_r19, 118, 77, -0.4F, 1.0F, 0.0F, 3, 2, 1, -0.2F, false));

		ironsights_r20 = new ModelRenderer(this);
		ironsights_r20.setRotationPoint(-0.05F, -2.7123F, 36.3347F);
		sights.addChild(ironsights_r20);
		setRotationAngle(ironsights_r20, 0.0F, -1.5708F, 0.0F);
		ironsights_r20.cubeList.add(new ModelBox(ironsights_r20, 310, 238, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		ironsights_r21 = new ModelRenderer(this);
		ironsights_r21.setRotationPoint(-1.55F, -2.3123F, 36.5347F);
		sights.addChild(ironsights_r21);
		setRotationAngle(ironsights_r21, 0.0F, -1.5708F, 0.0F);
		ironsights_r21.cubeList.add(new ModelBox(ironsights_r21, 310, 241, -0.4F, 1.0F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r22 = new ModelRenderer(this);
		ironsights_r22.setRotationPoint(-1.95F, -2.7123F, 36.3347F);
		sights.addChild(ironsights_r22);
		setRotationAngle(ironsights_r22, 0.0F, -1.5708F, 0.0F);
		ironsights_r22.cubeList.add(new ModelBox(ironsights_r22, 310, 235, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.7F, -1.36F, 40.72F);
		sights.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3665F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 314, 206, -0.8F, -0.2783F, -0.5225F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 208, 314, 2.2F, -0.2783F, -0.5225F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 314, 211, 1.7F, -0.2783F, -0.5225F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 314, 213, -0.3F, -0.2783F, -0.5225F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 42.3899F, 51.15F);
		barrelGroup.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 252, 224, -2.0F, -42.6071F, -41.25F, 1, 1, 15, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 254, 167, -2.0F, -41.4757F, -41.25F, 1, 1, 15, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 36, 255, -1.4343F, -42.0414F, -41.25F, 1, 1, 15, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 68, 255, -2.5657F, -42.0414F, -41.25F, 1, 1, 15, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 166, 140, -2.0F, -39.8899F, -48.15F, 1, 1, 24, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 50, 169, -1.5757F, -39.4657F, -48.15F, 1, 1, 24, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 100, 170, -2.4243F, -39.4657F, -48.15F, 1, 1, 24, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 128, 307, -2.5303F, -42.0604F, -43.95F, 1, 1, 4, -0.125F, false));
		bone2.cubeList.add(new ModelBox(bone2, 248, 307, -1.4697F, -42.0604F, -43.95F, 1, 1, 4, -0.125F, false));
		bone2.cubeList.add(new ModelBox(bone2, 258, 307, -2.0F, -41.53F, -43.95F, 1, 1, 4, -0.125F, false));
		bone2.cubeList.add(new ModelBox(bone2, 268, 307, -2.0F, -42.5907F, -43.95F, 1, 1, 4, -0.125F, false));
		bone2.cubeList.add(new ModelBox(bone2, 278, 307, -2.0F, -42.0649F, -43.95F, 1, 1, 4, -0.125F, false));
		bone2.cubeList.add(new ModelBox(bone2, 300, 278, -2.495F, -39.495F, -46.075F, 1, 1, 5, -0.15F, false));
		bone2.cubeList.add(new ModelBox(bone2, 300, 284, -1.505F, -39.495F, -46.075F, 1, 1, 5, -0.15F, false));
		bone2.cubeList.add(new ModelBox(bone2, 300, 290, -2.0F, -39.99F, -46.075F, 1, 1, 5, -0.15F, false));
		bone2.cubeList.add(new ModelBox(bone2, 150, 190, -2.0F, -39.0414F, -48.15F, 1, 1, 24, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 302, 14, -2.0F, -39.0F, -46.075F, 1, 1, 5, -0.15F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(-1.85F, -39.345F, -37.575F);
		bone2.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 298, 243, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.15F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(-1.15F, -39.345F, -37.575F);
		bone2.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 298, 237, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.15F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(-1.15F, -38.645F, -37.575F);
		bone2.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 88, 298, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.15F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(-1.85F, -38.645F, -37.575F);
		bone2.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 76, 298, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.15F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(-1.875F, -41.9354F, -35.45F);
		bone2.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 118, 307, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(-1.125F, -41.9354F, -35.45F);
		bone2.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 108, 307, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(-1.125F, -41.1854F, -35.45F);
		bone2.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 98, 307, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(-1.875F, -41.1854F, -35.45F);
		bone2.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 158, 306, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.125F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(-1.2F, -38.6657F, -28.65F);
		bone2.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 184, 58, -0.5F, -0.5F, -19.5F, 1, 1, 24, -0.2F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(-1.8F, -38.6657F, -28.65F);
		bone2.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 174, 100, -0.5F, -0.5F, -19.5F, 1, 1, 24, -0.2F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(-1.2F, -39.2657F, -28.65F);
		bone2.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 0, 169, -0.5F, -0.5F, -19.5F, 1, 1, 24, -0.2F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(-1.8F, -39.2657F, -28.65F);
		bone2.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 166, 165, -0.5F, -0.5F, -19.5F, 1, 1, 24, -0.2F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(-1.9F, -41.1414F, -32.75F);
		bone2.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 258, 119, -0.5F, -0.5F, -8.5F, 1, 1, 15, -0.1F, false));

		gun249_r7 = new ModelRenderer(this);
		gun249_r7.setRotationPoint(-1.1F, -41.1414F, -32.75F);
		bone2.addChild(gun249_r7);
		setRotationAngle(gun249_r7, 0.0F, 0.0F, -0.7854F);
		gun249_r7.cubeList.add(new ModelBox(gun249_r7, 0, 256, -0.5F, -0.5F, -8.5F, 1, 1, 15, -0.1F, false));

		gun248_r5 = new ModelRenderer(this);
		gun248_r5.setRotationPoint(-1.1F, -41.9414F, -32.75F);
		bone2.addChild(gun248_r5);
		setRotationAngle(gun248_r5, 0.0F, 0.0F, -0.7854F);
		gun248_r5.cubeList.add(new ModelBox(gun248_r5, 132, 255, -0.5F, -0.5F, -8.5F, 1, 1, 15, -0.1F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(-1.9F, -41.9414F, -32.75F);
		bone2.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 100, 255, -0.5F, -0.5F, -8.5F, 1, 1, 15, -0.1F, false));
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