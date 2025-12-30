package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400KBarrel extends ModelBase {
	private final ModelRenderer barrelGroupK;
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
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun249_r6;
	private final ModelRenderer gun248_r4;
	private final ModelRenderer gun247_r1;
	private final ModelRenderer irons3;
	private final ModelRenderer frontSightBlock2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;

	public AK400KBarrel() {
		textureWidth = 416;
		textureHeight = 416;

		barrelGroupK = new ModelRenderer(this);
		barrelGroupK.setRotationPoint(-2.0F, -15.0F, -60.0F);
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 304, 164, 0.0F, 0.2828F, 4.9F, 1, 1, 20, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 304, 186, 0.0F, 1.697F, 4.9F, 1, 1, 20, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 305, 208, 0.7071F, 0.9899F, 4.9F, 1, 1, 20, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 306, 27, -0.7071F, 0.9899F, 4.9F, 1, 1, 20, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 386, 351, 0.0F, 3.7F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 386, 356, 0.0F, 4.9728F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 386, 361, 0.6364F, 4.3364F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 386, 366, -0.6364F, 4.3364F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 374, 149, -0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 373, 374, 0.0F, 3.7F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 376, 78, 0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 376, 92, 0.0F, 4.9728F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 348, 378, 0.0F, 0.2993F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 359, 378, 0.0F, 0.825F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 37, 379, 0.0F, 1.6428F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 136, 379, 0.6718F, 0.971F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 147, 379, -0.6717F, 0.971F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 191, 212, 0.0F, 3.8F, 0.0F, 1, 1, 27, -0.1F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 191, 241, 0.0F, 4.9314F, 0.0F, 1, 1, 27, -0.1F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 114, 242, 0.5657F, 4.3657F, 0.0F, 1, 1, 27, -0.1F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 0, 247, -0.5657F, 4.3657F, 0.0F, 1, 1, 27, -0.1F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 82, 369, 0.0F, 3.65F, -6.5F, 1, 1, 7, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 99, 369, 0.0F, 5.0642F, -6.5F, 1, 1, 7, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 116, 369, 0.7071F, 4.3571F, -6.5F, 1, 1, 7, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 242, 369, -0.7071F, 4.3571F, -6.5F, 1, 1, 7, 0.0F, false));
		barrelGroupK.cubeList.add(new ModelBox(barrelGroupK, 378, 27, 0.0F, 0.425F, 0.4F, 1, 2, 4, -0.225F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(1.0F, 4.3571F, -11.0F);
		barrelGroupK.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 149, 399, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 387, 158, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(1.0F, 5.3571F, -11.0F);
		barrelGroupK.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -0.7854F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 144, 399, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 240, 387, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(0.0F, 5.3571F, -11.0F);
		barrelGroupK.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 139, 399, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 231, 387, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 4.3571F, -11.0F);
		barrelGroupK.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 134, 399, -0.5F, -0.5F, 4.5F, 1, 1, 1, 0.0F, false));
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 387, 153, -0.5F, -0.5F, 8.5F, 1, 1, 3, 0.0F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(0.9F, 5.2657F, 10.5F);
		barrelGroupK.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 248, 212, -0.5F, -0.5F, -10.5F, 1, 1, 27, -0.1F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.1F, 5.2657F, 10.5F);
		barrelGroupK.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 57, 247, -0.5F, -0.5F, -10.5F, 1, 1, 27, -0.1F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(0.9F, 4.4657F, 10.5F);
		barrelGroupK.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 57, 218, -0.5F, -0.5F, -10.5F, 1, 1, 27, -0.1F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.1F, 4.4657F, 10.5F);
		barrelGroupK.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 0, 218, -0.5F, -0.5F, -10.5F, 1, 1, 27, -0.1F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(0.025F, 1.946F, 9.7F);
		barrelGroupK.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 379, 199, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(0.975F, 1.946F, 9.7F);
		barrelGroupK.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 379, 193, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.975F, 0.996F, 9.7F);
		barrelGroupK.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 169, 379, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.025F, 0.996F, 9.7F);
		barrelGroupK.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 158, 379, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(0.95F, 5.2864F, 13.65F);
		barrelGroupK.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.7854F);
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 376, 85, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun251_r3.cubeList.add(new ModelBox(gun251_r3, 387, 133, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(0.05F, 4.3864F, 13.65F);
		barrelGroupK.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 376, 71, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 386, 371, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.95F, 4.3864F, 13.65F);
		barrelGroupK.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 376, 64, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 386, 376, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.05F, 5.2864F, 13.65F);
		barrelGroupK.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.7854F);
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 374, 156, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 387, 148, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(0.0F, 1.99F, 6.4F);
		barrelGroupK.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 306, 115, -0.5F, -0.5F, -1.5F, 1, 1, 20, 0.0F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(1.0F, 1.99F, 6.4F);
		barrelGroupK.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 306, 93, -0.5F, -0.5F, -1.5F, 1, 1, 20, 0.0F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(1.0F, 0.9899F, 6.4F);
		barrelGroupK.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 306, 71, -0.5F, -0.5F, -1.5F, 1, 1, 20, 0.0F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.0F, 0.9899F, 6.4F);
		barrelGroupK.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 306, 49, -0.5F, -0.5F, -1.5F, 1, 1, 20, 0.0F, false));

		irons3 = new ModelRenderer(this);
		irons3.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroupK.addChild(irons3);
		

		frontSightBlock2 = new ModelRenderer(this);
		frontSightBlock2.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons3.addChild(frontSightBlock2);
		frontSightBlock2.cubeList.add(new ModelBox(frontSightBlock2, 396, 86, -2.0F, -37.7F, -128.975F, 1, 2, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-0.399F, -38.2371F, -128.5403F);
		frontSightBlock2.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, -0.48F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 21, 393, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.714F, -37.7753F, -128.5403F);
		frontSightBlock2.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.48F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 14, 393, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(0.0627F, -36.8033F, -128.5403F);
		frontSightBlock2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 384, 392, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-2.1757F, -37.265F, -128.5403F);
		frontSightBlock2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, -0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 392, 381, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.5F, -33.525F, -128.65F);
		frontSightBlock2.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.0F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 382, 284, 0.6F, -1.0F, -1.0F, 2, 4, 2, -0.3F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.5F, -33.525F, -130.05F);
		frontSightBlock2.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.0F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 133, 369, 0.6F, -3.0F, -1.0F, 2, 6, 2, -0.3F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 116, 389, 0.6F, 3.0F, -1.0F, 1, 2, 2, -0.2F, false));
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 389, 113, 1.2F, 3.0F, -1.0F, 1, 2, 2, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelGroupK.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}