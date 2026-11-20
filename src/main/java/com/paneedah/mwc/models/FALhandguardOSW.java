package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandguardOSW extends ModelBase {
	private final ModelRenderer handguardOSW;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone35;
	private final ModelRenderer cube_r14;
	private final ModelRenderer rail2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
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
	private final ModelRenderer handguard2;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public FALhandguardOSW() {
		textureWidth = 384;
		textureHeight = 384;

		handguardOSW = new ModelRenderer(this);
		handguardOSW.setRotationPoint(0.0F, 24.0F, 1.0F);
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 0, 271, -2.5F, -41.8F, -50.65F, 2, 1, 22, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 142, 95, -3.0F, -41.4032F, -35.6436F, 3, 1, 7, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 134, 311, -3.0F, -41.4032F, -40.6436F, 3, 1, 2, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 120, 333, -3.0F, -41.4032F, -45.6436F, 3, 1, 2, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 108, 351, -3.0F, -41.4032F, -50.6436F, 3, 1, 2, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 282, 308, 0.4142F, -39.989F, -30.6436F, 1, 4, 2, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 206, 363, -4.4142F, -39.989F, -30.6436F, 1, 4, 2, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 88, 365, -5.1213F, -39.2819F, -33.6436F, 1, 2, 3, 0.0F, false));
		handguardOSW.cubeList.add(new ModelBox(handguardOSW, 96, 365, 1.1213F, -39.2819F, -33.6436F, 1, 2, 3, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-1.5F, -33.6606F, -51.1436F);
		handguardOSW.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.7854F);
		bone26.cubeList.add(new ModelBox(bone26, 360, 150, 5.5355F, -4.4142F, 17.5F, 1, 2, 5, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 252, 365, 5.5355F, -2.4142F, 17.5F, 1, 1, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(5.7938F, -3.5777F, 18.5F);
		bone26.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 320, 368, -0.5F, -1.0F, -18.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 302, 368, -0.5F, -1.0F, -13.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 296, 368, -0.5F, -1.0F, -8.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 288, 335, -0.5F, 0.0F, -18.0F, 1, 2, 17, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 368, 256, -0.5F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.7071F, -34.5748F, -51.1436F);
		handguardOSW.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, 0.7854F);
		bone35.cubeList.add(new ModelBox(bone35, 174, 361, -7.4497F, -2.2071F, 17.5F, 1, 2, 5, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 244, 365, -7.4497F, -0.2071F, 17.5F, 1, 1, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-6.708F, -1.3706F, 18.5F);
		bone35.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.2618F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 314, 368, -0.5F, -1.0F, -18.0F, 1, 1, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 308, 368, -0.5F, -1.0F, -13.0F, 1, 1, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 290, 368, -0.5F, -1.0F, -8.0F, 1, 1, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 336, -0.5F, 0.0F, -18.0F, 1, 2, 17, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 368, 259, -0.5F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false));

		rail2 = new ModelRenderer(this);
		rail2.setRotationPoint(-1.5237F, -41.3381F, -41.5868F);
		handguardOSW.addChild(rail2);
		rail2.cubeList.add(new ModelBox(rail2, 0, 370, -0.9737F, -1.0632F, -8.9132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 6, 370, -0.9737F, -1.0632F, -7.6632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 12, 370, -0.9737F, -1.0632F, -6.4132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 18, 370, -0.9737F, -1.0632F, -5.1632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 24, 370, -0.9737F, -1.0632F, -3.9132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 102, 370, -0.9737F, -1.0632F, -9.2632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 30, 370, -0.9737F, -1.0632F, -2.6632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 36, 370, -0.9737F, -1.0632F, -0.1632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 42, 370, -0.9737F, -1.0632F, -1.4132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 48, 370, -0.9737F, -1.0632F, 2.3368F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 54, 370, -0.9737F, -1.0632F, 1.0868F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 60, 370, -0.9737F, -1.0632F, 4.8368F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 66, 370, -0.9737F, -1.0632F, 3.5868F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 72, 370, -0.9737F, -1.0632F, 7.3368F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 24, 372, -0.9737F, -1.0632F, 8.5368F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 78, 370, -0.9737F, -1.0632F, 10.9868F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 84, 370, -0.9737F, -1.0632F, 9.7868F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 90, 370, -0.9737F, -1.0632F, 12.1368F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 96, 370, -0.9737F, -1.0632F, 6.0868F, 2, 1, 1, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		rail2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 288, 291, 8.1719F, -11.2447F, 3.7F, 1, 1, 22, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 372, 340, 8.2219F, -11.3947F, 18.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 322, 375, 8.2219F, -11.3947F, 21.0F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 372, 342, 8.2219F, -11.3947F, 23.45F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 372, 344, 8.2219F, -11.3947F, 22.25F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 372, 346, 8.2219F, -11.3947F, 24.6F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 112, 373, 8.2219F, -11.3947F, 19.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 116, 373, 8.2219F, -11.3947F, 16.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 120, 373, 8.2219F, -11.3947F, 17.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 170, 373, 8.2219F, -11.3947F, 13.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 174, 373, 8.2219F, -11.3947F, 14.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 178, 373, 8.2219F, -11.3947F, 11.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 182, 373, 8.2219F, -11.3947F, 12.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 186, 373, 8.2219F, -11.3947F, 9.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 190, 373, 8.2219F, -11.3947F, 8.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 194, 373, 8.2219F, -11.3947F, 7.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 198, 373, 8.2219F, -11.3947F, 6.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 202, 373, 8.2219F, -11.3947F, 4.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 206, 373, 8.2219F, -11.3947F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 288, 373, 8.2219F, -11.3947F, 3.2F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		rail2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 144, 292, 8.4491F, 10.5153F, 3.7F, 1, 1, 22, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 210, 373, 8.3991F, 10.3653F, 18.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 326, 375, 8.3991F, 10.3653F, 21.0F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 214, 373, 8.3991F, 10.3653F, 23.45F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 218, 373, 8.3991F, 10.3653F, 22.25F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 222, 373, 8.3991F, 10.3653F, 24.6F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 226, 373, 8.3991F, 10.3653F, 19.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 230, 373, 8.3991F, 10.3653F, 16.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 373, 8.3991F, 10.3653F, 17.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 238, 373, 8.3991F, 10.3653F, 13.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 242, 373, 8.3991F, 10.3653F, 14.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 246, 373, 8.3991F, 10.3653F, 11.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 250, 373, 8.3991F, 10.3653F, 12.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 254, 373, 8.3991F, 10.3653F, 9.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 258, 373, 8.3991F, 10.3653F, 8.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 262, 373, 8.3991F, 10.3653F, 7.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 266, 373, 8.3991F, 10.3653F, 6.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 270, 373, 8.3991F, 10.3653F, 4.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 274, 373, 8.3991F, 10.3653F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 278, 373, 8.3991F, 10.3653F, 3.2F, 1, 1, 1, -0.198F, false));

		handguardWide = new ModelRenderer(this);
		handguardWide.setRotationPoint(0.0F, 0.0F, -44.1F);
		handguardOSW.addChild(handguardWide);
		handguardWide.cubeList.add(new ModelBox(handguardWide, 288, 169, -3.9851F, -35.6034F, -6.5436F, 5, 1, 20, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 134, 315, 0.3976F, -37.5273F, -6.5436F, 1, 2, 19, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 174, 315, -4.3678F, -37.5273F, -6.5436F, 1, 2, 19, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 298, 116, 1.001F, -38.0587F, -6.5436F, 1, 1, 20, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 300, 0, -4.999F, -38.0587F, -6.5436F, 1, 1, 20, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 72, 374, -5.0F, -37.4587F, 12.4564F, 1, 1, 1, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 374, 73, 1.0F, -37.4587F, 12.4564F, 1, 1, 1, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 298, 96, -3.5F, -35.4494F, -5.7533F, 4, 1, 19, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 40, 355, -3.5F, -39.5535F, -12.5382F, 4, 4, 6, 0.0F, false));
		handguardWide.cubeList.add(new ModelBox(handguardWide, 330, 69, -3.5F, -39.5777F, -13.3147F, 4, 4, 1, 0.0F, false));

		bone186 = new ModelRenderer(this);
		bone186.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardWide.addChild(bone186);
		setRotationAngle(bone186, 0.0F, 0.0F, -0.9599F);
		

		bone187 = new ModelRenderer(this);
		bone187.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguardWide.addChild(bone187);
		setRotationAngle(bone187, 0.0F, 0.0F, 0.9599F);
		

		bone188 = new ModelRenderer(this);
		bone188.setRotationPoint(-3.9099F, -35.6584F, -51.2495F);
		handguardWide.addChild(bone188);
		setRotationAngle(bone188, 0.0F, 0.0F, 1.1781F);
		bone188.cubeList.add(new ModelBox(bone188, 300, 48, -0.0541F, -0.5268F, 44.7059F, 1, 1, 20, 0.0F, false));
		bone188.cubeList.add(new ModelBox(bone188, 108, 370, -1.1565F, -0.2991F, 63.7059F, 2, 1, 1, 0.0F, false));

		bone31_r1 = new ModelRenderer(this);
		bone31_r1.setRotationPoint(-1.5574F, -0.22F, 0.2059F);
		bone188.addChild(bone31_r1);
		setRotationAngle(bone31_r1, 0.0F, 0.0F, -0.5672F);
		bone31_r1.cubeList.add(new ModelBox(bone31_r1, 300, 212, -0.5F, -0.5F, 44.5F, 1, 1, 20, 0.0F, false));

		bone189 = new ModelRenderer(this);
		bone189.setRotationPoint(3.9099F, -35.6584F, -51.2495F);
		handguardWide.addChild(bone189);
		setRotationAngle(bone189, 0.0F, 0.0F, -1.1781F);
		bone189.cubeList.add(new ModelBox(bone189, 282, 314, -2.0825F, -3.2709F, 44.7059F, 1, 1, 20, 0.0F, false));
		bone189.cubeList.add(new ModelBox(bone189, 128, 370, -1.9915F, -3.0708F, 63.7059F, 2, 1, 1, 0.0F, false));

		bone32_r1 = new ModelRenderer(this);
		bone32_r1.setRotationPoint(0.4102F, -2.9898F, 0.2059F);
		bone189.addChild(bone32_r1);
		setRotationAngle(bone32_r1, 0.0F, 0.0F, 0.5672F);
		bone32_r1.cubeList.add(new ModelBox(bone32_r1, 302, 21, -0.5F, -0.5F, 44.5F, 1, 1, 20, 0.0F, false));

		bone190 = new ModelRenderer(this);
		bone190.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguardWide.addChild(bone190);
		setRotationAngle(bone190, -0.0175F, 0.0F, 0.0F);
		bone190.cubeList.add(new ModelBox(bone190, 162, 95, -2.7929F, -1.293F, 21.2867F, 2, 1, 7, 0.0F, false));
		bone190.cubeList.add(new ModelBox(bone190, 296, 160, -1.2071F, -1.293F, 21.2867F, 1, 1, 7, 0.0F, false));

		bone191 = new ModelRenderer(this);
		bone191.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone190.addChild(bone191);
		setRotationAngle(bone191, 0.7854F, 0.0F, 0.0F);
		bone191.cubeList.add(new ModelBox(bone191, 374, 75, -0.5F, 40.6381F, 43.1833F, 1, 1, 1, 0.0F, false));
		bone191.cubeList.add(new ModelBox(bone191, 76, 374, -4.0F, 40.6381F, 43.1833F, 1, 1, 1, 0.0F, false));

		bone192 = new ModelRenderer(this);
		bone192.setRotationPoint(1.0F, -25.9494F, -69.2533F);
		handguardWide.addChild(bone192);
		setRotationAngle(bone192, 0.0F, 0.0F, 0.7854F);
		bone192.cubeList.add(new ModelBox(bone192, 114, 179, -8.1618F, -6.4547F, 55.9386F, 1, 1, 8, 0.0F, false));

		bone193 = new ModelRenderer(this);
		bone193.setRotationPoint(-2.0F, -25.9494F, -69.2533F);
		handguardWide.addChild(bone193);
		setRotationAngle(bone193, 0.0F, 0.0F, 0.7854F);
		bone193.cubeList.add(new ModelBox(bone193, 114, 170, -7.8689F, -6.7476F, 55.9386F, 1, 1, 8, 0.0F, false));

		bone194 = new ModelRenderer(this);
		bone194.setRotationPoint(0.0F, -40.952F, -72.3533F);
		handguardWide.addChild(bone194);
		setRotationAngle(bone194, 0.5672F, 0.0F, 0.0F);
		bone194.cubeList.add(new ModelBox(bone194, 154, 33, -3.5F, 32.8789F, 49.0552F, 4, 1, 1, 0.0F, false));

		bone195 = new ModelRenderer(this);
		bone195.setRotationPoint(-0.15F, -41.3587F, -66.5436F);
		handguardWide.addChild(bone195);
		setRotationAngle(bone195, 0.0F, 0.0F, -0.576F);
		bone195.cubeList.add(new ModelBox(bone195, 334, 283, -1.0F, 3.0F, 60.0F, 1, 1, 18, 0.0F, false));

		bone196 = new ModelRenderer(this);
		bone196.setRotationPoint(0.0F, 1.6087F, 1.0F);
		bone195.addChild(bone196);
		setRotationAngle(bone196, -2.3562F, 0.0F, 0.0F);
		

		bone197 = new ModelRenderer(this);
		bone197.setRotationPoint(-2.85F, -41.3587F, -66.5436F);
		handguardWide.addChild(bone197);
		setRotationAngle(bone197, 0.0F, 0.0F, 0.576F);
		bone197.cubeList.add(new ModelBox(bone197, 324, 334, 0.0F, 3.0F, 60.0F, 1, 1, 18, 0.0F, false));

		bone198 = new ModelRenderer(this);
		bone198.setRotationPoint(1.0357F, 1.6164F, 1.0F);
		bone197.addChild(bone198);
		setRotationAngle(bone198, -2.3562F, 0.0F, 0.0F);
		

		handguard2 = new ModelRenderer(this);
		handguard2.setRotationPoint(-3.8F, -45.2F, -60.0F);
		handguardOSW.addChild(handguard2);
		handguard2.cubeList.add(new ModelBox(handguard2, 336, 190, -1.299F, 5.25F, 10.298F, 2, 2, 16, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 36, 337, 3.901F, 5.25F, 10.298F, 2, 2, 16, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 214, 335, 1.3F, 10.25F, 10.3F, 2, 1, 17, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(5.8F, -6.7F, 1.15F);
		handguard2.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 1.5708F);
		bone7.cubeList.add(new ModelBox(bone7, 134, 370, 11.975F, -0.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 140, 370, 11.975F, -0.8F, 10.85F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 146, 370, 11.975F, -0.8F, 12.1F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 152, 370, 11.975F, -0.8F, 13.35F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 370, 157, 11.975F, -0.8F, 14.6F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 158, 370, 11.975F, -0.8F, 15.85F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 164, 370, 11.975F, -0.8F, 17.1F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 370, 186, 11.975F, -0.8F, 18.35F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 314, 365, 11.975F, -0.8F, 23.4F, 2, 1, 2, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 370, 188, 11.975F, -0.8F, 22.15F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 284, 370, 11.975F, -0.8F, 20.9F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 370, 332, 11.975F, -0.8F, 19.65F, 2, 1, 1, -0.199F, false));
		bone7.cubeList.add(new ModelBox(bone7, 370, 349, 11.975F, -0.8F, 8.95F, 2, 1, 1, -0.199F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone7.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.8901F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 77, 8.0026F, -11.2827F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 79, 8.0026F, -11.2827F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 80, 374, 8.0026F, -11.2827F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 81, 8.0026F, -11.2827F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 83, 8.0026F, -11.2827F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 374, 8.0026F, -11.2827F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 85, 8.0026F, -11.2827F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 87, 8.0026F, -11.2827F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 374, 8.0026F, -11.2827F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 89, 8.0026F, -11.2827F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 374, 91, 8.0026F, -11.2827F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 92, 374, 8.0026F, -11.2827F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 326, 368, 8.0026F, -11.2827F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 342, 59, 8.0546F, -11.1307F, 10.198F, 1, 1, 15, -0.35F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone7.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.8901F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 93, 8.3352F, 10.1275F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 95, 8.3352F, 10.1275F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 96, 374, 8.3352F, 10.1275F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 97, 8.3352F, 10.1275F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 99, 8.3352F, 10.1275F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 100, 374, 8.3352F, 10.1275F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 101, 8.3352F, 10.1275F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 103, 8.3352F, 10.1275F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 104, 374, 8.3352F, 10.1275F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 105, 8.3352F, 10.1275F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 374, 107, 8.3352F, 10.1275F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 108, 374, 8.3352F, 10.1275F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 332, 368, 8.3352F, 10.1275F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 342, 75, 8.2832F, 10.2795F, 10.198F, 1, 1, 15, -0.35F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.0F, 6.5F, 14.913F);
		handguard2.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -1.5708F);
		bone8.cubeList.add(new ModelBox(bone8, 272, 371, -0.775F, -1.0F, -4.213F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 351, -0.775F, -1.0F, -2.913F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 353, -0.775F, -1.0F, -1.663F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 355, -0.775F, -1.0F, -0.413F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 357, -0.775F, -1.0F, 0.837F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 359, -0.775F, -1.0F, 2.087F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 361, -0.775F, -1.0F, 3.337F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 363, -0.775F, -1.0F, 4.587F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 322, 365, -0.775F, -1.0F, 9.637F, 2, 1, 2, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 114, 371, -0.775F, -1.0F, 8.387F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 120, 371, -0.775F, -1.0F, 7.137F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 170, 371, -0.775F, -1.0F, 5.887F, 2, 1, 1, -0.199F, false));
		bone8.cubeList.add(new ModelBox(bone8, 176, 371, -0.775F, -1.0F, -4.813F, 2, 1, 1, -0.199F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-14.8F, -0.3F, -15.013F);
		bone8.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 109, 8.3635F, -11.5695F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 271, 8.3635F, -11.5695F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 111, 8.3635F, -11.5695F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 113, 8.3635F, -11.5695F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 115, 8.3635F, -11.5695F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 117, 8.3635F, -11.5695F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 119, 8.3635F, -11.5695F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 121, 8.3635F, -11.5695F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 123, 8.3635F, -11.5695F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 124, 374, 8.3635F, -11.5695F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 125, 8.3635F, -11.5695F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 374, 127, 8.3635F, -11.5695F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 368, 365, 8.3635F, -11.5695F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 342, 208, 8.4155F, -11.4175F, 11.198F, 1, 1, 14, -0.35F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-13.2F, -0.3F, -15.013F);
		bone8.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.8901F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 128, 374, 8.5407F, 10.5402F, 10.2F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 273, 8.5407F, 10.5402F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 129, 8.5407F, 10.5402F, 19.6F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 131, 8.5407F, 10.5402F, 18.35F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 132, 374, 8.5407F, 10.5402F, 17.1F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 133, 8.5407F, 10.5402F, 15.85F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 135, 8.5407F, 10.5402F, 14.6F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 136, 374, 8.5407F, 10.5402F, 13.35F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 137, 8.5407F, 10.5402F, 12.1F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 139, 8.5407F, 10.5402F, 20.9F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 140, 374, 8.5407F, 10.5402F, 22.15F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 374, 141, 8.5407F, 10.5402F, 23.4F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 368, 368, 8.5407F, 10.5402F, 24.65F, 1, 1, 2, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 344, 17, 8.4887F, 10.6922F, 11.198F, 1, 1, 14, -0.35F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(3.4667F, 11.4209F, 12.7917F);
		handguard2.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -3.1416F);
		bone10.cubeList.add(new ModelBox(bone10, 182, 371, 0.1667F, -0.5292F, -1.9417F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 188, 371, 0.1667F, -0.5292F, -0.6917F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 194, 371, 0.1667F, -0.5292F, 0.5583F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 200, 371, 0.1667F, -0.5292F, 1.8083F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 206, 371, 0.1667F, -0.5292F, 3.0583F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 212, 371, 0.1667F, -0.5292F, 4.3083F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 218, 371, 0.1667F, -0.5292F, 6.8083F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 224, 371, 0.1667F, -0.5292F, 5.5583F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 230, 371, 0.1667F, -0.5292F, 9.3083F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 236, 371, 0.1667F, -0.5292F, 8.0583F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 242, 371, 0.1667F, -0.5292F, 11.8083F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 248, 371, 0.1667F, -0.5292F, 10.5583F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 254, 371, 0.1667F, -0.5292F, 13.6083F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 260, 371, 0.1667F, -0.5292F, 13.0583F, 2, 1, 1, -0.199F, false));
		bone10.cubeList.add(new ModelBox(bone10, 266, 371, 0.1667F, -0.5292F, -2.5417F, 2, 1, 1, -0.199F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-13.6334F, 0.3208F, -7.4917F);
		bone10.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.8901F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 143, 8.1054F, -11.4891F, 4.95F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 144, 374, 8.1054F, -11.4891F, 20.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 145, 8.1054F, -11.4891F, 21.1F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 147, 8.1054F, -11.4891F, 18.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 148, 374, 8.1054F, -11.4891F, 19.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 152, 374, 8.1054F, -11.4891F, 15.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 156, 374, 8.1054F, -11.4891F, 16.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 159, 8.1054F, -11.4891F, 13.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 160, 374, 8.1054F, -11.4891F, 14.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 161, 8.1054F, -11.4891F, 11.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 163, 8.1054F, -11.4891F, 10.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 164, 374, 8.1054F, -11.4891F, 9.3F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 165, 8.1054F, -11.4891F, 8.05F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 167, 8.1054F, -11.4891F, 6.8F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 374, 169, 8.1054F, -11.4891F, 5.55F, 1, 1, 1, -0.198F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 342, 0, 8.1574F, -11.3371F, 5.098F, 1, 1, 16, -0.35F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-12.0334F, 0.3208F, -7.4917F);
		bone10.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.8901F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 171, 8.5156F, 10.2709F, 4.95F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 173, 8.5156F, 10.2709F, 20.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 175, 8.5156F, 10.2709F, 21.1F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 230, 8.5156F, 10.2709F, 18.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 249, 8.5156F, 10.2709F, 19.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 251, 8.5156F, 10.2709F, 15.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 253, 8.5156F, 10.2709F, 16.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 255, 8.5156F, 10.2709F, 13.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 257, 8.5156F, 10.2709F, 14.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 259, 8.5156F, 10.2709F, 11.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 261, 8.5156F, 10.2709F, 10.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 263, 8.5156F, 10.2709F, 9.3F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 265, 8.5156F, 10.2709F, 8.05F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 267, 8.5156F, 10.2709F, 6.8F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 374, 269, 8.5156F, 10.2709F, 5.55F, 1, 1, 1, -0.198F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 342, 42, 8.4636F, 10.4229F, 5.098F, 1, 1, 16, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardOSW.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}