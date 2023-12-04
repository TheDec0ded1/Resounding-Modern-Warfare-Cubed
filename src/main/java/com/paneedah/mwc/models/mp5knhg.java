package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class mp5knhg extends ModelBase {
	private final ModelRenderer mp5_navy_handguard;
	private final ModelRenderer gun34_r3;
	private final ModelRenderer bone10;
	private final ModelRenderer gun35_r2;
	private final ModelRenderer gun35_r2_r1;
	private final ModelRenderer gun34_r4;
	private final ModelRenderer gun34_r4_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun36_r1_r1;
	private final ModelRenderer gun35_r3;
	private final ModelRenderer gun35_r3_r1;
	private final ModelRenderer bone11;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone18_r1;
	private final ModelRenderer bone19_r1;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone20_r1;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer bone18_r2;
	private final ModelRenderer bone17_r2;
	private final ModelRenderer bone19_r2;
	private final ModelRenderer bone15_r1;
	private final ModelRenderer bone16_r2;
	private final ModelRenderer bone15_r2;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone17_r3;
	private final ModelRenderer bone18_r3;
	private final ModelRenderer bone16_r3;
	private final ModelRenderer bone15_r3;
	private final ModelRenderer bone17_r4;
	private final ModelRenderer gun34_r5;
	private final ModelRenderer gun34_r5_r1;
	private final ModelRenderer gun33_r2;
	private final ModelRenderer gun33_r2_r1;
	private final ModelRenderer bone21;
	private final ModelRenderer gun35_r4;
	private final ModelRenderer gun35_r4_r1;
	private final ModelRenderer gun34_r6;
	private final ModelRenderer gun34_r6_r1;

	public mp5knhg() {
		textureWidth = 280;
		textureHeight = 300;

		mp5_navy_handguard = new ModelRenderer(this);
		mp5_navy_handguard.setRotationPoint(0.0F, 24.0F, 9.0F);
		mp5_navy_handguard.cubeList.add(new ModelBox(mp5_navy_handguard, 120, 57, -3.0F, -37.5F, -39.8F, 3, 2, 8, 0.0F, false));

		gun34_r3 = new ModelRenderer(this);
		gun34_r3.setRotationPoint(-4.6F, -34.4F, -30.2F);
		mp5_navy_handguard.addChild(gun34_r3);
		setRotationAngle(gun34_r3, -0.2618F, 0.0F, 0.0F);
		gun34_r3.cubeList.add(new ModelBox(gun34_r3, 119, 18, 1.5F, -0.5F, -9.5F, 1, 1, 1, 0.0F, false));
		gun34_r3.cubeList.add(new ModelBox(gun34_r3, 120, 29, 3.7F, -0.5F, -9.5F, 1, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.2025F, -36.9129F, -30.3F);
		mp5_navy_handguard.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.3054F);
		bone10.cubeList.add(new ModelBox(bone10, 200, 87, -0.5F, -0.5F, -7.5F, 1, 2, 6, 0.002F, false));

		gun35_r2 = new ModelRenderer(this);
		gun35_r2.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone10.addChild(gun35_r2);
		setRotationAngle(gun35_r2, -0.0934F, -0.0475F, -0.469F);
		

		gun35_r2_r1 = new ModelRenderer(this);
		gun35_r2_r1.setRotationPoint(-1.7791F, -0.629F, -5.9617F);
		gun35_r2.addChild(gun35_r2_r1);
		setRotationAngle(gun35_r2_r1, 0.0625F, 0.0609F, 0.0046F);
		gun35_r2_r1.cubeList.add(new ModelBox(gun35_r2_r1, 109, 58, 1.2116F, -0.9881F, -3.5421F, 1, 2, 2, 0.0F, false));

		gun34_r4 = new ModelRenderer(this);
		gun34_r4.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone10.addChild(gun34_r4);
		setRotationAngle(gun34_r4, -0.1047F, 0.0F, 0.0F);
		

		gun34_r4_r1 = new ModelRenderer(this);
		gun34_r4_r1.setRotationPoint(-1.8779F, 0.179F, -5.9911F);
		gun34_r4.addChild(gun34_r4_r1);
		setRotationAngle(gun34_r4_r1, 0.0833F, 0.026F, 0.0038F);
		gun34_r4_r1.cubeList.add(new ModelBox(gun34_r4_r1, 220, 107, 1.4355F, -1.0331F, -1.542F, 1, 1, 6, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.7975F, -36.9129F, -30.3F);
		mp5_navy_handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.3054F);
		bone5.cubeList.add(new ModelBox(bone5, 72, 200, -0.5F, -0.5F, -7.5F, 1, 2, 6, 0.002F, false));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone5.addChild(gun36_r1);
		setRotationAngle(gun36_r1, -0.0934F, 0.0475F, 0.469F);
		

		gun36_r1_r1 = new ModelRenderer(this);
		gun36_r1_r1.setRotationPoint(1.7791F, -0.629F, -5.9617F);
		gun36_r1.addChild(gun36_r1_r1);
		setRotationAngle(gun36_r1_r1, 0.0625F, -0.0609F, -0.0046F);
		gun36_r1_r1.cubeList.add(new ModelBox(gun36_r1_r1, 0, 104, -2.2116F, -0.9881F, -3.5421F, 1, 2, 2, 0.0F, false));

		gun35_r3 = new ModelRenderer(this);
		gun35_r3.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone5.addChild(gun35_r3);
		setRotationAngle(gun35_r3, -0.1047F, 0.0F, 0.0F);
		

		gun35_r3_r1 = new ModelRenderer(this);
		gun35_r3_r1.setRotationPoint(1.9029F, 0.1789F, -5.9904F);
		gun35_r3.addChild(gun35_r3_r1);
		setRotationAngle(gun35_r3_r1, 0.0833F, -0.026F, -0.0038F);
		gun35_r3_r1.cubeList.add(new ModelBox(gun35_r3_r1, 208, 197, -2.4605F, -1.0331F, -1.542F, 1, 1, 6, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard.addChild(bone11);
		setRotationAngle(bone11, -0.1047F, 0.0F, 0.0F);
		

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(0.0F, -2.769F, -13.346F);
		bone11.addChild(bone13_r1);
		setRotationAngle(bone13_r1, 1.6581F, 0.0F, 0.0F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 17, 144, -1.0F, 1.7019F, -5.614F, 2, 1, 2, 0.0F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(0.0F, -1.5019F, -5.8913F);
		bone11.addChild(bone12_r1);
		setRotationAngle(bone12_r1, 0.0873F, 0.0F, 0.0F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 17, 144, -1.0F, 0.7019F, -5.614F, 2, 1, 2, 0.0F, false));
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 11, 138, -1.0F, -0.2981F, -3.614F, 2, 2, 8, 0.0F, false));

		bone18_r1 = new ModelRenderer(this);
		bone18_r1.setRotationPoint(0.0F, 1.3675F, -5.2722F);
		bone11.addChild(bone18_r1);
		setRotationAngle(bone18_r1, -0.3054F, 0.0F, 0.0F);
		bone18_r1.cubeList.add(new ModelBox(bone18_r1, 66, 110, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.2F, false));

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(0.7854F, 1.2991F, -4.4898F);
		bone11.addChild(bone19_r1);
		setRotationAngle(bone19_r1, 0.0807F, 0.0334F, -0.3914F);
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 65, 109, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.2F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(0.0F, 1.2306F, -3.7074F);
		bone11.addChild(bone17_r1);
		setRotationAngle(bone17_r1, 0.48F, 0.0F, 0.0F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 40, 105, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.2F, false));

		bone20_r1 = new ModelRenderer(this);
		bone20_r1.setRotationPoint(-0.7854F, 1.2991F, -4.4898F);
		bone11.addChild(bone20_r1);
		setRotationAngle(bone20_r1, 0.0807F, -0.0334F, 0.3914F);
		bone20_r1.cubeList.add(new ModelBox(bone20_r1, 65, 109, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.2F, false));

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(0.0F, -0.4359F, -5.3651F);
		bone11.addChild(bone16_r1);
		setRotationAngle(bone16_r1, 0.48F, 0.0F, 0.0F);
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 40, 105, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.2F, false));

		bone18_r2 = new ModelRenderer(this);
		bone18_r2.setRotationPoint(-0.7294F, -0.4994F, -4.6385F);
		bone11.addChild(bone18_r2);
		setRotationAngle(bone18_r2, 0.0807F, 0.0334F, -0.3914F);
		bone18_r2.cubeList.add(new ModelBox(bone18_r2, 65, 109, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.2F, false));

		bone17_r2 = new ModelRenderer(this);
		bone17_r2.setRotationPoint(0.0F, -0.563F, -3.9119F);
		bone11.addChild(bone17_r2);
		setRotationAngle(bone17_r2, -0.3054F, 0.0F, 0.0F);
		bone17_r2.cubeList.add(new ModelBox(bone17_r2, 66, 110, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.2F, false));

		bone19_r2 = new ModelRenderer(this);
		bone19_r2.setRotationPoint(0.7294F, -0.4994F, -4.6385F);
		bone11.addChild(bone19_r2);
		setRotationAngle(bone19_r2, 0.0807F, -0.0334F, 0.3914F);
		bone19_r2.cubeList.add(new ModelBox(bone19_r2, 65, 109, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.2F, false));

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(0.0F, -2.2019F, -7.1913F);
		bone11.addChild(bone15_r1);
		setRotationAngle(bone15_r1, 0.0873F, 0.0F, 0.0F);
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 66, 110, -1.0F, 4.3019F, 2.886F, 2, 3, 1, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 65, 109, 0.5F, 4.3019F, 1.386F, 1, 3, 2, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 66, 110, -1.0F, 4.3019F, 0.886F, 2, 3, 1, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 65, 109, -1.5F, 4.3019F, 1.386F, 1, 3, 2, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 65, 109, -1.5F, 8.7019F, 1.386F, 1, 2, 2, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 65, 109, 0.5F, 8.7019F, 1.386F, 1, 2, 2, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 66, 110, -1.0F, 8.7019F, 0.886F, 2, 2, 1, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 66, 110, -1.0F, 8.7019F, 2.886F, 2, 2, 1, 0.2F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 65, 109, -1.0F, 1.7019F, 1.386F, 2, 9, 2, 0.2F, false));

		bone16_r2 = new ModelRenderer(this);
		bone16_r2.setRotationPoint(-3.6F, -8.3434F, -8.1301F);
		bone11.addChild(bone16_r2);
		setRotationAngle(bone16_r2, 0.0873F, 0.0F, 0.0F);
		bone16_r2.cubeList.add(new ModelBox(bone16_r2, 66, 110, 3.0F, 13.7019F, 0.886F, 2, 1, 1, -0.2F, false));

		bone15_r2 = new ModelRenderer(this);
		bone15_r2.setRotationPoint(-4.4F, -8.4131F, -7.3331F);
		bone11.addChild(bone15_r2);
		setRotationAngle(bone15_r2, 0.0873F, 0.0F, 0.0F);
		bone15_r2.cubeList.add(new ModelBox(bone15_r2, 66, 110, 3.0F, 13.7019F, 2.886F, 2, 1, 1, -0.2F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(0.4F, -8.4131F, -7.3331F);
		bone11.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0873F, 0.0F, 0.0F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 66, 110, -1.0F, 13.7019F, 2.886F, 2, 1, 1, -0.2F, false));

		bone17_r3 = new ModelRenderer(this);
		bone17_r3.setRotationPoint(0.4F, -16.3827F, -8.0304F);
		bone11.addChild(bone17_r3);
		setRotationAngle(bone17_r3, 0.0873F, 0.0F, 0.0F);
		bone17_r3.cubeList.add(new ModelBox(bone17_r3, 65, 109, 0.5F, 21.7019F, 1.386F, 1, 1, 2, -0.2F, false));

		bone18_r3 = new ModelRenderer(this);
		bone18_r3.setRotationPoint(-0.4F, -16.313F, -8.8274F);
		bone11.addChild(bone18_r3);
		setRotationAngle(bone18_r3, 0.0873F, 0.0F, 0.0F);
		bone18_r3.cubeList.add(new ModelBox(bone18_r3, 65, 109, -1.5F, 21.7019F, 1.386F, 1, 1, 2, -0.2F, false));

		bone16_r3 = new ModelRenderer(this);
		bone16_r3.setRotationPoint(0.4F, -8.3434F, -8.1301F);
		bone11.addChild(bone16_r3);
		setRotationAngle(bone16_r3, 0.0873F, 0.0F, 0.0F);
		bone16_r3.cubeList.add(new ModelBox(bone16_r3, 65, 109, 0.5F, 13.7019F, 1.386F, 1, 1, 2, -0.2F, false));

		bone15_r3 = new ModelRenderer(this);
		bone15_r3.setRotationPoint(-0.4F, -8.3434F, -8.1301F);
		bone11.addChild(bone15_r3);
		setRotationAngle(bone15_r3, 0.0873F, 0.0F, 0.0F);
		bone15_r3.cubeList.add(new ModelBox(bone15_r3, 66, 110, -1.0F, 13.7019F, 0.886F, 2, 1, 1, -0.2F, false));

		bone17_r4 = new ModelRenderer(this);
		bone17_r4.setRotationPoint(-0.4F, -8.4131F, -7.3331F);
		bone11.addChild(bone17_r4);
		setRotationAngle(bone17_r4, 0.0873F, 0.0F, 0.0F);
		bone17_r4.cubeList.add(new ModelBox(bone17_r4, 65, 109, -1.5F, 13.7019F, 1.386F, 1, 1, 2, -0.2F, false));

		gun34_r5 = new ModelRenderer(this);
		gun34_r5.setRotationPoint(1.6279F, -1.3223F, 0.0F);
		bone11.addChild(gun34_r5);
		setRotationAngle(gun34_r5, -0.0262F, 0.0175F, -1.1781F);
		

		gun34_r5_r1 = new ModelRenderer(this);
		gun34_r5_r1.setRotationPoint(-0.3539F, -1.4176F, -5.9375F);
		gun34_r5.addChild(gun34_r5_r1);
		setRotationAngle(gun34_r5_r1, 0.0336F, 0.0805F, 0.0041F);
		gun34_r5_r1.cubeList.add(new ModelBox(gun34_r5_r1, 136, 137, -0.3689F, -0.1971F, -3.5659F, 2, 2, 8, 0.0F, false));

		gun33_r2 = new ModelRenderer(this);
		gun33_r2.setRotationPoint(0.9886F, -0.2184F, 0.0274F);
		bone11.addChild(gun33_r2);
		setRotationAngle(gun33_r2, -0.0192F, 0.0262F, -0.7854F);
		

		gun33_r2_r1 = new ModelRenderer(this);
		gun33_r2_r1.setRotationPoint(0.3635F, -1.4928F, -5.9409F);
		gun33_r2.addChild(gun33_r2_r1);
		setRotationAngle(gun33_r2_r1, 0.0618F, 0.0615F, 0.0047F);
		gun33_r2_r1.cubeList.add(new ModelBox(gun33_r2_r1, 33, 142, -0.6513F, -0.2193F, -3.5628F, 1, 2, 8, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard.addChild(bone21);
		setRotationAngle(bone21, -0.1047F, 0.0F, 0.0F);
		

		gun35_r4 = new ModelRenderer(this);
		gun35_r4.setRotationPoint(-1.6279F, -1.3223F, 0.0F);
		bone21.addChild(gun35_r4);
		setRotationAngle(gun35_r4, -0.0262F, -0.0175F, 1.1781F);
		

		gun35_r4_r1 = new ModelRenderer(this);
		gun35_r4_r1.setRotationPoint(0.3539F, -1.4176F, -5.9375F);
		gun35_r4.addChild(gun35_r4_r1);
		setRotationAngle(gun35_r4_r1, 0.0336F, -0.0805F, -0.0041F);
		gun35_r4_r1.cubeList.add(new ModelBox(gun35_r4_r1, 135, 115, -1.6311F, -0.1971F, -3.5659F, 2, 2, 8, 0.0F, false));

		gun34_r6 = new ModelRenderer(this);
		gun34_r6.setRotationPoint(-0.9886F, -0.2184F, 0.0274F);
		bone21.addChild(gun34_r6);
		setRotationAngle(gun34_r6, -0.0192F, -0.0262F, 0.7854F);
		

		gun34_r6_r1 = new ModelRenderer(this);
		gun34_r6_r1.setRotationPoint(-0.3635F, -1.4928F, -5.9409F);
		gun34_r6.addChild(gun34_r6_r1);
		setRotationAngle(gun34_r6_r1, 0.0618F, -0.0615F, -0.0047F);
		gun34_r6_r1.cubeList.add(new ModelBox(gun34_r6_r1, 141, 77, -0.3487F, -0.2193F, -3.5628F, 1, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mp5_navy_handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}