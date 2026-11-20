package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK308Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer gun603;
	private final ModelRenderer gun506;
	private final ModelRenderer gun505;
	private final ModelRenderer gun505_r1;
	private final ModelRenderer gun504;
	private final ModelRenderer gun503;
	private final ModelRenderer gun492;
	private final ModelRenderer gun494_r1;
	private final ModelRenderer gun493_r1;
	private final ModelRenderer gun465;
	private final ModelRenderer gun462;
	private final ModelRenderer gun459;
	private final ModelRenderer gun441;
	private final ModelRenderer gun434;
	private final ModelRenderer gun433;
	private final ModelRenderer gun432;
	private final ModelRenderer gun428;
	private final ModelRenderer gun423;
	private final ModelRenderer gun152;
	private final ModelRenderer gun2;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer ribs;
	private final ModelRenderer cube_r7;
	private final ModelRenderer ribs2;
	private final ModelRenderer cube_r8;

	public AK308Handguard() {
		textureWidth = 432;
		textureHeight = 432;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.6242F, -34.7F, -36.605F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 299, 249, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.6242F, -34.7F, -36.605F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 134, 256, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		gun603 = new ModelRenderer(this);
		gun603.setRotationPoint(-1.6F, -39.7F, -53.5F);
		handguard.addChild(gun603);
		gun603.cubeList.add(new ModelBox(gun603, 358, 270, 0.0F, 0.0F, -4.0F, 1, 1, 21, 0.0F, false));

		gun506 = new ModelRenderer(this);
		gun506.setRotationPoint(1.2F, -34.8F, -50.5F);
		handguard.addChild(gun506);
		setRotationAngle(gun506, 0.0F, 0.0F, 2.0076F);
		gun506.cubeList.add(new ModelBox(gun506, 371, 49, -1.3955F, 0.3204F, -5.8F, 1, 1, 19, 0.0F, false));

		gun505 = new ModelRenderer(this);
		gun505.setRotationPoint(-4.2F, -34.8F, -50.5F);
		handguard.addChild(gun505);
		setRotationAngle(gun505, 0.0F, 0.0F, -0.3585F);
		

		gun505_r1 = new ModelRenderer(this);
		gun505_r1.setRotationPoint(3.1618F, 42.7747F, 50.5F);
		gun505.addChild(gun505_r1);
		setRotationAngle(gun505_r1, 0.0F, 0.0F, -0.0436F);
		gun505_r1.cubeList.add(new ModelBox(gun505_r1, 147, 371, -1.0211F, -44.2777F, -56.3F, 1, 1, 19, 0.0F, false));

		gun504 = new ModelRenderer(this);
		gun504.setRotationPoint(1.5F, -33.2F, -50.5F);
		handguard.addChild(gun504);
		setRotationAngle(gun504, 0.0F, 0.0F, 2.3562F);
		gun504.cubeList.add(new ModelBox(gun504, 188, 371, 0.0F, 0.0F, -5.8F, 1, 1, 19, 0.0F, false));

		gun503 = new ModelRenderer(this);
		gun503.setRotationPoint(-4.5F, -33.2F, -50.5F);
		handguard.addChild(gun503);
		setRotationAngle(gun503, 0.0F, 0.0F, -0.7854F);
		gun503.cubeList.add(new ModelBox(gun503, 373, 344, 0.0F, 0.0F, -5.8F, 1, 1, 19, 0.0F, false));

		gun492 = new ModelRenderer(this);
		gun492.setRotationPoint(-4.5F, -34.2F, -50.5F);
		handguard.addChild(gun492);
		gun492.cubeList.add(new ModelBox(gun492, 307, 270, 0.0F, 0.0F, -5.8F, 6, 1, 19, 0.0F, false));
		gun492.cubeList.add(new ModelBox(gun492, 255, 186, 0.0F, -1.0F, 12.2F, 6, 1, 1, 0.0F, false));
		gun492.cubeList.add(new ModelBox(gun492, 298, 38, 0.0F, -1.0F, -5.8F, 6, 1, 1, 0.0F, false));
		gun492.cubeList.add(new ModelBox(gun492, 339, 239, 0.0F, -1.0F, -1.3F, 6, 1, 1, 0.0F, false));
		gun492.cubeList.add(new ModelBox(gun492, 358, 316, 0.0F, -1.0F, 3.2F, 6, 1, 1, 0.0F, false));
		gun492.cubeList.add(new ModelBox(gun492, 302, 365, 0.0F, -1.0F, 7.7F, 6, 1, 1, 0.0F, false));
		gun492.cubeList.add(new ModelBox(gun492, 0, 346, 0.0F, -2.0F, -5.8F, 6, 1, 19, 0.0F, false));

		gun494_r1 = new ModelRenderer(this);
		gun494_r1.setRotationPoint(0.3536F, 0.0F, -6.1536F);
		gun492.addChild(gun494_r1);
		setRotationAngle(gun494_r1, 0.0F, 0.7854F, 0.0F);
		gun494_r1.cubeList.add(new ModelBox(gun494_r1, 371, 75, -0.5F, -2.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun493_r1 = new ModelRenderer(this);
		gun493_r1.setRotationPoint(4.9393F, 0.0F, -6.1536F);
		gun492.addChild(gun493_r1);
		setRotationAngle(gun493_r1, 0.0F, 0.7854F, 0.0F);
		gun493_r1.cubeList.add(new ModelBox(gun493_r1, 102, 345, -0.5F, -2.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun465 = new ModelRenderer(this);
		gun465.setRotationPoint(0.5F, -38.5F, -39.5F);
		handguard.addChild(gun465);
		setRotationAngle(gun465, 0.0F, 0.0F, 2.2515F);
		gun465.cubeList.add(new ModelBox(gun465, 55, 345, 0.0F, 0.0F, -18.001F, 1, 2, 22, 0.0F, false));

		gun462 = new ModelRenderer(this);
		gun462.setRotationPoint(-3.5F, -38.5F, -39.5F);
		handguard.addChild(gun462);
		setRotationAngle(gun462, 0.0F, 0.0F, -0.6692F);
		gun462.cubeList.add(new ModelBox(gun462, 324, 344, 0.0F, 0.0F, -18.001F, 2, 1, 22, 0.0F, false));

		gun459 = new ModelRenderer(this);
		gun459.setRotationPoint(-3.5F, -38.5F, -39.5F);
		handguard.addChild(gun459);
		gun459.cubeList.add(new ModelBox(gun459, 318, 56, 0.001F, 0.0F, -17.998F, 4, 1, 22, 0.0F, false));
		gun459.cubeList.add(new ModelBox(gun459, 324, 320, 0.001F, 1.1F, -17.898F, 4, 1, 22, 0.1F, false));

		gun441 = new ModelRenderer(this);
		gun441.setRotationPoint(-2.4F, -39.7F, -53.5F);
		handguard.addChild(gun441);
		gun441.cubeList.add(new ModelBox(gun441, 358, 293, 0.0F, -0.001F, -4.001F, 1, 1, 21, 0.0F, false));

		gun434 = new ModelRenderer(this);
		gun434.setRotationPoint(-0.2F, -34.5F, -53.5F);
		handguard.addChild(gun434);
		gun434.cubeList.add(new ModelBox(gun434, 161, 347, 0.0F, 1.0F, -4.001F, 1, 1, 22, 0.0F, false));
		gun434.cubeList.add(new ModelBox(gun434, 208, 347, 0.0F, -2.0F, -4.001F, 1, 1, 22, 0.0F, false));
		gun434.cubeList.add(new ModelBox(gun434, 317, 362, 0.0F, -1.0F, 15.999F, 1, 2, 2, 0.0F, false));
		gun434.cubeList.add(new ModelBox(gun434, 410, 108, 0.0F, -1.0F, -4.001F, 1, 2, 2, 0.0F, false));

		gun433 = new ModelRenderer(this);
		gun433.setRotationPoint(-3.8F, -34.5F, -53.5F);
		handguard.addChild(gun433);
		gun433.cubeList.add(new ModelBox(gun433, 324, 118, 0.0F, 1.0F, -4.0F, 4, 1, 22, 0.0F, false));
		gun433.cubeList.add(new ModelBox(gun433, 339, 179, 0.0F, -2.0F, -4.0F, 4, 1, 22, 0.0F, false));
		gun433.cubeList.add(new ModelBox(gun433, 86, 370, 0.0F, -1.0F, 16.0F, 4, 2, 2, 0.0F, false));
		gun433.cubeList.add(new ModelBox(gun433, 123, 387, 0.0F, -1.0F, -4.0F, 4, 2, 2, 0.0F, false));

		gun432 = new ModelRenderer(this);
		gun432.setRotationPoint(-3.5F, -33.25F, -38.4F);
		handguard.addChild(gun432);
		setRotationAngle(gun432, -0.0744F, 0.0F, 0.0F);
		gun432.cubeList.add(new ModelBox(gun432, 142, 184, 0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun428 = new ModelRenderer(this);
		gun428.setRotationPoint(-3.0F, -32.4F, -42.0F);
		handguard.addChild(gun428);
		gun428.cubeList.add(new ModelBox(gun428, 242, 388, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun423 = new ModelRenderer(this);
		gun423.setRotationPoint(-3.0F, -32.8F, -53.5F);
		handguard.addChild(gun423);
		gun423.cubeList.add(new ModelBox(gun423, 339, 203, 0.001F, 0.0F, -4.002F, 3, 1, 22, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-3.0F, -32.4F, -40.5F);
		handguard.addChild(gun152);
		setRotationAngle(gun152, -0.0744F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 165, 312, -0.001F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.0F, -40.0F, -36.5F);
		handguard.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 172, 184, 0.0F, 0.0F, 0.001F, 3, 4, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(11.7F, -28.0F, -54.25F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 345, 413, 12.2F, 2.8F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 352, 413, 12.2F, 2.8F, 2.1F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 413, 410, 12.2F, 2.8F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 413, 413, 12.2F, 2.8F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 359, 12.2F, 2.8F, -0.45F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 356, 12.2F, 2.8F, 0.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 353, 12.2F, 2.8F, -1.7F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 350, 12.2F, 2.8F, -2.9F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 26, 12.2F, 2.8F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 29, 12.2F, 2.8F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 32, 12.2F, 2.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 35, 12.2F, 2.8F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 38, 12.2F, 2.8F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 362, 250, 12.3F, 3.4F, -3.25F, 2, 1, 17, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 86, 375, 12.1F, 3.4F, -3.25F, 1, 1, 17, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 414, 41, 12.2F, 2.8F, -3.45F, 2, 1, 1, -0.199F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 331, 416, 10.9419F, -9.192F, -2.2F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 377, 0, 10.8919F, -9.042F, -1.6F, 1, 1, 16, -0.35F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 416, 331, 10.9419F, -9.192F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 416, 334, 10.9419F, -9.192F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 416, 337, 10.9419F, -9.192F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 416, 340, 10.9419F, -9.192F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 343, 416, 10.9419F, -9.192F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 348, 416, 10.9419F, -9.192F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 353, 416, 10.9419F, -9.192F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 416, 399, 10.9419F, -9.192F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 416, 402, 10.9419F, -9.192F, 3.35F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 243, 418, 10.9419F, -9.192F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 238, 418, 10.9419F, -9.192F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 160, 418, 10.9419F, -9.192F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 418, 10.9419F, -9.192F, -1.65F, 1, 1, 1, -0.198F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 416, 405, 5.6791F, 12.568F, -2.2F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 377, 70, 5.7291F, 12.718F, -1.6F, 1, 1, 16, -0.35F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 409, 416, 5.6791F, 12.568F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 414, 416, 5.6791F, 12.568F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 49, 417, 5.6791F, 12.568F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 54, 417, 5.6791F, 12.568F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 59, 417, 5.6791F, 12.568F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 417, 108, 5.6791F, 12.568F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 417, 116, 5.6791F, 12.568F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 417, 119, 5.6791F, 12.568F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 417, 122, 5.6791F, 12.568F, 3.35F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 233, 418, 5.6791F, 12.568F, 0.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 228, 418, 5.6791F, 12.568F, 2.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 155, 418, 5.6791F, 12.568F, -0.45F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 145, 418, 5.6791F, 12.568F, -1.65F, 1, 1, 1, -0.198F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.4737F, -39.8631F, -46.0368F);
		handguard.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 414, 44, -0.9737F, -0.5632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 50, 414, -0.9737F, -0.5632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 57, 414, -0.9737F, -0.5632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 172, 414, -0.9737F, -0.5632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 179, 414, -0.9737F, -0.5632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 186, 414, -0.9737F, -0.5632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 381, 414, -0.9737F, -0.5632F, -10.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 374, 414, -0.9737F, -0.5632F, -9.1632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 367, 414, -0.9737F, -0.5632F, -7.9132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 414, 362, -0.9737F, -0.5632F, -6.6632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 193, 414, -0.9737F, -0.5632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 200, 414, -0.9737F, -0.5632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 207, 414, -0.9737F, -0.5632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 274, 414, -0.9737F, -0.5632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 414, 310, -0.9737F, -0.5632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 414, 313, -0.9737F, -0.5632F, 8.7368F, 2, 1, 1, -0.198F, false));
		bone2.cubeList.add(new ModelBox(bone2, 414, 344, -0.9737F, -0.5632F, 7.0868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 255, 347, -0.8737F, 0.0368F, -11.4632F, 2, 1, 21, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 362, 227, -1.0737F, 0.0368F, -11.4632F, 1, 1, 21, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 320, 408, -0.9737F, -0.5632F, -11.6632F, 2, 1, 2, -0.199F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 158, 411, 8.6105F, -11.08F, 0.8F, 1, 1, 2, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 370, 8.5605F, -10.93F, 1.4F, 1, 1, 20, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 417, 125, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 417, 128, 8.6105F, -11.08F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 417, 131, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 417, 134, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 417, 137, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 417, 163, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 417, 166, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 169, 417, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 174, 417, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 417, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 184, 417, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 189, 417, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 194, 417, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 289, 418, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 418, 285, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 418, 282, 8.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 268, 418, 8.6105F, -11.08F, 2.05F, 1, 1, 1, -0.198F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 165, 411, 8.0105F, 10.68F, 0.8F, 1, 1, 2, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 255, 370, 8.0605F, 10.83F, 1.4F, 1, 1, 20, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 199, 417, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 204, 417, 8.0105F, 10.68F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 209, 417, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 274, 417, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 279, 417, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 284, 417, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 366, 417, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 371, 417, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 376, 417, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 381, 417, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 386, 417, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 391, 417, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 396, 417, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 263, 418, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 258, 418, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 253, 418, 8.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 248, 418, 8.0105F, 10.68F, 2.05F, 1, 1, 1, -0.198F, false));

		ribs = new ModelRenderer(this);
		ribs.setRotationPoint(0.0F, 0.0F, 3.0F);
		handguard.addChild(ribs);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -1.0F, 0.0F);
		ribs.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.2182F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 406, 410, 6.8F, -35.8F, -41.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 385, 410, 6.8F, -35.8F, -44.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 392, 410, 6.8F, -35.8F, -43.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 399, 410, 6.8F, -35.8F, -42.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 276, 410, 6.8F, -35.8F, -47.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 371, 410, 6.8F, -35.8F, -46.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 378, 410, 6.8F, -35.8F, -45.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 410, 128, 6.8F, -35.8F, -52.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 411, 6.8F, -35.8F, -50.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 410, 132, 6.8F, -35.8F, -49.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 410, 136, 6.8F, -35.8F, -48.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 410, 124, 6.8F, -35.8F, -53.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 411, 6.8F, -35.8F, -56.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 411, 6.8F, -35.8F, -59.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 411, 6.8F, -35.8F, -58.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 411, 6.8F, -35.8F, -57.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 410, 120, 6.8F, -35.8F, -54.1F, 2, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 410, 116, 6.8F, -35.8F, -55.1F, 2, 2, 1, -0.3F, false));

		ribs2 = new ModelRenderer(this);
		ribs2.setRotationPoint(-15.0F, 0.0F, 3.0F);
		handguard.addChild(ribs2);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(12.3867F, -0.9134F, 0.0F);
		ribs2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.2182F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 412, 4, -9.2F, -35.8F, -41.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 412, 0, -9.2F, -35.8F, -44.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 412, -9.2F, -35.8F, -43.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 360, 411, -9.2F, -35.8F, -42.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 338, 411, -9.2F, -35.8F, -47.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 308, 411, -9.2F, -35.8F, -46.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 301, 411, -9.2F, -35.8F, -45.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 294, 411, -9.2F, -35.8F, -52.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 412, 69, -9.2F, -35.8F, -50.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 267, 411, -9.2F, -35.8F, -49.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 260, 411, -9.2F, -35.8F, -48.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 253, 411, -9.2F, -35.8F, -53.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 412, 65, -9.2F, -35.8F, -59.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 412, 61, -9.2F, -35.8F, -58.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 412, 53, -9.2F, -35.8F, -57.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 412, 57, -9.2F, -35.8F, -56.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 246, 411, -9.2F, -35.8F, -54.1F, 2, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 239, 411, -9.2F, -35.8F, -55.1F, 2, 2, 1, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}