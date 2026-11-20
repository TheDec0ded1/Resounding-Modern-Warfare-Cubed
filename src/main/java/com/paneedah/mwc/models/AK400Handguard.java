package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer gun603;
	private final ModelRenderer gun506;
	private final ModelRenderer gun505;
	private final ModelRenderer gun505_r1;
	private final ModelRenderer gun504;
	private final ModelRenderer gun503;
	private final ModelRenderer gun501;
	private final ModelRenderer gun499;
	private final ModelRenderer gun497;
	private final ModelRenderer gun495;
	private final ModelRenderer gun492;
	private final ModelRenderer gun494_r1;
	private final ModelRenderer gun493_r1;
	private final ModelRenderer gun465;
	private final ModelRenderer gun462;
	private final ModelRenderer gun459;
	private final ModelRenderer gun445;
	private final ModelRenderer gun444;
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
	private final ModelRenderer cube_r1;
	private final ModelRenderer ribs2;
	private final ModelRenderer cube_r2;

	public AK400Handguard() {
		textureWidth = 416;
		textureHeight = 416;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 395, 364, -4.6F, -34.7F, -52.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 395, 367, -4.6F, -34.7F, -48.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 395, 370, -4.6F, -34.7F, -44.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 395, 373, -4.6F, -34.7F, -40.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 395, 358, -0.4F, -34.7F, -40.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 395, 355, -0.4F, -34.7F, -44.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 395, 352, -0.4F, -34.7F, -48.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 395, 349, -0.4F, -34.7F, -52.6F, 2, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 265, 388, -0.475F, -34.7F, -51.1F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 388, 320, -0.475F, -34.7F, -47.1F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 388, 337, -0.475F, -34.7F, -43.1F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 389, 5, -4.525F, -34.7F, -43.1F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 388, 345, -4.525F, -34.7F, -47.1F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 388, 341, -4.525F, -34.7F, -51.1F, 2, 1, 2, 0.0F, false));

		gun603 = new ModelRenderer(this);
		gun603.setRotationPoint(-1.6F, -39.7F, -53.5F);
		handguard.addChild(gun603);
		gun603.cubeList.add(new ModelBox(gun603, 45, 320, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun506 = new ModelRenderer(this);
		gun506.setRotationPoint(1.2F, -34.8F, -50.5F);
		handguard.addChild(gun506);
		setRotationAngle(gun506, 0.0F, 0.0F, 2.0076F);
		gun506.cubeList.add(new ModelBox(gun506, 205, 321, -0.4894F, -0.1026F, -2.3F, 1, 1, 13, 0.0F, false));

		gun505 = new ModelRenderer(this);
		gun505.setRotationPoint(-4.2F, -34.8F, -50.5F);
		handguard.addChild(gun505);
		setRotationAngle(gun505, 0.0F, 0.0F, -0.3585F);
		

		gun505_r1 = new ModelRenderer(this);
		gun505_r1.setRotationPoint(3.1618F, 42.7747F, 50.5F);
		gun505.addChild(gun505_r1);
		setRotationAngle(gun505_r1, 0.0F, 0.0F, -0.0436F);
		gun505_r1.cubeList.add(new ModelBox(gun505_r1, 348, 225, -1.4125F, -43.3575F, -52.8F, 1, 1, 13, 0.0F, false));

		gun504 = new ModelRenderer(this);
		gun504.setRotationPoint(1.5F, -33.2F, -50.5F);
		handguard.addChild(gun504);
		setRotationAngle(gun504, 0.0F, 0.0F, 2.3562F);
		gun504.cubeList.add(new ModelBox(gun504, 348, 240, 0.0F, 0.0F, -2.3F, 1, 1, 13, 0.0F, false));

		gun503 = new ModelRenderer(this);
		gun503.setRotationPoint(-4.5F, -33.2F, -50.5F);
		handguard.addChild(gun503);
		setRotationAngle(gun503, 0.0F, 0.0F, -0.7854F);
		gun503.cubeList.add(new ModelBox(gun503, 348, 338, 0.0F, 0.0F, -2.3F, 1, 1, 13, 0.0F, false));

		gun501 = new ModelRenderer(this);
		gun501.setRotationPoint(-4.5F, -34.2F, -40.5F);
		handguard.addChild(gun501);
		setRotationAngle(gun501, 0.0F, 0.1859F, 0.0F);
		gun501.cubeList.add(new ModelBox(gun501, 377, 344, -0.1294F, -1.0F, 0.6879F, 1, 2, 4, 0.0F, false));

		gun499 = new ModelRenderer(this);
		gun499.setRotationPoint(1.5F, -34.2F, -40.5F);
		handguard.addChild(gun499);
		setRotationAngle(gun499, 0.0F, -1.7846F, 0.0F);
		gun499.cubeList.add(new ModelBox(gun499, 20, 384, 0.6841F, -1.0F, -0.1485F, 4, 2, 1, 0.0F, false));

		gun497 = new ModelRenderer(this);
		gun497.setRotationPoint(1.5F, -34.2F, -50.5F);
		handguard.addChild(gun497);
		setRotationAngle(gun497, 0.0F, -2.8999F, 0.0F);
		

		gun495 = new ModelRenderer(this);
		gun495.setRotationPoint(-4.5F, -34.2F, -50.5F);
		handguard.addChild(gun495);
		setRotationAngle(gun495, 0.0F, 1.3384F, 0.0F);
		

		gun492 = new ModelRenderer(this);
		gun492.setRotationPoint(-4.5F, -34.2F, -50.5F);
		handguard.addChild(gun492);
		gun492.cubeList.add(new ModelBox(gun492, 166, 321, 0.0F, -1.0F, -2.3F, 6, 2, 13, 0.0F, false));

		gun494_r1 = new ModelRenderer(this);
		gun494_r1.setRotationPoint(0.3536F, 0.0F, -2.6536F);
		gun492.addChild(gun494_r1);
		setRotationAngle(gun494_r1, 0.0F, 0.7854F, 0.0F);
		gun494_r1.cubeList.add(new ModelBox(gun494_r1, 396, 94, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun493_r1 = new ModelRenderer(this);
		gun493_r1.setRotationPoint(4.9393F, 0.0F, -2.6536F);
		gun492.addChild(gun493_r1);
		setRotationAngle(gun493_r1, 0.0F, 0.7854F, 0.0F);
		gun493_r1.cubeList.add(new ModelBox(gun493_r1, 79, 396, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun465 = new ModelRenderer(this);
		gun465.setRotationPoint(0.5F, -38.5F, -39.5F);
		handguard.addChild(gun465);
		setRotationAngle(gun465, 0.0F, 0.0F, 2.2515F);
		gun465.cubeList.add(new ModelBox(gun465, 235, 317, 0.0F, 0.0F, -14.001F, 1, 2, 18, 0.0F, false));

		gun462 = new ModelRenderer(this);
		gun462.setRotationPoint(-3.5F, -38.5F, -39.5F);
		handguard.addChild(gun462);
		setRotationAngle(gun462, 0.0F, 0.0F, -0.6692F);
		gun462.cubeList.add(new ModelBox(gun462, 235, 297, 0.0F, 0.0F, -14.001F, 2, 1, 18, 0.0F, false));

		gun459 = new ModelRenderer(this);
		gun459.setRotationPoint(-3.5F, -38.5F, -39.5F);
		handguard.addChild(gun459);
		gun459.cubeList.add(new ModelBox(gun459, 45, 300, 0.001F, 0.0F, -13.998F, 4, 1, 18, 0.0F, false));
		gun459.cubeList.add(new ModelBox(gun459, 270, 171, 0.001F, 1.1F, -1.098F, 4, 1, 5, 0.1F, false));
		gun459.cubeList.add(new ModelBox(gun459, 209, 385, 0.001F, 1.1F, -3.898F, 4, 1, 1, 0.1F, false));
		gun459.cubeList.add(new ModelBox(gun459, 220, 385, 0.001F, 1.1F, -6.648F, 4, 1, 1, 0.1F, false));
		gun459.cubeList.add(new ModelBox(gun459, 198, 378, 0.001F, 1.1F, -10.398F, 4, 1, 2, 0.1F, false));
		gun459.cubeList.add(new ModelBox(gun459, 242, 378, 0.001F, 1.1F, -13.898F, 4, 1, 2, 0.1F, false));
		gun459.cubeList.add(new ModelBox(gun459, 304, 144, 0.001F, 1.9F, -13.898F, 4, 1, 18, 0.1F, false));

		gun445 = new ModelRenderer(this);
		gun445.setRotationPoint(-0.2F, -35.5F, -41.5F);
		handguard.addChild(gun445);
		gun445.cubeList.add(new ModelBox(gun445, 313, 318, 0.0F, -0.001F, -12.001F, 1, 1, 18, 0.0F, false));

		gun444 = new ModelRenderer(this);
		gun444.setRotationPoint(-3.8F, -35.5F, -41.5F);
		handguard.addChild(gun444);
		gun444.cubeList.add(new ModelBox(gun444, 303, 241, 0.0F, 0.0F, -12.0F, 4, 1, 18, 0.0F, false));

		gun441 = new ModelRenderer(this);
		gun441.setRotationPoint(-2.4F, -39.7F, -53.5F);
		handguard.addChild(gun441);
		gun441.cubeList.add(new ModelBox(gun441, 0, 321, 0.0F, -0.001F, -0.001F, 1, 1, 17, 0.0F, false));

		gun434 = new ModelRenderer(this);
		gun434.setRotationPoint(-0.2F, -34.5F, -53.5F);
		handguard.addChild(gun434);
		gun434.cubeList.add(new ModelBox(gun434, 274, 318, 0.0F, 0.0F, -0.001F, 1, 2, 18, 0.0F, false));

		gun433 = new ModelRenderer(this);
		gun433.setRotationPoint(-3.8F, -34.5F, -53.5F);
		handguard.addChild(gun433);
		gun433.cubeList.add(new ModelBox(gun433, 0, 300, 0.0F, 0.0F, 0.0F, 4, 2, 18, 0.0F, false));

		gun432 = new ModelRenderer(this);
		gun432.setRotationPoint(-3.5F, -33.25F, -38.4F);
		handguard.addChild(gun432);
		setRotationAngle(gun432, -0.0744F, 0.0F, 0.0F);
		gun432.cubeList.add(new ModelBox(gun432, 114, 236, 0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun428 = new ModelRenderer(this);
		gun428.setRotationPoint(-3.0F, -32.4F, -42.0F);
		handguard.addChild(gun428);
		gun428.cubeList.add(new ModelBox(gun428, 48, 384, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun423 = new ModelRenderer(this);
		gun423.setRotationPoint(-3.0F, -32.8F, -53.5F);
		handguard.addChild(gun423);
		gun423.cubeList.add(new ModelBox(gun423, 308, 0, 0.001F, 0.0F, -0.002F, 3, 1, 18, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-3.0F, -32.4F, -40.5F);
		handguard.addChild(gun152);
		setRotationAngle(gun152, -0.0744F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 306, 137, -0.001F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.0F, -40.0F, -36.5F);
		handguard.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 59, 384, 0.0F, 0.0F, 0.001F, 3, 4, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(11.7F, -28.0F, -54.25F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 388, 324, 12.2F, 2.8F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 17, 12.2F, 2.8F, 2.1F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 390, 235, 12.2F, 2.8F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 41, 393, 12.2F, 2.8F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 48, 393, 12.2F, 2.8F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 77, 393, 12.2F, 2.8F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 84, 393, 12.2F, 2.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 123, 393, 12.2F, 2.8F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 135, 393, 12.2F, 2.8F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 347, 180, 12.3F, 3.4F, 0.75F, 2, 1, 13, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 349, 20, 12.1F, 3.4F, 0.75F, 1, 1, 13, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 221, 388, 12.2F, 2.8F, 0.55F, 2, 1, 2, -0.199F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 390, 223, 10.9419F, -9.192F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 349, 92, 10.8919F, -9.042F, 2.4F, 1, 1, 12, -0.35F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 396, 116, 10.9419F, -9.192F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 119, 396, 10.9419F, -9.192F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 396, 119, 10.9419F, -9.192F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 124, 396, 10.9419F, -9.192F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 396, 128, 10.9419F, -9.192F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 396, 131, 10.9419F, -9.192F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 396, 134, 10.9419F, -9.192F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 135, 396, 10.9419F, -9.192F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 396, 137, 10.9419F, -9.192F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 390, 227, 5.6791F, 12.568F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 349, 106, 5.7291F, 12.718F, 2.4F, 1, 1, 12, -0.35F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 396, 140, 5.6791F, 12.568F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 396, 146, 5.6791F, 12.568F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 147, 396, 5.6791F, 12.568F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 396, 149, 5.6791F, 12.568F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 152, 396, 5.6791F, 12.568F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 396, 152, 5.6791F, 12.568F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 396, 155, 5.6791F, 12.568F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 396, 158, 5.6791F, 12.568F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 396, 161, 5.6791F, 12.568F, 3.35F, 1, 1, 1, -0.198F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.4737F, -39.8631F, -46.0368F);
		handguard.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 151, 393, -0.9737F, -0.5632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 171, 393, -0.9737F, -0.5632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 185, 393, -0.9737F, -0.5632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 192, 393, -0.9737F, -0.5632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 254, -0.9737F, -0.5632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 257, -0.9737F, -0.5632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 260, -0.9737F, -0.5632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 263, -0.9737F, -0.5632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 266, -0.9737F, -0.5632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 269, -0.9737F, -0.5632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 272, -0.9737F, -0.5632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 275, -0.9737F, -0.5632F, 8.7368F, 2, 1, 1, -0.198F, false));
		bone2.cubeList.add(new ModelBox(bone2, 393, 278, -0.9737F, -0.5632F, 7.0868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 90, 319, -0.8737F, 0.0368F, -7.4632F, 2, 1, 17, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 129, 321, -1.0737F, 0.0368F, -7.4632F, 1, 1, 17, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 388, 238, -0.9737F, -0.5632F, -7.6632F, 2, 1, 2, -0.199F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 390, 231, 8.6105F, -11.08F, 4.8F, 1, 1, 2, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 324, 261, 8.5605F, -10.93F, 5.4F, 1, 1, 16, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 164, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 167, 8.6105F, -11.08F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 396, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 170, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 173, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 175, 396, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 176, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 179, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 182, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 185, 396, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 185, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 188, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 190, 396, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 274, 390, 8.0105F, 10.68F, 4.8F, 1, 1, 2, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 324, 279, 8.0605F, 10.83F, 5.4F, 1, 1, 16, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 195, 396, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 200, 396, 8.0105F, 10.68F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 205, 396, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 210, 396, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 215, 396, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 220, 396, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 225, 396, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 230, 396, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 235, 396, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 240, 396, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 261, 396, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 266, 396, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 286, 396, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));

		ribs = new ModelRenderer(this);
		ribs.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(ribs);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ribs.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.2182F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 351, 389, 6.8F, -35.8F, -41.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 315, 389, 6.8F, -35.8F, -44.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 322, 389, 6.8F, -35.8F, -43.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 344, 389, 6.8F, -35.8F, -42.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 294, 389, 6.8F, -35.8F, -47.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 301, 389, 6.8F, -35.8F, -46.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 308, 389, 6.8F, -35.8F, -45.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 389, 183, 6.8F, -35.8F, -50.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 185, 389, 6.8F, -35.8F, -49.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 389, 187, 6.8F, -35.8F, -48.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 389, 179, 6.8F, -35.8F, -51.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 389, 175, 6.8F, -35.8F, -52.1F, 2, 2, 1, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 389, 171, 6.8F, -35.8F, -53.1F, 2, 2, 1, -0.3F, false));

		ribs2 = new ModelRenderer(this);
		ribs2.setRotationPoint(-15.0F, 0.0F, 0.0F);
		handguard.addChild(ribs2);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(12.3867F, 0.0866F, 0.0F);
		ribs2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2182F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 265, 392, -9.2F, -35.8F, -41.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 238, 392, -9.2F, -35.8F, -44.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 231, 392, -9.2F, -35.8F, -43.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 224, 392, -9.2F, -35.8F, -42.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 217, 392, -9.2F, -35.8F, -47.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 210, 392, -9.2F, -35.8F, -46.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 203, 392, -9.2F, -35.8F, -45.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 391, 391, -9.2F, -35.8F, -50.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 391, 387, -9.2F, -35.8F, -49.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 391, 310, -9.2F, -35.8F, -48.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 391, 306, -9.2F, -35.8F, -51.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 391, 302, -9.2F, -35.8F, -52.1F, 2, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 391, 292, -9.2F, -35.8F, -53.1F, 2, 2, 1, -0.3F, false));
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