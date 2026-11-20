package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class mp5a1hg extends ModelBase {
	private final ModelRenderer mp5_navy_handguard;
	private final ModelRenderer gun34_r3;
	private final ModelRenderer bone10;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer gun35_r2;
	private final ModelRenderer gun35_r2_r1;
	private final ModelRenderer gun34_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun36_r1_r1;
	private final ModelRenderer gun35_r3;
	private final ModelRenderer bone11;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer gun34_r5;
	private final ModelRenderer gun34_r5_r1;
	private final ModelRenderer gun33_r2;
	private final ModelRenderer bone21;
	private final ModelRenderer gun35_r4;
	private final ModelRenderer gun35_r4_r1;
	private final ModelRenderer gun34_r6;

	public mp5a1hg() {
		textureWidth = 280;
		textureHeight = 300;

		mp5_navy_handguard = new ModelRenderer(this);
		mp5_navy_handguard.setRotationPoint(0.0F, 13.0F, 0.0F);
		mp5_navy_handguard.cubeList.add(new ModelBox(mp5_navy_handguard, 111, 48, -3.0F, -26.5F, -39.8F, 3, 2, 17, 0.0F, false));

		gun34_r3 = new ModelRenderer(this);
		gun34_r3.setRotationPoint(-4.6F, -34.4F, -30.2F);
		mp5_navy_handguard.addChild(gun34_r3);
		setRotationAngle(gun34_r3, -0.2618F, 0.0F, 0.0F);
		gun34_r3.cubeList.add(new ModelBox(gun34_r3, 119, 18, 1.5F, 10.1252F, -6.653F, 1, 1, 1, 0.0F, false));
		gun34_r3.cubeList.add(new ModelBox(gun34_r3, 120, 29, 3.7F, 10.1252F, -6.653F, 1, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.2025F, -36.9129F, -30.3F);
		mp5_navy_handguard.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.3054F);
		

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-3.7688F, 11.0057F, -0.0743F);
		bone10.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0436F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 191, 78, -0.5F, -1.0F, -7.5F, 1, 2, 15, 0.002F, false));

		gun35_r2 = new ModelRenderer(this);
		gun35_r2.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone10.addChild(gun35_r2);
		setRotationAngle(gun35_r2, -0.0934F, -0.0475F, -0.469F);
		

		gun35_r2_r1 = new ModelRenderer(this);
		gun35_r2_r1.setRotationPoint(-1.8371F, -0.6708F, -3.7129F);
		gun35_r2.addChild(gun35_r2_r1);
		setRotationAngle(gun35_r2_r1, 0.0625F, 0.0609F, 0.0046F);
		gun35_r2_r1.cubeList.add(new ModelBox(gun35_r2_r1, 109, 58, -6.6486F, 6.2744F, -5.6742F, 1, 2, 2, 0.0F, false));

		gun34_r4 = new ModelRenderer(this);
		gun34_r4.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone10.addChild(gun34_r4);
		setRotationAngle(gun34_r4, -0.1047F, 0.0F, 0.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.7975F, -36.9129F, -30.3F);
		mp5_navy_handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.3054F);
		

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(3.7688F, 11.0057F, -0.0743F);
		bone5.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0F, -0.0436F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 63, 191, -0.5F, -1.0F, -7.5F, 1, 2, 15, 0.002F, false));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone5.addChild(gun36_r1);
		setRotationAngle(gun36_r1, -0.0934F, 0.0475F, 0.469F);
		

		gun36_r1_r1 = new ModelRenderer(this);
		gun36_r1_r1.setRotationPoint(1.8371F, -0.6708F, -3.7129F);
		gun36_r1.addChild(gun36_r1_r1);
		setRotationAngle(gun36_r1_r1, 0.0625F, -0.0609F, -0.0046F);
		gun36_r1_r1.cubeList.add(new ModelBox(gun36_r1_r1, 0, 104, 5.6486F, 6.2744F, -5.6742F, 1, 2, 2, 0.0F, false));

		gun35_r3 = new ModelRenderer(this);
		gun35_r3.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone5.addChild(gun35_r3);
		setRotationAngle(gun35_r3, -0.1047F, 0.0F, 0.0F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard.addChild(bone11);
		setRotationAngle(bone11, -0.1047F, 0.0F, 0.0F);
		

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(0.0F, 7.6847F, 0.0677F);
		bone11.addChild(bone13_r1);
		setRotationAngle(bone13_r1, 0.0611F, 0.0F, 0.0F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 2, 129, -0.1866F, 1.5F, -8.5F, 1, 1, 17, 0.0F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 2, 129, -0.8134F, 1.5F, -8.5F, 1, 1, 17, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(0.0F, -1.5019F, -3.6413F);
		bone11.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.0873F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 2, 129, -1.0F, 10.4003F, -5.6774F, 2, 1, 17, 0.0F, false));

		gun34_r5 = new ModelRenderer(this);
		gun34_r5.setRotationPoint(1.6279F, -1.3223F, 0.0F);
		bone11.addChild(gun34_r5);
		setRotationAngle(gun34_r5, -0.0262F, 0.0175F, -1.1781F);
		

		gun34_r5_r1 = new ModelRenderer(this);
		gun34_r5_r1.setRotationPoint(-0.3933F, -1.4766F, -3.6886F);
		gun34_r5.addChild(gun34_r5_r1);
		setRotationAngle(gun34_r5_r1, 0.0336F, 0.0805F, 0.0041F);
		gun34_r5_r1.cubeList.add(new ModelBox(gun34_r5_r1, 127, 128, -10.4449F, 3.4001F, -5.7125F, 2, 2, 17, 0.0F, false));

		gun33_r2 = new ModelRenderer(this);
		gun33_r2.setRotationPoint(0.9886F, -0.2184F, 0.0274F);
		bone11.addChild(gun33_r2);
		setRotationAngle(gun33_r2, -0.0192F, 0.0262F, -0.7854F);
		

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard.addChild(bone21);
		setRotationAngle(bone21, -0.1047F, 0.0F, 0.0F);
		

		gun35_r4 = new ModelRenderer(this);
		gun35_r4.setRotationPoint(-1.6279F, -1.3223F, 0.0F);
		bone21.addChild(gun35_r4);
		setRotationAngle(gun35_r4, -0.0262F, -0.0175F, 1.1781F);
		

		gun35_r4_r1 = new ModelRenderer(this);
		gun35_r4_r1.setRotationPoint(0.3933F, -1.4766F, -3.6886F);
		gun35_r4.addChild(gun35_r4_r1);
		setRotationAngle(gun35_r4_r1, 0.0336F, -0.0805F, -0.0041F);
		gun35_r4_r1.cubeList.add(new ModelBox(gun35_r4_r1, 126, 107, 8.4449F, 3.4001F, -5.7125F, 2, 2, 17, 0.0F, false));

		gun34_r6 = new ModelRenderer(this);
		gun34_r6.setRotationPoint(-0.9886F, -0.2184F, 0.0274F);
		bone21.addChild(gun34_r6);
		setRotationAngle(gun34_r6, -0.0192F, -0.0262F, 0.7854F);
		
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