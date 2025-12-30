package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4Stock extends ModelBase {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone7;
	private final ModelRenderer gun368;
	private final ModelRenderer gun386;
	private final ModelRenderer gun394;
	private final ModelRenderer gun395;
	private final ModelRenderer gun418;
	private final ModelRenderer gun419;
	private final ModelRenderer gun420;
	private final ModelRenderer gun421;
	private final ModelRenderer gun422;
	private final ModelRenderer gun423;
	private final ModelRenderer gun424;
	private final ModelRenderer gun426;
	private final ModelRenderer gun427;
	private final ModelRenderer gun428;
	private final ModelRenderer gun429;
	private final ModelRenderer gun442;
	private final ModelRenderer gun443;
	private final ModelRenderer gun4433;
	private final ModelRenderer gun444;
	private final ModelRenderer gun445;
	private final ModelRenderer gun446;
	private final ModelRenderer gun447;
	private final ModelRenderer gun448;
	private final ModelRenderer gun449;
	private final ModelRenderer buttplate;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public M4Stock() {
		textureWidth = 416;
		textureHeight = 416;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, -16.0F, -4.0F);
		stock.cubeList.add(new ModelBox(stock, 96, 257, -2.5F, -0.25F, 19.0F, 2, 2, 22, -0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 262, 72, -2.5F, 3.75F, 19.0F, 2, 2, 22, -0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 214, 25, -3.7728F, 1.0228F, 19.0F, 2, 3, 22, -0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 214, 0, -1.2272F, 1.0228F, 19.0F, 2, 3, 22, -0.1F, false));
		stock.cubeList.add(new ModelBox(stock, 208, 377, -3.9F, 1.7F, 19.3F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 124, 378, -3.9F, 1.7F, 23.6F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 134, 378, -3.9F, 1.7F, 27.9F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 296, 141, -3.9F, 1.7F, 32.2F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 379, -3.9F, 1.7F, 36.6F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 102, -3.9F, 2.75F, 23.6F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 97, -3.9F, 2.75F, 19.3F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 52, 380, -3.9F, 2.75F, 27.9F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 316, 141, -3.9F, 2.75F, 32.2F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 380, -3.9F, 2.75F, 36.6F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 260, -0.1F, 2.75F, 23.6F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 255, -0.1F, 2.75F, 19.3F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 153, -0.1F, 2.75F, 27.9F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 248, 364, -0.1F, 2.75F, 32.2F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 148, -0.1F, 2.75F, 36.6F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 143, -0.1F, 1.7F, 19.3F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 380, 138, -0.1F, 1.7F, 23.6F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 114, 380, -0.1F, 1.7F, 27.9F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 326, 141, -0.1F, 1.7F, 32.2F, 1, 1, 4, -0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 104, 380, -0.1F, 1.7F, 36.6F, 1, 1, 4, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.3F, 4.0F, 29.95F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.5236F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 379, -0.5F, -0.5F, -10.65F, 1, 1, 4, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 379, -0.5F, -0.5F, -6.35F, 1, 1, 4, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 258, 379, -0.5F, -0.5F, -2.05F, 1, 1, 4, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 306, 141, -0.5F, -0.5F, 2.25F, 1, 1, 4, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 268, 379, -0.5F, -0.5F, 6.65F, 1, 1, 4, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.3F, 4.0F, 29.95F);
		stock.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.5236F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 380, 285, -0.5F, -0.5F, 6.65F, 1, 1, 4, -0.2F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 248, 369, -0.5F, -0.5F, 2.25F, 1, 1, 4, -0.2F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 346, 380, -0.5F, -0.5F, -2.05F, 1, 1, 4, -0.2F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 356, 380, -0.5F, -0.5F, -6.35F, 1, 1, 4, -0.2F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 366, 380, -0.5F, -0.5F, -10.65F, 1, 1, 4, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.6F, 3.9228F, 20.0F);
		stock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 262, 24, -1.0F, -1.0F, -1.0F, 2, 2, 22, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.4F, 3.9228F, 20.0F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 262, 48, -1.0F, -1.0F, -1.0F, 2, 2, 22, -0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.6F, 1.1228F, 20.0F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 262, 0, -1.0F, -1.0F, -1.0F, 2, 2, 22, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.4F, 1.1228F, 20.0F);
		stock.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 260, 253, -1.0F, -1.0F, -1.0F, 2, 2, 22, -0.1F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 38.0F, 13.0F);
		stock.addChild(bone7);
		

		gun368 = new ModelRenderer(this);
		gun368.setRotationPoint(-2.0F, -33.0F, 8.5F);
		bone7.addChild(gun368);
		gun368.cubeList.add(new ModelBox(gun368, 362, 181, 0.0F, 0.0F, 2.0F, 1, 1, 17, 0.0F, false));

		gun386 = new ModelRenderer(this);
		gun386.setRotationPoint(-2.0F, -31.3F, 10.5F);
		bone7.addChild(gun386);
		gun386.cubeList.add(new ModelBox(gun386, 362, 162, 0.0F, 0.0F, 0.0F, 1, 2, 17, 0.0F, false));

		gun394 = new ModelRenderer(this);
		gun394.setRotationPoint(-2.5F, -23.0F, 26.2F);
		bone7.addChild(gun394);
		setRotationAngle(gun394, -0.0372F, 0.0F, 0.0F);
		gun394.cubeList.add(new ModelBox(gun394, 392, 29, 0.0F, 1.0F, -0.2F, 2, 1, 1, 0.0F, false));

		gun395 = new ModelRenderer(this);
		gun395.setRotationPoint(-3.0F, -23.5F, 26.25F);
		bone7.addChild(gun395);
		setRotationAngle(gun395, -0.0372F, 0.0F, 0.0F);
		gun395.cubeList.add(new ModelBox(gun395, 212, 386, 0.001F, 0.0F, -0.2F, 3, 2, 1, 0.0F, false));

		gun418 = new ModelRenderer(this);
		gun418.setRotationPoint(-2.5F, -29.3F, 10.5F);
		bone7.addChild(gun418);
		setRotationAngle(gun418, 1.4128F, 0.0F, 0.0F);
		gun418.cubeList.add(new ModelBox(gun418, 206, 271, 0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

		gun419 = new ModelRenderer(this);
		gun419.setRotationPoint(-2.5F, -29.45F, 15.6F);
		bone7.addChild(gun419);
		setRotationAngle(gun419, -0.4461F, 0.0F, 0.0F);
		gun419.cubeList.add(new ModelBox(gun419, 222, 364, 0.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

		gun420 = new ModelRenderer(this);
		gun420.setRotationPoint(-2.5F, -26.0F, 20.6F);
		bone7.addChild(gun420);
		setRotationAngle(gun420, 0.8179F, 0.0F, 0.0F);
		gun420.cubeList.add(new ModelBox(gun420, 174, 323, 0.001F, 0.0F, 0.0F, 2, 7, 1, 0.0F, false));

		gun421 = new ModelRenderer(this);
		gun421.setRotationPoint(-2.5F, -26.0F, 20.6F);
		bone7.addChild(gun421);
		setRotationAngle(gun421, 0.8179F, 0.0F, 0.0F);
		gun421.cubeList.add(new ModelBox(gun421, 392, 31, -0.001F, 6.3F, 0.001F, 2, 1, 1, 0.0F, false));

		gun422 = new ModelRenderer(this);
		gun422.setRotationPoint(-2.5F, -27.0F, 20.6F);
		bone7.addChild(gun422);
		setRotationAngle(gun422, -0.2974F, 0.0F, 0.0F);
		gun422.cubeList.add(new ModelBox(gun422, 144, 241, -0.001F, 0.0F, 0.5F, 2, 1, 7, 0.0F, false));

		gun423 = new ModelRenderer(this);
		gun423.setRotationPoint(-3.0F, -25.5F, 23.0F);
		bone7.addChild(gun423);
		setRotationAngle(gun423, -0.1487F, 0.0F, 0.0F);
		gun423.cubeList.add(new ModelBox(gun423, 286, 247, 0.001F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun424 = new ModelRenderer(this);
		gun424.setRotationPoint(-3.0F, -24.5F, 22.8F);
		bone7.addChild(gun424);
		setRotationAngle(gun424, 0.8179F, 0.0F, 0.0F);
		gun424.cubeList.add(new ModelBox(gun424, 96, 382, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		gun426 = new ModelRenderer(this);
		gun426.setRotationPoint(-2.0F, -29.3F, 15.9F);
		bone7.addChild(gun426);
		gun426.cubeList.add(new ModelBox(gun426, 196, 364, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun427 = new ModelRenderer(this);
		gun427.setRotationPoint(-2.0F, -28.3F, 17.9F);
		bone7.addChild(gun427);
		gun427.cubeList.add(new ModelBox(gun427, 248, 146, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun428 = new ModelRenderer(this);
		gun428.setRotationPoint(-2.0F, -27.3F, 19.9F);
		bone7.addChild(gun428);
		gun428.cubeList.add(new ModelBox(gun428, 48, 224, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun429 = new ModelRenderer(this);
		gun429.setRotationPoint(-2.0F, -26.3F, 22.9F);
		bone7.addChild(gun429);
		gun429.cubeList.add(new ModelBox(gun429, 236, 122, 0.0F, 0.0F, -0.2F, 1, 2, 5, 0.0F, false));

		gun442 = new ModelRenderer(this);
		gun442.setRotationPoint(-2.0F, -32.3F, 10.0F);
		bone7.addChild(gun442);
		gun442.cubeList.add(new ModelBox(gun442, 364, 290, -0.001F, 0.0F, 0.5F, 1, 1, 11, 0.0F, false));

		gun443 = new ModelRenderer(this);
		gun443.setRotationPoint(-2.0F, -32.3F, 26.0F);
		bone7.addChild(gun443);
		gun443.cubeList.add(new ModelBox(gun443, 388, 374, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun4433 = new ModelRenderer(this);
		gun4433.setRotationPoint(-2.5F, -33.3F, 12.5F);
		bone7.addChild(gun4433);
		gun4433.cubeList.add(new ModelBox(gun4433, 376, 380, 0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

		gun444 = new ModelRenderer(this);
		gun444.setRotationPoint(-2.0F, -29.4F, 13.0F);
		bone7.addChild(gun444);
		gun444.cubeList.add(new ModelBox(gun444, 128, 329, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun445 = new ModelRenderer(this);
		gun445.setRotationPoint(-3.0F, -30.6F, 11.3F);
		bone7.addChild(gun445);
		setRotationAngle(gun445, -0.0372F, 0.0F, 0.0F);
		gun445.cubeList.add(new ModelBox(gun445, 372, 131, 0.001F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun446 = new ModelRenderer(this);
		gun446.setRotationPoint(-3.0F, -30.4F, 16.3F);
		bone7.addChild(gun446);
		setRotationAngle(gun446, -0.8551F, 0.0F, 0.0F);
		gun446.cubeList.add(new ModelBox(gun446, 64, 376, 0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun447 = new ModelRenderer(this);
		gun447.setRotationPoint(-3.0F, -26.6F, 18.6F);
		bone7.addChild(gun447);
		gun447.cubeList.add(new ModelBox(gun447, 220, 386, 0.001F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun448 = new ModelRenderer(this);
		gun448.setRotationPoint(-3.0F, -30.4F, 16.3F);
		bone7.addChild(gun448);
		setRotationAngle(gun448, -0.8551F, 0.0F, 0.0F);
		gun448.cubeList.add(new ModelBox(gun448, 378, 232, 0.0F, 1.0F, 5.0F, 3, 1, 1, 0.0F, false));

		gun449 = new ModelRenderer(this);
		gun449.setRotationPoint(-3.0F, -23.7F, 24.0F);
		bone7.addChild(gun449);
		setRotationAngle(gun449, 1.041F, 0.0F, 0.0F);
		gun449.cubeList.add(new ModelBox(gun449, 198, 377, -0.001F, 0.1F, -0.2F, 3, 3, 2, 0.0F, false));

		buttplate = new ModelRenderer(this);
		buttplate.setRotationPoint(-1.5625F, 7.6639F, 40.8F);
		stock.addChild(buttplate);
		setRotationAngle(buttplate, -0.0873F, 0.0F, 0.0F);
		buttplate.cubeList.add(new ModelBox(buttplate, 386, 272, -0.9375F, 7.8021F, -0.5F, 2, 3, 1, 0.0F, false));
		buttplate.cubeList.add(new ModelBox(buttplate, 388, 388, -0.8517F, -8.2102F, -0.5F, 2, 2, 1, 0.0F, false));
		buttplate.cubeList.add(new ModelBox(buttplate, 128, 332, -1.0233F, -8.2102F, -0.5F, 1, 2, 1, 0.0F, false));
		buttplate.cubeList.add(new ModelBox(buttplate, 212, 231, -2.4375F, -6.796F, -0.5F, 5, 15, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.5715F, 9.4361F, 0.0F);
		buttplate.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.5236F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 280, 386, -1.0F, -2.0F, -0.5F, 2, 3, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.6965F, 9.4361F, 0.0F);
		buttplate.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.5236F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 386, 276, -1.0F, -2.0F, -0.5F, 2, 3, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0233F, -5.3818F, -0.5F);
		buttplate.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 382, 388, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.1483F, -5.3818F, -0.5F);
		buttplate.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 388, 377, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));
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