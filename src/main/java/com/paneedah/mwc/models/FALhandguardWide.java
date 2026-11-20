package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandguardWide extends ModelBase {
	private final ModelRenderer handguardWide;
	private final ModelRenderer bone186;
	private final ModelRenderer bone187;
	private final ModelRenderer bone188;
	private final ModelRenderer bone31_r1;
	private final ModelRenderer bone189;
	private final ModelRenderer bone32_r1;
	private final ModelRenderer bone190;
	private final ModelRenderer bone191;
	private final ModelRenderer bone192;
	private final ModelRenderer bone193;
	private final ModelRenderer bone194;
	private final ModelRenderer bone195;
	private final ModelRenderer bone196;
	private final ModelRenderer bone197;
	private final ModelRenderer bone198;

	public FALhandguardWide() {
		textureWidth = 624;
		textureHeight = 624;

		handguardWide = new ModelRenderer(this);
		handguardWide.setRotationPoint(0.0F, 24.0F, 3.0F);
		handguardWide.cubeList.add(new ModelBox(handguardWide, 402, 140, -3.9851F, -35.6034F, -66.5436F, 5, 1, 31, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 496, 419, 0.3976F, -37.5273F, -66.5436F, 1, 2, 30, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 64, 502, -4.3678F, -37.5273F, -66.5436F, 1, 2, 30, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 466, 172, -2.0F, -41.9587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 210, 609, -2.0F, -41.7087F, -35.6436F, 1, 2, 1, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 466, 312, 1.001F, -38.0587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 466, 344, -4.999F, -38.0587F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 214, 609, -4.399F, -38.6587F, -35.6436F, 1, 2, 1, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 218, 609, 0.301F, -38.6587F, -35.6436F, 1, 2, 1, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 432, 611, -5.0F, -37.4587F, -36.5436F, 1, 1, 1, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 436, 611, 1.0F, -37.4587F, -36.5436F, 1, 1, 1, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 464, 388, -3.5F, -35.4494F, -65.7533F, 4, 1, 30, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 336, 234, -3.5F, -39.5535F, -72.5382F, 4, 4, 6, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 600, 562, -3.5F, -39.5777F, -73.3147F, 4, 4, 1, 0.0F, false));

		bone186 = new ModelRenderer(this);
		bone186.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardWide.addChild(bone186);
		setRotationAngle(bone186, 0.0F, 0.0F, -0.9599F);
		bone186.cubeList.add(new ModelBox(bone186, 468, 204, 1.0145F, 1.6414F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone186.cubeList.add(new ModelBox(bone186, 70, 611, 0.8097F, 1.7848F, 22.2564F, 1, 1, 1, 0.0F, false));

		bone187 = new ModelRenderer(this);
		bone187.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardWide.addChild(bone187);
		setRotationAngle(bone187, 0.0F, 0.0F, 0.9599F);
		bone187.cubeList.add(new ModelBox(bone187, 468, 236, 0.2799F, -1.6352F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone187.cubeList.add(new ModelBox(bone187, 88, 611, 0.4846F, -1.4918F, 22.2564F, 1, 1, 1, 0.0F, false));

		bone188 = new ModelRenderer(this);
		bone188.setRotationPoint(-3.9099F, -35.6584F, -51.2495F);
		handguardWide.addChild(bone188);
		setRotationAngle(bone188, 0.0F, 0.0F, 1.1781F);
		bone188.cubeList.add(new ModelBox(bone188, 468, 268, -0.0541F, -0.5268F, -15.2941F, 1, 1, 31, 0.0F, false));
		bone188.cubeList.add(new ModelBox(bone188, 444, 232, -1.1565F, -0.2991F, 14.7059F, 2, 1, 1, 0.0F, false));
		bone188.cubeList.add(new ModelBox(bone188, 420, 232, -1.105F, -0.9267F, 15.6059F, 2, 1, 1, 0.0F, false));

		bone31_r1 = new ModelRenderer(this);
		bone31_r1.setRotationPoint(-1.5574F, -0.22F, 0.2059F);
		bone188.addChild(bone31_r1);
		setRotationAngle(bone31_r1, 0.0F, 0.0F, -0.5672F);
		bone31_r1.cubeList.add(new ModelBox(bone31_r1, 472, 96, -0.5F, -0.5F, -15.5F, 1, 1, 31, 0.0F, false));

		bone189 = new ModelRenderer(this);
		bone189.setRotationPoint(3.9099F, -35.6584F, -51.2495F);
		handguardWide.addChild(bone189);
		setRotationAngle(bone189, 0.0F, 0.0F, -1.1781F);
		bone189.cubeList.add(new ModelBox(bone189, 472, 64, -2.0825F, -3.2709F, -15.2941F, 1, 1, 31, 0.0F, false));
		bone189.cubeList.add(new ModelBox(bone189, 450, 232, -1.9915F, -3.0708F, 14.7059F, 2, 1, 1, 0.0F, false));
		bone189.cubeList.add(new ModelBox(bone189, 426, 232, -2.0814F, -3.7907F, 15.6059F, 2, 1, 1, 0.0F, false));

		bone32_r1 = new ModelRenderer(this);
		bone32_r1.setRotationPoint(0.4102F, -2.9898F, 0.2059F);
		bone189.addChild(bone32_r1);
		setRotationAngle(bone32_r1, 0.0F, 0.0F, 0.5672F);
		bone32_r1.cubeList.add(new ModelBox(bone32_r1, 68, 470, -0.5F, -0.5F, -15.5F, 1, 1, 31, 0.0F, false));

		bone190 = new ModelRenderer(this);
		bone190.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguardWide.addChild(bone190);
		setRotationAngle(bone190, -0.0175F, 0.0F, 0.0F);
		bone190.cubeList.add(new ModelBox(bone190, 496, 451, -2.7929F, -0.243F, -38.7041F, 2, 1, 7, 0.0F, false));
		bone190.cubeList.add(new ModelBox(bone190, 564, 291, -1.2071F, -0.243F, -38.7041F, 1, 1, 7, 0.0F, false));

		bone191 = new ModelRenderer(this);
		bone191.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone190.addChild(bone191);
		setRotationAngle(bone191, 0.7854F, 0.0F, 0.0F);
		bone191.cubeList.add(new ModelBox(bone191, 92, 611, -0.5F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
		bone191.cubeList.add(new ModelBox(bone191, 96, 611, -4.0F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));

		bone192 = new ModelRenderer(this);
		bone192.setRotationPoint(1.0F, -25.9494F, -69.2533F);
		handguardWide.addChild(bone192);
		setRotationAngle(bone192, 0.0F, 0.0F, 0.7854F);
		bone192.cubeList.add(new ModelBox(bone192, 474, 160, -8.1618F, -6.4547F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone193 = new ModelRenderer(this);
		bone193.setRotationPoint(-2.0F, -25.9494F, -69.2533F);
		handguardWide.addChild(bone193);
		setRotationAngle(bone193, 0.0F, 0.0F, 0.7854F);
		bone193.cubeList.add(new ModelBox(bone193, 358, 416, -7.8689F, -6.7476F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone194 = new ModelRenderer(this);
		bone194.setRotationPoint(0.0F, -40.952F, -72.3533F);
		handguardWide.addChild(bone194);
		setRotationAngle(bone194, 0.5672F, 0.0F, 0.0F);
		bone194.cubeList.add(new ModelBox(bone194, 192, 39, -3.5F, 0.6425F, -1.5493F, 4, 1, 1, 0.0F, false));

		bone195 = new ModelRenderer(this);
		bone195.setRotationPoint(-0.15F, -41.3587F, -66.5436F);
		handguardWide.addChild(bone195);
		setRotationAngle(bone195, 0.0F, 0.0F, -0.576F);
		bone195.cubeList.add(new ModelBox(bone195, 132, 470, -1.0F, 0.0F, 0.0F, 1, 1, 31, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 196, 470, -1.0115F, 2.2012F, 0.0F, 1, 1, 31, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 288, 609, -1.0115F, 0.2012F, 30.0F, 1, 2, 1, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 472, 32, -1.0F, 3.0F, 0.0F, 1, 1, 31, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 324, 575, -1.22F, 0.0588F, 30.9F, 1, 3, 1, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 606, 416, -1.0F, 1.0F, 0.0F, 1, 2, 2, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 606, 420, -1.0F, 1.0F, 5.5F, 1, 2, 2, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 606, 424, -1.0F, 1.0F, 11.0F, 1, 2, 2, 0.0F, false));
		bone195.cubeList.add(new ModelBox(bone195, 202, 559, -1.0F, 1.0F, 16.5F, 1, 2, 14, 0.0F, false));

		bone196 = new ModelRenderer(this);
		bone196.setRotationPoint(0.0F, 1.6087F, 1.0F);
		bone195.addChild(bone196);
		setRotationAngle(bone196, -2.3562F, 0.0F, 0.0F);
		bone196.cubeList.add(new ModelBox(bone196, 100, 611, -1.0125F, -1.4581F, -0.5648F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 196, 612, -1.014F, -0.5671F, -1.4835F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 104, 611, -1.014F, -4.4562F, -5.3726F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 108, 611, -1.014F, -8.3453F, -9.2617F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 112, 611, -1.014F, -11.2445F, -12.1608F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 116, 611, -1.014F, -7.3553F, -8.2717F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 120, 611, -1.014F, -3.4663F, -4.3827F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 124, 611, -1.0125F, -5.3471F, -4.4539F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 128, 611, -1.0125F, -9.2363F, -8.3429F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 132, 611, -1.0125F, -12.1353F, -11.2421F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 136, 611, -1.0125F, -8.2463F, -7.353F, 1, 1, 1, 0.0F, false));
		bone196.cubeList.add(new ModelBox(bone196, 230, 611, -1.0125F, -4.3572F, -3.4639F, 1, 1, 1, 0.0F, false));

		bone197 = new ModelRenderer(this);
		bone197.setRotationPoint(-2.85F, -41.3587F, -66.5436F);
		handguardWide.addChild(bone197);
		setRotationAngle(bone197, 0.0F, 0.0F, 0.576F);
		bone197.cubeList.add(new ModelBox(bone197, 260, 470, 0.0F, 0.0F, 0.0F, 1, 1, 31, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 472, 0, 0.0F, 3.0F, 0.0F, 1, 1, 31, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 0, 471, -0.0128F, 2.263F, 0.0F, 1, 1, 31, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 292, 609, -0.0128F, 0.263F, 30.0F, 1, 2, 1, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 324, 579, 0.1928F, 0.1133F, 30.9F, 1, 3, 1, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 606, 428, 0.0F, 1.0F, 0.0F, 1, 2, 2, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 606, 432, 0.0F, 1.0F, 5.5F, 1, 2, 2, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 606, 436, 0.0F, 1.0F, 11.0F, 1, 2, 2, 0.0F, false));
		bone197.cubeList.add(new ModelBox(bone197, 584, 0, 0.0F, 1.0F, 16.5F, 1, 2, 14, 0.0F, false));

		bone198 = new ModelRenderer(this);
		bone198.setRotationPoint(1.0357F, 1.6164F, 1.0F);
		bone197.addChild(bone198);
		setRotationAngle(bone198, -2.3562F, 0.0F, 0.0F);
		bone198.cubeList.add(new ModelBox(bone198, 234, 611, -1.0388F, -1.5018F, -0.5211F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 200, 612, -1.014F, -0.5671F, -1.4835F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 238, 611, -1.014F, -4.4562F, -5.3726F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 242, 611, -1.014F, -8.3453F, -9.2617F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 246, 611, -1.014F, -11.2445F, -12.1608F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 250, 611, -1.014F, -7.3553F, -8.2717F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 254, 611, -1.014F, -3.4663F, -4.3827F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 258, 611, -1.0388F, -5.3909F, -4.4102F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 300, 611, -1.0388F, -9.28F, -8.2992F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 304, 611, -1.0388F, -12.179F, -11.1983F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 308, 611, -1.0388F, -8.29F, -7.3093F, 1, 1, 1, 0.0F, false));
		bone198.cubeList.add(new ModelBox(bone198, 312, 611, -1.0388F, -4.401F, -3.4202F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardWide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}