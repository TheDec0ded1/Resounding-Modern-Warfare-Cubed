package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class mp5khg extends ModelBase {
	private final ModelRenderer mp5_navy_handguard2;
	private final ModelRenderer gun34_r7;
	private final ModelRenderer bone20;
	private final ModelRenderer gun35_r5;
	private final ModelRenderer gun35_r3_r1;
	private final ModelRenderer gun34_r8;
	private final ModelRenderer gun35_r5_r1;
	private final ModelRenderer bone22;
	private final ModelRenderer gun36_r2;
	private final ModelRenderer gun36_r2_r1;
	private final ModelRenderer gun35_r6;
	private final ModelRenderer gun45_r4_r1;
	private final ModelRenderer bone23;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone19_r1;
	private final ModelRenderer bone18_r1;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer bone15_r1;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone13_r2;
	private final ModelRenderer gun34_r9;
	private final ModelRenderer gun34_r6_r1;
	private final ModelRenderer gun33_r3;
	private final ModelRenderer gun33_r3_r1;
	private final ModelRenderer bone24;
	private final ModelRenderer gun35_r7;
	private final ModelRenderer gun35_r5_r2;
	private final ModelRenderer gun34_r10;
	private final ModelRenderer gun34_r7_r1;

	public mp5khg() {
		textureWidth = 280;
		textureHeight = 300;

		mp5_navy_handguard2 = new ModelRenderer(this);
		mp5_navy_handguard2.setRotationPoint(0.0F, 24.0F, 9.0F);
		mp5_navy_handguard2.cubeList.add(new ModelBox(mp5_navy_handguard2, 120, 57, -3.0F, -37.5F, -39.8F, 3, 2, 8, 0.0F, false));

		gun34_r7 = new ModelRenderer(this);
		gun34_r7.setRotationPoint(-4.6F, -34.4F, -30.2F);
		mp5_navy_handguard2.addChild(gun34_r7);
		setRotationAngle(gun34_r7, -0.2618F, 0.0F, 0.0F);
		gun34_r7.cubeList.add(new ModelBox(gun34_r7, 119, 18, 1.5F, -0.5F, -9.5F, 1, 1, 1, 0.0F, false));
		gun34_r7.cubeList.add(new ModelBox(gun34_r7, 120, 29, 3.7F, -0.5F, -9.5F, 1, 1, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.2025F, -36.9129F, -30.3F);
		mp5_navy_handguard2.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.0F, -0.3054F);
		bone20.cubeList.add(new ModelBox(bone20, 200, 87, -0.5F, -0.5F, -7.5F, 1, 2, 6, 0.002F, false));

		gun35_r5 = new ModelRenderer(this);
		gun35_r5.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone20.addChild(gun35_r5);
		setRotationAngle(gun35_r5, -0.0934F, -0.0475F, -0.469F);
		

		gun35_r3_r1 = new ModelRenderer(this);
		gun35_r3_r1.setRotationPoint(-1.7791F, -0.629F, -5.9617F);
		gun35_r5.addChild(gun35_r3_r1);
		setRotationAngle(gun35_r3_r1, 0.0625F, 0.0609F, 0.0046F);
		gun35_r3_r1.cubeList.add(new ModelBox(gun35_r3_r1, 109, 58, 1.2116F, -0.9881F, -3.5421F, 1, 2, 2, 0.0F, false));

		gun34_r8 = new ModelRenderer(this);
		gun34_r8.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone20.addChild(gun34_r8);
		setRotationAngle(gun34_r8, -0.1047F, 0.0F, 0.0F);
		

		gun35_r5_r1 = new ModelRenderer(this);
		gun35_r5_r1.setRotationPoint(-1.8779F, 0.179F, -5.9911F);
		gun34_r8.addChild(gun35_r5_r1);
		setRotationAngle(gun35_r5_r1, 0.0833F, 0.026F, 0.0038F);
		gun35_r5_r1.cubeList.add(new ModelBox(gun35_r5_r1, 220, 107, 1.4355F, -1.0331F, -1.542F, 1, 1, 6, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-2.7975F, -36.9129F, -30.3F);
		mp5_navy_handguard2.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, 0.3054F);
		bone22.cubeList.add(new ModelBox(bone22, 72, 200, -0.5F, -0.5F, -7.5F, 1, 2, 6, 0.002F, false));

		gun36_r2 = new ModelRenderer(this);
		gun36_r2.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone22.addChild(gun36_r2);
		setRotationAngle(gun36_r2, -0.0934F, 0.0475F, 0.469F);
		

		gun36_r2_r1 = new ModelRenderer(this);
		gun36_r2_r1.setRotationPoint(1.7791F, -0.629F, -5.9617F);
		gun36_r2.addChild(gun36_r2_r1);
		setRotationAngle(gun36_r2_r1, 0.0625F, -0.0609F, -0.0046F);
		gun36_r2_r1.cubeList.add(new ModelBox(gun36_r2_r1, 0, 104, -2.2116F, -0.9881F, -3.5421F, 1, 2, 2, 0.0F, false));

		gun35_r6 = new ModelRenderer(this);
		gun35_r6.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone22.addChild(gun35_r6);
		setRotationAngle(gun35_r6, -0.1047F, 0.0F, 0.0F);
		

		gun45_r4_r1 = new ModelRenderer(this);
		gun45_r4_r1.setRotationPoint(1.9029F, 0.1789F, -5.9904F);
		gun35_r6.addChild(gun45_r4_r1);
		setRotationAngle(gun45_r4_r1, 0.0833F, -0.026F, -0.0038F);
		gun45_r4_r1.cubeList.add(new ModelBox(gun45_r4_r1, 208, 197, -2.4605F, -1.0331F, -1.542F, 1, 1, 6, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard2.addChild(bone23);
		setRotationAngle(bone23, -0.1047F, 0.0F, 0.0F);
		

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(0.0F, -1.5019F, -5.8913F);
		bone23.addChild(bone13_r1);
		setRotationAngle(bone13_r1, 0.0873F, 0.0F, 0.0F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 17, 144, -1.0F, 0.7019F, -5.614F, 2, 1, 2, 0.0F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 11, 138, -1.0F, -0.2981F, -3.614F, 2, 2, 8, 0.0F, false));

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(0.0F, 36.0392F, 0.9863F);
		bone23.addChild(bone19_r1);
		setRotationAngle(bone19_r1, -0.8727F, 0.0F, 0.0F);
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 66, 110, -1.0F, -14.7981F, -35.114F, 2, 1, 1, 0.0F, false));
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 66, 110, -1.0F, -11.8981F, -19.814F, 2, 1, 1, 0.0F, false));

		bone18_r1 = new ModelRenderer(this);
		bone18_r1.setRotationPoint(0.0F, 30.7979F, 4.5014F);
		bone23.addChild(bone18_r1);
		setRotationAngle(bone18_r1, -0.8727F, 0.0F, 0.0F);
		bone18_r1.cubeList.add(new ModelBox(bone18_r1, 66, 110, -1.0F, -13.8981F, -29.414F, 2, 1, 1, 0.0F, false));
		bone18_r1.cubeList.add(new ModelBox(bone18_r1, 66, 110, -1.0F, -0.4981F, -22.014F, 2, 1, 1, 0.0F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(0.0F, 35.2272F, 1.2963F);
		bone23.addChild(bone17_r1);
		setRotationAngle(bone17_r1, -0.8727F, 0.0F, 0.0F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 66, 110, -1.0F, -5.4981F, -23.114F, 2, 1, 1, 0.0F, false));

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(0.0F, 30.6408F, 4.5665F);
		bone23.addChild(bone16_r1);
		setRotationAngle(bone16_r1, -0.8727F, 0.0F, 0.0F);
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 66, 110, -1.0F, -6.5981F, -17.114F, 2, 1, 1, 0.0F, false));

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(0.0F, -2.2283F, -4.3912F);
		bone23.addChild(bone15_r1);
		setRotationAngle(bone15_r1, 1.6581F, 0.0F, 0.0F);
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 66, 110, -1.0F, -6.5981F, -17.114F, 2, 8, 1, 0.0F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(0.0F, -1.5019F, -5.8913F);
		bone23.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0873F, 0.0F, 0.0F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 66, 110, -1.0F, 1.7019F, -5.614F, 2, 14, 1, 0.0F, false));

		bone13_r2 = new ModelRenderer(this);
		bone13_r2.setRotationPoint(0.0F, -0.6683F, -12.6014F);
		bone23.addChild(bone13_r2);
		setRotationAngle(bone13_r2, 0.0873F, 0.0F, 0.0F);
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 65, 109, -1.0F, 0.7019F, 8.536F, 2, 15, 2, 0.0F, false));

		gun34_r9 = new ModelRenderer(this);
		gun34_r9.setRotationPoint(1.6279F, -1.3223F, 0.0F);
		bone23.addChild(gun34_r9);
		setRotationAngle(gun34_r9, -0.0262F, 0.0175F, -1.1781F);
		

		gun34_r6_r1 = new ModelRenderer(this);
		gun34_r6_r1.setRotationPoint(-0.3539F, -1.4176F, -5.9375F);
		gun34_r9.addChild(gun34_r6_r1);
		setRotationAngle(gun34_r6_r1, 0.0336F, 0.0805F, 0.0041F);
		gun34_r6_r1.cubeList.add(new ModelBox(gun34_r6_r1, 136, 137, -0.3689F, -0.1971F, -3.5659F, 2, 2, 8, 0.0F, false));

		gun33_r3 = new ModelRenderer(this);
		gun33_r3.setRotationPoint(0.9886F, -0.2184F, 0.0274F);
		bone23.addChild(gun33_r3);
		setRotationAngle(gun33_r3, -0.0192F, 0.0262F, -0.7854F);
		

		gun33_r3_r1 = new ModelRenderer(this);
		gun33_r3_r1.setRotationPoint(0.3635F, -1.4928F, -5.9409F);
		gun33_r3.addChild(gun33_r3_r1);
		setRotationAngle(gun33_r3_r1, 0.0618F, 0.0615F, 0.0047F);
		gun33_r3_r1.cubeList.add(new ModelBox(gun33_r3_r1, 33, 142, -0.6513F, -0.2193F, -3.5628F, 1, 2, 8, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard2.addChild(bone24);
		setRotationAngle(bone24, -0.1047F, 0.0F, 0.0F);
		

		gun35_r7 = new ModelRenderer(this);
		gun35_r7.setRotationPoint(-1.6279F, -1.3223F, 0.0F);
		bone24.addChild(gun35_r7);
		setRotationAngle(gun35_r7, -0.0262F, -0.0175F, 1.1781F);
		

		gun35_r5_r2 = new ModelRenderer(this);
		gun35_r5_r2.setRotationPoint(0.3539F, -1.4176F, -5.9375F);
		gun35_r7.addChild(gun35_r5_r2);
		setRotationAngle(gun35_r5_r2, 0.0336F, -0.0805F, -0.0041F);
		gun35_r5_r2.cubeList.add(new ModelBox(gun35_r5_r2, 135, 115, -1.6311F, -0.1971F, -3.5659F, 2, 2, 8, 0.0F, false));

		gun34_r10 = new ModelRenderer(this);
		gun34_r10.setRotationPoint(-0.9886F, -0.2184F, 0.0274F);
		bone24.addChild(gun34_r10);
		setRotationAngle(gun34_r10, -0.0192F, -0.0262F, 0.7854F);
		

		gun34_r7_r1 = new ModelRenderer(this);
		gun34_r7_r1.setRotationPoint(-0.3635F, -1.4928F, -5.9409F);
		gun34_r10.addChild(gun34_r7_r1);
		setRotationAngle(gun34_r7_r1, 0.0618F, -0.0615F, -0.0047F);
		gun34_r7_r1.cubeList.add(new ModelBox(gun34_r7_r1, 141, 77, -0.3487F, -0.2193F, -3.5628F, 1, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mp5_navy_handguard2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}