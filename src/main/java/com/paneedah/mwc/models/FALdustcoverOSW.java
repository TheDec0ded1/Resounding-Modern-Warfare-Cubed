package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALdustcoverOSW extends ModelBase {
	private final ModelRenderer dustcoverDSA;
	private final ModelRenderer bone199;
	private final ModelRenderer bone200;
	private final ModelRenderer bone201;
	private final ModelRenderer bone202;
	private final ModelRenderer bone203;
	private final ModelRenderer bone204;
	private final ModelRenderer rail;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public FALdustcoverOSW() {
		textureWidth = 384;
		textureHeight = 384;

		dustcoverDSA = new ModelRenderer(this);
		dustcoverDSA.setRotationPoint(-1.5F, -16.4F, -27.65F);
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 0, 75, -1.0F, -1.4F, 0.0F, 2, 2, 32, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 62, 170, 0.45F, -0.75F, 6.0F, 1, 1, 25, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 214, 315, -1.45F, -0.75F, 12.0F, 1, 1, 19, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 0, 172, 1.35F, 0.05F, 6.0F, 1, 1, 25, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 0, 316, -2.35F, 0.05F, 12.0F, 1, 1, 19, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 298, 74, 0.95F, -0.35F, 8.0F, 1, 1, 21, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 340, 133, -1.95F, -0.35F, 13.0F, 1, 1, 16, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 0, 142, 0.75F, 1.1F, 3.0F, 2, 1, 29, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 292, 241, -2.75F, 1.1F, 11.0F, 2, 1, 21, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 142, 35, 0.751F, 0.6F, 3.0F, 2, 1, 29, 0.0F, false));
		dustcoverDSA.cubeList.add(new ModelBox(dustcoverDSA, 0, 294, -2.749F, 0.6F, 11.0F, 2, 1, 21, 0.0F, false));

		bone199 = new ModelRenderer(this);
		bone199.setRotationPoint(2.751F, 1.6F, 3.0F);
		dustcoverDSA.addChild(bone199);
		setRotationAngle(bone199, -0.6283F, -1.3614F, 0.6458F);
		bone199.cubeList.add(new ModelBox(bone199, 102, 196, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		bone199.cubeList.add(new ModelBox(bone199, 152, 217, -2.999F, -0.5F, -0.001F, 3, 1, 1, 0.0F, false));

		bone200 = new ModelRenderer(this);
		bone200.setRotationPoint(1.0F, -1.0F, 0.0F);
		dustcoverDSA.addChild(bone200);
		setRotationAngle(bone200, 0.0F, 0.0F, 0.733F);
		bone200.cubeList.add(new ModelBox(bone200, 0, 109, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));
		bone200.cubeList.add(new ModelBox(bone200, 68, 103, 0.7F, -0.002F, 0.001F, 1, 2, 32, 0.0F, false));
		bone200.cubeList.add(new ModelBox(bone200, 142, 65, 1.35F, -0.001F, 2.999F, 1, 1, 29, 0.0F, false));

		bone201 = new ModelRenderer(this);
		bone201.setRotationPoint(2.35F, -0.001F, 2.999F);
		bone200.addChild(bone201);
		setRotationAngle(bone201, 0.0F, -1.3614F, 0.0F);
		bone201.cubeList.add(new ModelBox(bone201, 160, 217, -3.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		bone202 = new ModelRenderer(this);
		bone202.setRotationPoint(-1.0F, -1.0F, 0.0F);
		dustcoverDSA.addChild(bone202);
		setRotationAngle(bone202, 0.0F, 0.0F, -0.733F);
		bone202.cubeList.add(new ModelBox(bone202, 134, 103, -1.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));
		bone202.cubeList.add(new ModelBox(bone202, 288, 268, -2.35F, -0.001F, 10.999F, 2, 2, 21, 0.0F, false));

		bone203 = new ModelRenderer(this);
		bone203.setRotationPoint(-1.8F, -0.001F, 9.999F);
		bone202.addChild(bone203);
		setRotationAngle(bone203, 0.0F, 0.6632F, 0.0F);
		bone203.cubeList.add(new ModelBox(bone203, 72, 372, -0.6156F, -0.001F, 0.788F, 1, 1, 1, 0.0F, false));

		bone204 = new ModelRenderer(this);
		bone204.setRotationPoint(2.9F, 1.6F, 5.0F);
		dustcoverDSA.addChild(bone204);
		setRotationAngle(bone204, -0.4363F, 0.0F, 0.0F);
		bone204.cubeList.add(new ModelBox(bone204, 174, 33, -1.0F, -9.6635F, 18.5794F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 110, 196, -5.8F, -9.6635F, 18.5794F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 76, 372, -1.0F, -10.7202F, 20.8451F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 128, 196, -5.8F, -10.7202F, 20.8451F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 296, 373, -1.0F, -6.0717F, 10.8756F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 292, 373, -1.0F, -5.0151F, 8.6098F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 304, 373, -1.0F, -1.4232F, 0.906F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 300, 373, -1.0F, -0.3666F, -1.3597F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 144, 265, -5.8F, -6.0717F, 10.8756F, 1, 1, 1, 0.0F, false));
		bone204.cubeList.add(new ModelBox(bone204, 248, 217, -5.8F, -5.0151F, 8.6098F, 1, 1, 1, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.0237F, -0.9381F, 17.0632F);
		dustcoverDSA.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 330, 239, -0.9737F, -1.0632F, -7.9132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 362, 231, -0.9737F, -1.0632F, -9.1132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 364, 332, -0.9737F, -1.0632F, -6.6632F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 368, 231, -0.9737F, -1.0632F, -5.4132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 116, 369, -0.9737F, -1.0632F, -4.1632F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 122, 369, -0.9737F, -1.0632F, -2.9132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 356, 369, -0.9737F, -1.0632F, -15.4132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 350, 369, -0.9737F, -1.0632F, -14.1632F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 344, 369, -0.9737F, -1.0632F, -12.9132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 338, 369, -0.9737F, -1.0632F, -11.6632F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 278, 369, -0.9737F, -1.0632F, -10.4132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 362, 369, -0.9737F, -1.0632F, -16.6632F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 206, 369, -0.9737F, -1.0632F, -1.6632F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 212, 369, -0.9737F, -1.0632F, 0.8368F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 218, 369, -0.9737F, -1.0632F, -0.4132F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 224, 369, -0.9737F, -1.0632F, 3.3368F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 230, 369, -0.9737F, -1.0632F, 2.0868F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 236, 369, -0.9737F, -1.0632F, 5.8368F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 242, 369, -0.9737F, -1.0632F, 4.5868F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 248, 369, -0.9737F, -1.0632F, 8.3368F, 2, 1, 1, -0.199F, false));
		rail.cubeList.add(new ModelBox(rail, 254, 369, -0.9737F, -1.0632F, 9.5368F, 2, 1, 1, -0.198F, false));
		rail.cubeList.add(new ModelBox(rail, 260, 369, -0.9737F, -1.0632F, 11.9868F, 2, 1, 1, -0.198F, false));
		rail.cubeList.add(new ModelBox(rail, 266, 369, -0.9737F, -1.0632F, 10.7868F, 2, 1, 1, -0.198F, false));
		rail.cubeList.add(new ModelBox(rail, 306, 365, -0.9737F, -1.0632F, 13.1368F, 2, 1, 2, -0.198F, false));
		rail.cubeList.add(new ModelBox(rail, 272, 369, -0.9737F, -1.0632F, 7.0868F, 2, 1, 1, -0.199F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		rail.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 134, 136, 8.1719F, -11.2447F, -4.95F, 1, 1, 32, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 154, 8.2219F, -11.3947F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 158, 372, 8.2219F, -11.3947F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 162, 372, 8.2219F, -11.3947F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 166, 372, 8.2219F, -11.3947F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 368, 250, 8.2219F, -11.3947F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 178, 8.2219F, -11.3947F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 180, 8.2219F, -11.3947F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 182, 8.2219F, -11.3947F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 184, 8.2219F, -11.3947F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 190, 8.2219F, -11.3947F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 192, 8.2219F, -11.3947F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 194, 8.2219F, -11.3947F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 196, 8.2219F, -11.3947F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 198, 8.2219F, -11.3947F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 200, 8.2219F, -11.3947F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 202, 8.2219F, -11.3947F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 204, 8.2219F, -11.3947F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 206, 8.2219F, -11.3947F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 299, 8.2219F, -11.3947F, -2.95F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 293, 8.2219F, -11.3947F, -1.7F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 291, 8.2219F, -11.3947F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 287, 8.2219F, -11.3947F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 284, 372, 8.2219F, -11.3947F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 303, 8.2219F, -11.3947F, -4.2F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 372, 208, 8.2219F, -11.3947F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		rail.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8901F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 137, 8.4491F, 10.5153F, -4.95F, 1, 1, 32, -0.35F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 210, 8.3991F, 10.3653F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 212, 8.3991F, 10.3653F, 22.0F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 214, 8.3991F, 10.3653F, 24.45F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 216, 8.3991F, 10.3653F, 23.25F, 1, 1, 1, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 368, 253, 8.3991F, 10.3653F, 25.6F, 1, 1, 2, -0.197F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 218, 8.3991F, 10.3653F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 220, 8.3991F, 10.3653F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 222, 8.3991F, 10.3653F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 224, 8.3991F, 10.3653F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 226, 8.3991F, 10.3653F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 228, 8.3991F, 10.3653F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 233, 8.3991F, 10.3653F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 235, 8.3991F, 10.3653F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 237, 8.3991F, 10.3653F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 239, 8.3991F, 10.3653F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 241, 8.3991F, 10.3653F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 243, 8.3991F, 10.3653F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 245, 8.3991F, 10.3653F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 297, 8.3991F, 10.3653F, -2.95F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 295, 8.3991F, 10.3653F, -1.7F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 289, 8.3991F, 10.3653F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 285, 8.3991F, 10.3653F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 283, 8.3991F, 10.3653F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 301, 8.3991F, 10.3653F, -4.2F, 1, 1, 1, -0.198F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 372, 247, 8.3991F, 10.3653F, 3.35F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcoverDSA.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}