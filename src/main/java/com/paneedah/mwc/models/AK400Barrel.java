package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400Barrel extends ModelBase {
	private final ModelRenderer barrelGroup;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun249_r6;
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

	public AK400Barrel() {
		textureWidth = 416;
		textureHeight = 416;

		barrelGroup = new ModelRenderer(this);
		barrelGroup.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 251, 144, 0.0F, 0.2828F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 253, 36, 0.0F, 1.697F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 253, 63, 0.7071F, 0.9899F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 253, 90, -0.7071F, 0.9899F, -0.1F, 1, 1, 25, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 108, 384, 0.0F, 3.7F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 117, 384, 0.0F, 4.9728F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 126, 384, 0.6364F, 4.3364F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 185, 384, -0.6364F, 4.3364F, -3.85F, 1, 1, 3, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 374, 133, -0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 373, 360, 0.0F, 3.7F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 364, 13, 0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 150, 348, 0.0F, 4.9728F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 164, 390, 0.6364F, 4.3364F, -11.85F, 1, 1, 2, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 390, 195, -0.6364F, 4.3364F, -11.85F, 1, 1, 2, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 390, 203, 0.0F, 4.9728F, -11.85F, 1, 1, 2, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 391, 288, 0.0F, 3.7F, -11.85F, 1, 1, 2, -0.05F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 48, 378, 0.0F, 0.2993F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 378, 53, 0.0F, 0.825F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 59, 378, 0.0F, 1.6428F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 70, 378, 0.6718F, 0.971F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 81, 378, -0.6717F, 0.971F, -3.8F, 1, 1, 4, -0.025F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 0, 0.0F, 3.8F, -17.0F, 1, 1, 44, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 91, 46, 0.0F, 4.9314F, -17.0F, 1, 1, 44, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 0, 92, 0.5657F, 4.3657F, -17.0F, 1, 1, 44, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 91, 92, -0.5657F, 4.3657F, -17.0F, 1, 1, 44, -0.1F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 352, 329, 0.0F, 3.65F, -23.5F, 1, 1, 7, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 331, 356, 0.0F, 5.0642F, -23.5F, 1, 1, 7, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 48, 369, 0.7071F, 4.3571F, -23.5F, 1, 1, 7, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 65, 369, -0.7071F, 4.3571F, -23.5F, 1, 1, 7, 0.0F, false));
		barrelGroup.cubeList.add(new ModelBox(barrelGroup, 378, 20, 0.0F, 0.425F, -4.6F, 1, 2, 4, -0.225F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(1.0F, 4.3571F, -28.0F);
		barrelGroup.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 398, 284, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 384, 332, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(1.0F, 5.3571F, -28.0F);
		barrelGroup.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 398, 287, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 355, 384, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(0.0F, 5.3571F, -28.0F);
		barrelGroup.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 398, 290, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 346, 384, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 4.3571F, -28.0F);
		barrelGroup.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 398, 293, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 384, 327, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(0.9F, 5.2657F, 10.5F);
		barrelGroup.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 91, 138, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.1F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.1F, 5.2657F, 10.5F);
		barrelGroup.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 0, 138, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.1F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(0.9F, 4.4657F, 10.5F);
		barrelGroup.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 91, 0, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.1F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.1F, 4.4657F, 10.5F);
		barrelGroup.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 0, 46, -0.5F, -0.5F, -27.5F, 1, 1, 44, -0.1F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(0.025F, 1.946F, 4.7F);
		barrelGroup.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 125, 378, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(0.975F, 1.946F, 4.7F);
		barrelGroup.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 114, 378, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.975F, 0.996F, 4.7F);
		barrelGroup.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 103, 378, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.025F, 0.996F, 4.7F);
		barrelGroup.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 92, 378, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.05F, 5.2864F, -6.35F);
		barrelGroup.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 390, 199, -0.5F, -0.5F, -5.5F, 1, 1, 2, -0.05F, false));
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 373, 367, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 321, 384, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(0.05F, 4.3864F, -6.35F);
		barrelGroup.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 390, 191, -0.5F, -0.5F, -5.5F, 1, 1, 2, -0.05F, false));
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 24, 370, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 294, 384, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(0.95F, 5.2864F, -6.35F);
		barrelGroup.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 144, 390, -0.5F, -0.5F, -5.5F, 1, 1, 2, -0.05F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 351, 13, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 312, 384, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.95F, 4.3864F, -6.35F);
		barrelGroup.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.7854F);
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 65, 390, -0.5F, -0.5F, -5.5F, 1, 1, 2, -0.05F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 373, 353, -0.5F, -0.5F, 11.5F, 1, 1, 5, -0.05F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 303, 384, -0.5F, -0.5F, 2.5F, 1, 1, 3, -0.05F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(0.0F, 1.99F, 6.4F);
		barrelGroup.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 224, 270, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(1.0F, 1.99F, 6.4F);
		barrelGroup.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 171, 270, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(1.0F, 0.9899F, 6.4F);
		barrelGroup.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 255, 0, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.0F, 0.9899F, 6.4F);
		barrelGroup.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 253, 117, -0.5F, -0.5F, -6.5F, 1, 1, 25, 0.0F, false));

		irons = new ModelRenderer(this);
		irons.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroup.addChild(irons);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons.addChild(frontSightBlock);
		frontSightBlock.cubeList.add(new ModelBox(frontSightBlock, 130, 395, -2.0F, -37.7F, -133.975F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-0.399F, -38.2371F, -133.5403F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, -0.48F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 390, 219, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.714F, -37.7753F, -133.5403F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.48F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 390, 215, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(0.0627F, -36.8033F, -133.5403F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 390, 211, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-2.1757F, -37.265F, -133.5403F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, -0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 390, 207, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.5F, -33.525F, -133.65F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.0F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 289, 369, 0.6F, -1.0F, -1.0F, 2, 4, 2, -0.3F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.5F, -33.525F, -135.05F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.0F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 161, 287, 0.6F, -3.0F, -1.0F, 2, 6, 2, -0.3F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 389, 108, 0.6F, 3.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 109, 389, 1.2F, 3.0F, -1.0F, 1, 2, 2, -0.2F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-1.5F, -31.625F, -142.35F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, 0.0F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 389, 48, 0.3F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 306, 351, 0.9F, 1.0F, -1.0F, 1, 2, 2, -0.2F, false));
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