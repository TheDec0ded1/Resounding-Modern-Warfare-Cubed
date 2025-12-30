package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400SKBarrel extends ModelBase {
	private final ModelRenderer barrelGroupSK;
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
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun249_r6;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun250_r6;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun249_r7;
	private final ModelRenderer gun248_r4;
	private final ModelRenderer gun247_r1;
	private final ModelRenderer irons4;
	private final ModelRenderer frontSightBlock3;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer bone17;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public AK400SKBarrel() {
		textureWidth = 416;
		textureHeight = 416;

		barrelGroupSK = new ModelRenderer(this);
		barrelGroupSK.setRotationPoint(-2.0F, -15.0F, -55.0F);
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 324, 297, 0.0F, 0.2828F, 4.9F, 1, 1, 16, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 166, 337, 0.0F, 1.697F, 4.9F, 1, 1, 16, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 82, 338, 0.7071F, 0.9899F, 4.9F, 1, 1, 16, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 201, 338, -0.7071F, 0.9899F, 4.9F, 1, 1, 16, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 330, 387, 0.0F, 3.7F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 364, 387, 0.0F, 4.9728F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 373, 387, 0.6364F, 4.3364F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 382, 387, -0.6364F, 4.3364F, 1.15F, 1, 1, 3, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 376, 99, -0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 376, 113, 0.0F, 3.7F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 377, 13, 0.6364F, 4.3364F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 377, 225, 0.0F, 4.9728F, 5.15F, 1, 1, 5, -0.05F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 379, 205, 0.0F, 0.2993F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 211, 379, 0.0F, 0.825F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 379, 211, 0.0F, 1.6428F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 379, 217, 0.6718F, 0.971F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 222, 379, -0.6717F, 0.971F, 1.2F, 1, 1, 4, -0.025F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 114, 271, 0.0F, 3.8F, 0.0F, 1, 1, 22, -0.1F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 277, 270, 0.0F, 4.9314F, 0.0F, 1, 1, 22, -0.1F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 277, 294, 0.5657F, 4.3657F, 0.0F, 1, 1, 22, -0.1F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 94, 295, -0.5657F, 4.3657F, 0.0F, 1, 1, 22, -0.1F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 86, 388, 0.0F, 3.65F, -2.5F, 1, 1, 3, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 135, 388, 0.0F, 5.0642F, -2.5F, 1, 1, 3, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 155, 388, 0.7071F, 4.3571F, -2.5F, 1, 1, 3, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 194, 388, -0.7071F, 4.3571F, -2.5F, 1, 1, 3, 0.0F, false));
		barrelGroupSK.cubeList.add(new ModelBox(barrelGroupSK, 378, 34, 0.0F, 0.425F, 0.4F, 1, 2, 4, -0.225F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(1.0F, 5.3571F, -11.0F);
		barrelGroupSK.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.7854F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 369, 329, -0.5F, -0.5F, 5.5F, 1, 1, 6, 0.0F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, 5.3571F, -11.0F);
		barrelGroupSK.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 274, 369, -0.5F, -0.5F, 5.5F, 1, 1, 6, 0.0F, false));

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(1.0F, 4.3571F, -11.0F);
		barrelGroupSK.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -0.7854F);
		gun250_r2.cubeList.add(new ModelBox(gun250_r2, 259, 369, -0.5F, -0.5F, 5.5F, 1, 1, 6, 0.0F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.0F, 4.3571F, -11.0F);
		barrelGroupSK.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 150, 340, -0.5F, -0.5F, 5.5F, 1, 1, 6, 0.0F, false));

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(0.9F, 5.2657F, 10.5F);
		barrelGroupSK.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.7854F);
		gun250_r3.cubeList.add(new ModelBox(gun250_r3, 188, 297, -0.5F, -0.5F, -10.5F, 1, 1, 22, -0.1F, false));

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(0.1F, 5.2657F, 10.5F);
		barrelGroupSK.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		gun249_r2.cubeList.add(new ModelBox(gun249_r2, 141, 297, -0.5F, -0.5F, -10.5F, 1, 1, 22, -0.1F, false));

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(0.9F, 4.4657F, 10.5F);
		barrelGroupSK.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.7854F);
		gun249_r3.cubeList.add(new ModelBox(gun249_r3, 47, 276, -0.5F, -0.5F, -10.5F, 1, 1, 22, -0.1F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.1F, 4.4657F, 10.5F);
		barrelGroupSK.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 0, 276, -0.5F, -0.5F, -10.5F, 1, 1, 22, -0.1F, false));

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.025F, 1.946F, 9.7F);
		barrelGroupSK.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.7854F);
		gun249_r4.cubeList.add(new ModelBox(gun249_r4, 381, 381, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.975F, 1.946F, 9.7F);
		barrelGroupSK.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.7854F);
		gun250_r4.cubeList.add(new ModelBox(gun250_r4, 370, 381, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(0.975F, 0.996F, 9.7F);
		barrelGroupSK.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 380, 308, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.025F, 0.996F, 9.7F);
		barrelGroupSK.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 380, 302, -0.5F, -0.5F, -8.5F, 1, 1, 4, -0.025F, false));

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(0.95F, 5.2864F, 13.65F);
		barrelGroupSK.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -0.7854F);
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 24, 377, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun251_r2.cubeList.add(new ModelBox(gun251_r2, 49, 388, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun249_r6 = new ModelRenderer(this);
		gun249_r6.setRotationPoint(0.05F, 4.3864F, 13.65F);
		barrelGroupSK.addChild(gun249_r6);
		setRotationAngle(gun249_r6, 0.0F, 0.0F, -0.7854F);
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 11, 377, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun249_r6.cubeList.add(new ModelBox(gun249_r6, 20, 388, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.95F, 4.3864F, 13.65F);
		barrelGroupSK.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.7854F);
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 376, 120, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun250_r5.cubeList.add(new ModelBox(gun250_r5, 40, 388, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun250_r6 = new ModelRenderer(this);
		gun250_r6.setRotationPoint(0.05F, 5.2864F, 13.65F);
		barrelGroupSK.addChild(gun250_r6);
		setRotationAngle(gun250_r6, 0.0F, 0.0F, -0.7854F);
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 376, 106, -0.5F, -0.5F, -8.5F, 1, 1, 5, -0.05F, false));
		gun250_r6.cubeList.add(new ModelBox(gun250_r6, 77, 388, -0.5F, -0.5F, -12.5F, 1, 1, 3, -0.05F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(0.0F, 1.99F, 6.4F);
		barrelGroupSK.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 271, 339, -0.5F, -0.5F, -1.5F, 1, 1, 16, 0.0F, false));

		gun249_r7 = new ModelRenderer(this);
		gun249_r7.setRotationPoint(1.0F, 1.99F, 6.4F);
		barrelGroupSK.addChild(gun249_r7);
		setRotationAngle(gun249_r7, 0.0F, 0.0F, -0.7854F);
		gun249_r7.cubeList.add(new ModelBox(gun249_r7, 37, 339, -0.5F, -0.5F, -1.5F, 1, 1, 16, 0.0F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(1.0F, 0.9899F, 6.4F);
		barrelGroupSK.addChild(gun248_r4);
		setRotationAngle(gun248_r4, 0.0F, 0.0F, -0.7854F);
		gun248_r4.cubeList.add(new ModelBox(gun248_r4, 313, 338, -0.5F, -0.5F, -1.5F, 1, 1, 16, 0.0F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.0F, 0.9899F, 6.4F);
		barrelGroupSK.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 236, 338, -0.5F, -0.5F, -1.5F, 1, 1, 16, 0.0F, false));

		irons4 = new ModelRenderer(this);
		irons4.setRotationPoint(2.0F, 35.4F, 131.45F);
		barrelGroupSK.addChild(irons4);
		

		frontSightBlock3 = new ModelRenderer(this);
		frontSightBlock3.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons4.addChild(frontSightBlock3);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -33.525F, -128.65F);
		frontSightBlock3.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 382, 291, 0.6F, -1.0F, -1.0F, 2, 4, 2, -0.3F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, -33.525F, -130.05F);
		frontSightBlock3.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 11, 384, 0.6F, -1.0F, -1.0F, 2, 4, 2, -0.3F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(2.0F, 39.0F, 55.0F);
		barrelGroupSK.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 335, 382, -3.0F, -40.8F, -53.5F, 3, 2, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 389, 78, -0.7F, -42.5F, -53.8F, 1, 2, 2, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 389, 83, -3.3F, -42.5F, -53.8F, 1, 2, 2, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 389, 103, -0.7F, -42.5F, -53.2F, 1, 2, 2, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 95, 389, -3.3F, -42.5F, -53.2F, 1, 2, 2, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 168, 399, -2.31F, -43.49F, -52.2F, 1, 1, 1, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 185, 399, -2.0101F, -43.49F, -52.2F, 1, 1, 1, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 173, 399, -1.69F, -43.49F, -52.2F, 1, 1, 1, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 200, 399, -2.0101F, -43.49F, -53.8F, 1, 1, 1, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 195, 399, -2.31F, -43.49F, -53.8F, 1, 1, 1, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 190, 399, -1.69F, -43.49F, -53.8F, 1, 1, 1, -0.3F, false));
		bone17.cubeList.add(new ModelBox(bone17, 396, 90, -2.0F, -42.05F, -53.275F, 1, 2, 1, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.4444F, -41.6343F, -52.2F);
		bone17.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 389, 98, -1.8F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 389, 88, -1.8F, -1.0F, -1.6F, 1, 2, 2, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5556F, -41.6343F, -52.2F);
		bone17.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 389, 0.8F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 389, 93, 0.8F, -1.0F, -1.6F, 1, 2, 2, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelGroupSK.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}