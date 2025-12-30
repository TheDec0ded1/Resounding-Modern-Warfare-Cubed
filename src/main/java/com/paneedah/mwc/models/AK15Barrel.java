package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK15Barrel extends ModelBase {
	private final ModelRenderer barrelGroup;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun249_r6;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun250_r6;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun249_r7;
	private final ModelRenderer gun248_r4;
	private final ModelRenderer gun247_r1;
	private final ModelRenderer irons;
	private final ModelRenderer frontSightBlock;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer muzzle;
	private final ModelRenderer gun250_r7;
	private final ModelRenderer gun249_r8;
	private final ModelRenderer gun249_r9;
	private final ModelRenderer gun248_r5;
	private final ModelRenderer gun250_r8;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun251_r4;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun250_r9;
	private final ModelRenderer gun251_r5;
	private final ModelRenderer gun251_r6;
	private final ModelRenderer gun252_r2;

	public AK15Barrel() {
		textureWidth = 416;
		textureHeight = 416;

		barrelGroup = new ModelRenderer(this);
		barrelGroup.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 233, 80, 0.0F, 0.2828F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 126, 233, 0.0F, 1.697F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 234, 0.7071F, 0.9899F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 237, 0, -0.7071F, 0.9899F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 138, 388, 0.0F, 3.7F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 388, 141, 0.0F, 4.9728F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 388, 146, 0.6364F, 4.3364F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 388, 151, -0.6364F, 4.3364F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 375, 190, -0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 375, 176, 0.0F, 3.7F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 374, 290, 0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 173, 374, 0.0F, 4.9728F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 284, 379, 0.0F, 3.4F, -13.85F, 1, 2, 4, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 381, 129, 0.6364F, 4.3364F, -13.85F, 1, 1, 4, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 381, 135, -0.6364F, 4.3364F, -13.85F, 1, 1, 4, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 245, 381, 0.0F, 4.9728F, -13.85F, 1, 1, 4, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 271, 381, 0.0F, 0.2993F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 380, 363, 0.0F, 0.425F, -4.6F, 1, 2, 4, -0.225F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 295, 381, 0.0F, 1.6428F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 306, 381, 0.6718F, 0.971F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 381, 317, -0.6717F, 0.971F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 81, 41, 0.0F, 3.8F, -11.0F, 1, 1, 38, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 87, 0, 0.0F, 4.9314F, -11.0F, 1, 1, 38, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 79, 121, 0.5657F, 4.3657F, -11.0F, 1, 1, 38, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 122, -0.5657F, 4.3657F, -11.0F, 1, 1, 38, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 388, 196, 0.0F, 3.65F, -16.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 388, 343, 0.0F, 5.0642F, -16.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 388, 348, 0.7071F, 4.3571F, -16.5F, 1, 1, 3, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 89, 389, -0.7071F, 4.3571F, -16.5F, 1, 1, 3, 0.0F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(1.0F, 5.3571F, -25.0F);
		barrelGroup.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 254, 389, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 5.3571F, -25.0F);
		barrelGroup.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 389, 243, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(1.0F, 4.3571F, -25.0F);
		barrelGroup.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 315, 388, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.0F, 4.3571F, -25.0F);
		barrelGroup.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 388, 201, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(0.9F, 5.2657F, 10.5F);
		barrelGroup.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 160, 40, -0.5F, -0.5F, -21.5F, 1, 1, 38, -0.1F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(0.1F, 5.2657F, 10.5F);
		barrelGroup.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 158, 121, -0.5F, -0.5F, -21.5F, 1, 1, 38, -0.1F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(0.9F, 4.4657F, 10.5F);
		barrelGroup.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 0, 82, -0.5F, -0.5F, -21.5F, 1, 1, 38, -0.1F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.1F, 4.4657F, 10.5F);
		barrelGroup.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 81, 81, -0.5F, -0.5F, -21.5F, 1, 1, 38, -0.1F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.025F, 1.946F, 4.7F);
		barrelGroup.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 349, 381, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.975F, 1.946F, 4.7F);
		barrelGroup.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 338, 381, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(0.975F, 0.996F, 4.7F);
		barrelGroup.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 381, 329, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.025F, 0.996F, 4.7F);
		barrelGroup.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 381, 323, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.05F, 5.2864F, -6.35F);
		barrelGroup.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.7854F);
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 167, 381, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.05F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 375, 183, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 388, 191, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(0.05F, 4.3864F, -6.35F);
		barrelGroup.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 131, 381, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.05F, false));
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 299, 374, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 388, 176, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(0.95F, 5.2864F, -6.35F);
		barrelGroup.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 381, 123, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.05F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 249, 374, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 388, 186, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun250_r6 = new ModelRenderer(this);
		gun250_r6.setRotationPoint(0.95F, 4.3864F, -6.35F);
		barrelGroup.addChild(gun250_r6);
		setRotationAngle(gun250_r6, 0.0F, 0.0F, -0.7854F);
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 120, 381, -0.5F, -0.5F, -7.5F, 1, 1, 4, -0.05F, false));
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 312, 374, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 388, 181, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(0.0F, 1.99F, 6.4F);
		barrelGroup.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 179, 256, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		gun249_r7 = new ModelRenderer(this);
		gun249_r7.setRotationPoint(1.0F, 1.99F, 6.4F);
		barrelGroup.addChild(gun249_r7);
		setRotationAngle(gun249_r7, 0.0F, 0.0F, -0.7854F);
		gun249_r7.cubeList.add(new ModelBox(gun249_r7, 239, 27, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(1.0F, 0.9899F, 6.4F);
		barrelGroup.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 237, 134, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.0F, 0.9899F, 6.4F);
		barrelGroup.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 237, 107, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroup.addChild(irons);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons.addChild(frontSightBlock);
		frontSightBlock.cubeList.add(new ModelBox(frontSightBlock, 271, 398, -2.0F, -37.7F, -133.975F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-0.399F, -38.2371F, -133.5403F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, -0.48F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 393, 252, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.714F, -37.7753F, -133.5403F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.48F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 393, 248, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(0.0627F, -36.8033F, -133.5403F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 200, 393, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-2.1757F, -37.265F, -133.5403F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, -0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 134, 393, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.5F, -33.525F, -133.65F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.0F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 386, 219, 0.6F, -1.0F, -1.0F, 2, 4, 2, -0.3F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.5F, -33.525F, -135.05F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.0F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 262, 374, 0.6F, -3.0F, -1.0F, 2, 6, 2, -0.3F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 392, 131, 0.6F, 3.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 392, 136, 1.2F, 3.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-1.5F, -31.625F, -142.35F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, 0.0F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 392, 83, 0.6F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 392, 78, 1.2F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(2.0F, 39.225F, 54.95F);
		barrelGroup.addChild(muzzle);
		muzzle.cubeList.add(new ModelBox(muzzle, 324, 389, -2.8485F, -34.9265F, -73.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 390, 156, -1.1515F, -34.9265F, -73.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 390, 161, -2.0F, -34.0779F, -73.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 175, 390, -2.0F, -35.775F, -73.7F, 1, 1, 3, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 123, 400, -2.8485F, -34.9265F, -76.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 128, 400, -1.1515F, -34.9265F, -76.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 189, 400, -2.0F, -34.0779F, -76.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 199, 400, -2.0F, -35.775F, -76.6F, 1, 1, 1, 0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 386, 209, -2.5F, -36.275F, -76.4F, 2, 1, 3, -0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 386, 214, -2.5F, -33.5779F, -76.4F, 2, 1, 3, -0.4F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 393, 264, -2.8839F, -34.9161F, -70.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 310, 393, -1.1161F, -34.9161F, -70.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 317, 393, -2.0F, -34.0322F, -70.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 393, 373, -2.0F, -35.8F, -70.5F, 1, 1, 2, 0.125F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 400, 246, -2.0F, -35.475F, -77.4F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 400, 255, -2.0F, -34.3436F, -77.4F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 400, 258, -1.4343F, -34.9093F, -77.4F, 1, 1, 1, -0.1F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 400, 261, -2.5657F, -34.9093F, -77.4F, 1, 1, 1, -0.1F, false));

		gun250_r7 = new ModelRenderer(this);
		gun250_r7.setRotationPoint(-1.1F, -34.0093F, -92.9F);
		muzzle.addChild(gun250_r7);
		setRotationAngle(gun250_r7, 0.0F, 0.0F, -0.7854F);
		gun250_r7.cubeList.add(new ModelBox(gun250_r7, 400, 267, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r8 = new ModelRenderer(this);
		gun249_r8.setRotationPoint(-1.9F, -34.0093F, -92.9F);
		muzzle.addChild(gun249_r8);
		setRotationAngle(gun249_r8, 0.0F, 0.0F, -0.7854F);
		gun249_r8.cubeList.add(new ModelBox(gun249_r8, 400, 264, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun249_r9 = new ModelRenderer(this);
		gun249_r9.setRotationPoint(-1.1F, -34.8093F, -92.9F);
		muzzle.addChild(gun249_r9);
		setRotationAngle(gun249_r9, 0.0F, 0.0F, -0.7854F);
		gun249_r9.cubeList.add(new ModelBox(gun249_r9, 400, 252, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun248_r5 = new ModelRenderer(this);
		gun248_r5.setRotationPoint(-1.9F, -34.8093F, -92.9F);
		muzzle.addChild(gun248_r5);
		setRotationAngle(gun248_r5, 0.0F, 0.0F, -0.7854F);
		gun248_r5.cubeList.add(new ModelBox(gun248_r5, 400, 249, -0.5F, -0.5F, 15.5F, 1, 1, 1, -0.1F, false));

		gun250_r8 = new ModelRenderer(this);
		gun250_r8.setRotationPoint(-4.2463F, -37.1624F, -80.0F);
		muzzle.addChild(gun250_r8);
		setRotationAngle(gun250_r8, 0.0F, 0.0F, -0.7854F);
		gun250_r8.cubeList.add(new ModelBox(gun250_r8, 347, 393, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(-2.9963F, -37.1624F, -80.0F);
		muzzle.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 340, 393, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun251_r4 = new ModelRenderer(this);
		gun251_r4.setRotationPoint(-4.2463F, -35.9124F, -80.0F);
		muzzle.addChild(gun251_r4);
		setRotationAngle(gun251_r4, 0.0F, 0.0F, -0.7854F);
		gun251_r4.cubeList.add(new ModelBox(gun251_r4, 393, 260, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(-2.9963F, -35.9124F, -80.0F);
		muzzle.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 393, 256, -0.5F, 2.5F, 9.5F, 1, 1, 2, 0.125F, false));

		gun250_r9 = new ModelRenderer(this);
		gun250_r9.setRotationPoint(-4.2213F, -37.1478F, -88.1F);
		muzzle.addChild(gun250_r9);
		setRotationAngle(gun250_r9, 0.0F, 0.0F, -0.7854F);
		gun250_r9.cubeList.add(new ModelBox(gun250_r9, 147, 388, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun250_r9.cubeList.add(new ModelBox(gun250_r9, 390, 171, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));

		gun251_r5 = new ModelRenderer(this);
		gun251_r5.setRotationPoint(-3.0213F, -37.1478F, -88.1F);
		muzzle.addChild(gun251_r5);
		setRotationAngle(gun251_r5, 0.0F, 0.0F, -0.7854F);
		gun251_r5.cubeList.add(new ModelBox(gun251_r5, 194, 400, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun251_r5.cubeList.add(new ModelBox(gun251_r5, 390, 166, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));

		gun251_r6 = new ModelRenderer(this);
		gun251_r6.setRotationPoint(-4.2213F, -35.9478F, -88.1F);
		muzzle.addChild(gun251_r6);
		setRotationAngle(gun251_r6, 0.0F, 0.0F, -0.7854F);
		gun251_r6.cubeList.add(new ModelBox(gun251_r6, 377, 387, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun251_r6.cubeList.add(new ModelBox(gun251_r6, 285, 389, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));

		gun252_r2 = new ModelRenderer(this);
		gun252_r2.setRotationPoint(-3.0213F, -35.9478F, -88.1F);
		muzzle.addChild(gun252_r2);
		setRotationAngle(gun252_r2, 0.0F, 0.0F, -0.7854F);
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 118, 400, -0.5F, 2.5F, 11.5F, 1, 1, 1, 0.1F, false));
		gun252_r2.cubeList.add(new ModelBox(gun252_r2, 276, 389, -0.5F, 2.5F, 14.4F, 1, 1, 3, 0.1F, false));
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