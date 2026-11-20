package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PP19BizonMag1 extends ModelBase {
	private final ModelRenderer magazine2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone15_r1;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone13_r2;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone12_r2;
	private final ModelRenderer bone11_r2;
	private final ModelRenderer bone12_r3;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone13_r3;
	private final ModelRenderer bone11_r3;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone12_r4;
	private final ModelRenderer bone10_r2;
	private final ModelRenderer bone14_r2;
	private final ModelRenderer bone12_r5;
	private final ModelRenderer bone10_r3;
	private final ModelRenderer bone12_r6;
	private final ModelRenderer bone13_r4;
	private final ModelRenderer bone12_r7;
	private final ModelRenderer bone11_r4;
	private final ModelRenderer bone11_r5;
	private final ModelRenderer bone10_r4;
	private final ModelRenderer bone11_r6;
	private final ModelRenderer bone13_r5;
	private final ModelRenderer bone12_r8;
	private final ModelRenderer bone10_r5;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone11_r7;
	private final ModelRenderer bone9_r3;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone8_r2;
	private final ModelRenderer bone12;
	private final ModelRenderer bone9_r2;

	public PP19BizonMag1() {
		textureWidth = 512;
		textureHeight = 256;

		magazine2 = new ModelRenderer(this);
		magazine2.setRotationPoint(-1.4F, -9.2F, -50.2F);
		magazine2.cubeList.add(new ModelBox(magazine2, 141, 25, 0.4F, -0.8F, -0.1F, 1, 2, 1, -0.3F, true));
		magazine2.cubeList.add(new ModelBox(magazine2, 141, 25, -1.6F, -0.8F, -0.1F, 1, 2, 1, -0.3F, true));
		magazine2.cubeList.add(new ModelBox(magazine2, 144, 15, 0.4F, -0.9F, -0.9F, 1, 1, 2, -0.3F, true));
		magazine2.cubeList.add(new ModelBox(magazine2, 144, 15, -1.6F, -0.9F, -0.9F, 1, 1, 2, -0.3F, true));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.1F, -6.3927F, 24.6326F);
		magazine2.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 137, 30, -1.5F, 5.2389F, 0.8028F, 3, 4, 5, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 140, 33, -1.5F, 7.3389F, 5.6028F, 3, 4, 2, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 116, 9, -1.25F, 7.2389F, -25.1972F, 2, 2, 26, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 116, 9, 0.25F, 7.2389F, -25.1972F, 1, 2, 26, 0.1F, false));
		bone5.cubeList.add(new ModelBox(bone5, 139, 32, -1.25F, 7.0139F, -26.1972F, 2, 1, 3, 0.2F, false));
		bone5.cubeList.add(new ModelBox(bone5, 139, 32, 0.25F, 7.0139F, -26.1972F, 1, 1, 3, 0.2F, false));

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(-2.4504F, 9.1587F, -11.6972F);
		bone5.addChild(bone15_r1);
		setRotationAngle(bone15_r1, 0.0F, 0.0F, -0.3927F);
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 139, 32, 0.6215F, -1.5835F, -14.5F, 1, 1, 3, 0.2F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(-1.8963F, 8.6047F, -11.6972F);
		bone5.addChild(bone13_r1);
		setRotationAngle(bone13_r1, 0.0F, 0.0F, -1.1781F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 139, 32, -0.3647F, -1.0629F, -14.5F, 1, 1, 3, 0.2F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(1.9577F, 10.7733F, -14.1972F);
		bone5.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.0F, 0.0F, 1.5708F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 139, 32, -1.9302F, -1.1215F, -12.0F, 1, 1, 3, 0.2F, false));

		bone13_r2 = new ModelRenderer(this);
		bone13_r2.setRotationPoint(-1.9577F, 7.9129F, -11.6972F);
		bone5.addChild(bone13_r2);
		setRotationAngle(bone13_r2, 0.0F, 0.0F, -1.5708F);
		bone13_r2.cubeList.add(new ModelBox(bone13_r2, 139, 32, -1.9302F, -1.1215F, -14.5F, 1, 1, 3, 0.2F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(-1.9577F, 8.4129F, -11.6972F);
		bone5.addChild(bone12_r1);
		setRotationAngle(bone12_r1, 0.0F, 0.0F, -1.5708F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 139, 32, -2.9302F, -1.1215F, -14.5F, 2, 1, 3, 0.2F, false));

		bone12_r2 = new ModelRenderer(this);
		bone12_r2.setRotationPoint(-3.6802F, 9.0507F, -11.6972F);
		bone5.addChild(bone12_r2);
		setRotationAngle(bone12_r2, 0.0F, 0.0F, -3.1416F);
		bone12_r2.cubeList.add(new ModelBox(bone12_r2, 139, 32, -4.9302F, -4.1215F, -14.5F, 1, 1, 3, 0.2F, false));

		bone11_r2 = new ModelRenderer(this);
		bone11_r2.setRotationPoint(-1.1802F, 9.0507F, -11.6972F);
		bone5.addChild(bone11_r2);
		setRotationAngle(bone11_r2, 0.0F, 0.0F, -3.1416F);
		bone11_r2.cubeList.add(new ModelBox(bone11_r2, 139, 32, -1.9302F, -4.1215F, -14.5F, 2, 1, 3, 0.2F, false));

		bone12_r3 = new ModelRenderer(this);
		bone12_r3.setRotationPoint(-1.4884F, 11.9894F, -11.6972F);
		bone5.addChild(bone12_r3);
		setRotationAngle(bone12_r3, 0.0F, 0.0F, -2.7489F);
		bone12_r3.cubeList.add(new ModelBox(bone12_r3, 139, 32, -0.3647F, -1.0629F, -14.5F, 1, 1, 3, 0.2F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(-0.9344F, 12.5435F, -11.6972F);
		bone5.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0F, 0.0F, -1.9635F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 139, 32, 0.6215F, -1.5835F, -14.5F, 1, 1, 3, 0.2F, false));

		bone13_r3 = new ModelRenderer(this);
		bone13_r3.setRotationPoint(2.4504F, 11.0275F, -14.1972F);
		bone5.addChild(bone13_r3);
		setRotationAngle(bone13_r3, 0.0F, 0.0F, 2.7489F);
		bone13_r3.cubeList.add(new ModelBox(bone13_r3, 139, 32, 0.6215F, -1.5835F, -12.0F, 1, 1, 3, 0.2F, false));

		bone11_r3 = new ModelRenderer(this);
		bone11_r3.setRotationPoint(1.8963F, 11.5815F, -14.1972F);
		bone5.addChild(bone11_r3);
		setRotationAngle(bone11_r3, 0.0F, 0.0F, 1.9635F);
		bone11_r3.cubeList.add(new ModelBox(bone11_r3, 139, 32, -0.3647F, -1.0629F, -12.0F, 1, 1, 3, 0.2F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.9577F, 11.2733F, -14.1972F);
		bone5.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, 1.5708F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 139, 32, -1.9302F, -1.1215F, -12.0F, 2, 1, 3, 0.2F, false));

		bone12_r4 = new ModelRenderer(this);
		bone12_r4.setRotationPoint(1.9819F, 7.3404F, -14.1972F);
		bone5.addChild(bone12_r4);
		setRotationAngle(bone12_r4, 0.0F, 0.0F, 1.1781F);
		bone12_r4.cubeList.add(new ModelBox(bone12_r4, 139, 32, 0.5F, -0.5F, -12.0F, 1, 1, 3, 0.2F, false));

		bone10_r2 = new ModelRenderer(this);
		bone10_r2.setRotationPoint(2.7527F, 8.1112F, -14.1972F);
		bone5.addChild(bone10_r2);
		setRotationAngle(bone10_r2, 0.0F, 0.0F, 0.3927F);
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 139, 32, -1.5F, -0.5F, -12.0F, 1, 1, 3, 0.2F, false));

		bone14_r2 = new ModelRenderer(this);
		bone14_r2.setRotationPoint(-2.2963F, 9.353F, -8.6972F);
		bone5.addChild(bone14_r2);
		setRotationAngle(bone14_r2, 0.0F, 0.0F, -0.3927F);
		bone14_r2.cubeList.add(new ModelBox(bone14_r2, 111, 4, 0.6215F, -1.5835F, -16.5F, 1, 2, 31, 0.1F, false));

		bone12_r5 = new ModelRenderer(this);
		bone12_r5.setRotationPoint(-1.6657F, 8.7225F, -8.6972F);
		bone5.addChild(bone12_r5);
		setRotationAngle(bone12_r5, 0.0F, 0.0F, -1.1781F);
		bone12_r5.cubeList.add(new ModelBox(bone12_r5, 111, 4, -0.3647F, -1.0629F, -16.5F, 1, 2, 31, 0.1F, false));

		bone10_r3 = new ModelRenderer(this);
		bone10_r3.setRotationPoint(1.6963F, 10.737F, -11.1972F);
		bone5.addChild(bone10_r3);
		setRotationAngle(bone10_r3, 0.0F, 0.0F, 1.5708F);
		bone10_r3.cubeList.add(new ModelBox(bone10_r3, 111, 4, -1.9302F, -1.1215F, -14.0F, 1, 2, 31, 0.1F, false));

		bone12_r6 = new ModelRenderer(this);
		bone12_r6.setRotationPoint(-1.6963F, 7.8766F, -8.6972F);
		bone5.addChild(bone12_r6);
		setRotationAngle(bone12_r6, 0.0F, 0.0F, -1.5708F);
		bone12_r6.cubeList.add(new ModelBox(bone12_r6, 111, 4, -1.9302F, -1.1215F, -16.5F, 1, 2, 31, 0.1F, false));

		bone13_r4 = new ModelRenderer(this);
		bone13_r4.setRotationPoint(0.4434F, 9.3455F, -33.6972F);
		bone5.addChild(bone13_r4);
		setRotationAngle(bone13_r4, 0.0F, 0.0F, -1.0036F);
		bone13_r4.cubeList.add(new ModelBox(bone13_r4, 141, 34, -3.1F, -0.5F, 7.8F, 5, 1, 1, 0.1F, false));

		bone12_r7 = new ModelRenderer(this);
		bone12_r7.setRotationPoint(-1.435F, 8.1153F, -8.6972F);
		bone5.addChild(bone12_r7);
		setRotationAngle(bone12_r7, 0.0F, 0.0F, -1.5708F);
		bone12_r7.cubeList.add(new ModelBox(bone12_r7, 111, 4, -2.7302F, 0.3785F, -16.5F, 2, 2, 31, 0.1F, false));

		bone11_r4 = new ModelRenderer(this);
		bone11_r4.setRotationPoint(-1.6963F, 8.3766F, -8.6972F);
		bone5.addChild(bone11_r4);
		setRotationAngle(bone11_r4, 0.0F, 0.0F, -1.5708F);
		bone11_r4.cubeList.add(new ModelBox(bone11_r4, 111, 4, -2.9302F, -1.1215F, -16.5F, 2, 2, 31, 0.1F, false));

		bone11_r5 = new ModelRenderer(this);
		bone11_r5.setRotationPoint(-3.6802F, 11.7531F, -8.6972F);
		bone5.addChild(bone11_r5);
		setRotationAngle(bone11_r5, 0.0F, 0.0F, -3.1416F);
		bone11_r5.cubeList.add(new ModelBox(bone11_r5, 111, 4, -4.9302F, -1.1215F, -16.5F, 1, 2, 31, 0.1F, false));

		bone10_r4 = new ModelRenderer(this);
		bone10_r4.setRotationPoint(-1.1802F, 11.7531F, -8.6972F);
		bone5.addChild(bone10_r4);
		setRotationAngle(bone10_r4, 0.0F, 0.0F, -3.1416F);
		bone10_r4.cubeList.add(new ModelBox(bone10_r4, 111, 4, -1.9302F, -1.1215F, -16.5F, 2, 2, 31, 0.1F, false));

		bone11_r6 = new ModelRenderer(this);
		bone11_r6.setRotationPoint(-1.3343F, 11.7225F, -8.6972F);
		bone5.addChild(bone11_r6);
		setRotationAngle(bone11_r6, 0.0F, 0.0F, -2.7489F);
		bone11_r6.cubeList.add(new ModelBox(bone11_r6, 111, 4, -0.3647F, -1.0629F, -16.5F, 1, 2, 31, 0.1F, false));

		bone13_r5 = new ModelRenderer(this);
		bone13_r5.setRotationPoint(-0.7037F, 12.353F, -8.6972F);
		bone5.addChild(bone13_r5);
		setRotationAngle(bone13_r5, 0.0F, 0.0F, -1.9635F);
		bone13_r5.cubeList.add(new ModelBox(bone13_r5, 111, 4, 0.6215F, -1.5835F, -16.5F, 1, 2, 31, 0.1F, false));

		bone12_r8 = new ModelRenderer(this);
		bone12_r8.setRotationPoint(2.2963F, 10.7605F, -11.1972F);
		bone5.addChild(bone12_r8);
		setRotationAngle(bone12_r8, 0.0F, 0.0F, 2.7489F);
		bone12_r8.cubeList.add(new ModelBox(bone12_r8, 111, 4, 0.6215F, -1.5835F, -14.0F, 1, 2, 31, 0.1F, false));

		bone10_r5 = new ModelRenderer(this);
		bone10_r5.setRotationPoint(1.6657F, 11.3911F, -11.1972F);
		bone5.addChild(bone10_r5);
		setRotationAngle(bone10_r5, 0.0F, 0.0F, 1.9635F);
		bone10_r5.cubeList.add(new ModelBox(bone10_r5, 111, 4, -0.3647F, -1.0629F, -14.0F, 1, 2, 31, 0.1F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(1.6963F, 11.237F, -11.1972F);
		bone5.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 1.5708F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 111, 4, -1.9302F, -1.1215F, -14.0F, 2, 2, 31, 0.1F, false));

		bone11_r7 = new ModelRenderer(this);
		bone11_r7.setRotationPoint(1.7513F, 7.4582F, -11.1972F);
		bone5.addChild(bone11_r7);
		setRotationAngle(bone11_r7, 0.0F, 0.0F, 1.1781F);
		bone11_r7.cubeList.add(new ModelBox(bone11_r7, 111, 4, 0.5F, -0.5F, -14.0F, 1, 2, 31, 0.1F, false));

		bone9_r3 = new ModelRenderer(this);
		bone9_r3.setRotationPoint(2.5986F, 8.3055F, -11.1972F);
		bone5.addChild(bone9_r3);
		setRotationAngle(bone9_r3, 0.0F, 0.0F, 0.3927F);
		bone9_r3.cubeList.add(new ModelBox(bone9_r3, 111, 4, -1.5F, -0.5F, -14.0F, 1, 2, 31, 0.1F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.1F, -6.3927F, 24.6326F);
		magazine2.addChild(bone10);
		setRotationAngle(bone10, -0.1745F, 0.0F, 0.0F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.7883F, -1.0512F, 24.4992F);
		magazine2.addChild(bone11);
		setRotationAngle(bone11, -0.349F, 0.0F, 0.0F);
		

		bone8_r2 = new ModelRenderer(this);
		bone8_r2.setRotationPoint(1.6878F, 8.0553F, 2.6342F);
		bone11.addChild(bone8_r2);
		setRotationAngle(bone8_r2, 0.0873F, 0.0F, 0.0F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-1.7883F, 4.555F, 23.3015F);
		magazine2.addChild(bone12);
		setRotationAngle(bone12, -0.48F, 0.0F, 0.0F);
		

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(1.6898F, 2.2617F, 2.1104F);
		bone12.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.1309F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}