package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400GripLate extends ModelBase {
	private final ModelRenderer gripM;
	private final ModelRenderer gun51;
	private final ModelRenderer gun40_r3;
	private final ModelRenderer gun52;
	private final ModelRenderer gun63;
	private final ModelRenderer gun64;
	private final ModelRenderer gun65;
	private final ModelRenderer gun66;
	private final ModelRenderer gun68;
	private final ModelRenderer gun69;
	private final ModelRenderer gun70;
	private final ModelRenderer gun72;
	private final ModelRenderer gun73;
	private final ModelRenderer gun74;
	private final ModelRenderer gun75;
	private final ModelRenderer gun76;
	private final ModelRenderer gun86;
	private final ModelRenderer bone14;
	private final ModelRenderer gun26_r2;
	private final ModelRenderer gun28_r2;
	private final ModelRenderer selector2;
	private final ModelRenderer gun88;
	private final ModelRenderer gun89;
	private final ModelRenderer gun90;
	private final ModelRenderer gun91;
	private final ModelRenderer gun92;
	private final ModelRenderer gun93;
	private final ModelRenderer gun94;
	private final ModelRenderer gun95;
	private final ModelRenderer gun96;
	private final ModelRenderer gun97;
	private final ModelRenderer gun98;
	private final ModelRenderer gun102;
	private final ModelRenderer gun114;
	private final ModelRenderer gun115;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public AK400GripLate() {
		textureWidth = 416;
		textureHeight = 416;

		gripM = new ModelRenderer(this);
		gripM.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-3.5F, -24.2F, 1.5F);
		gripM.addChild(gun51);
		setRotationAngle(gun51, 0.4067F, 0.0F, 0.0F);
		

		gun40_r3 = new ModelRenderer(this);
		gun40_r3.setRotationPoint(4.0F, 0.0F, 1.0F);
		gun51.addChild(gun40_r3);
		setRotationAngle(gun40_r3, -0.0524F, 0.0F, 0.0F);
		gun40_r3.cubeList.add(new ModelBox(gun40_r3, 374, 140, -4.0F, 0.0F, -1.0F, 4, 7, 1, 0.0F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.5F, -27.7F, -1.5F);
		gripM.addChild(gun52);
		setRotationAngle(gun52, 0.7041F, 0.0F, 0.0F);
		gun52.cubeList.add(new ModelBox(gun52, 324, 378, 0.001F, 1.0F, 0.0F, 4, 4, 1, 0.0F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-0.4F, -27.5F, -5.9F);
		gripM.addChild(gun63);
		setRotationAngle(gun63, 0.481F, 0.0F, 0.0F);
		gun63.cubeList.add(new ModelBox(gun63, 298, 368, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-3.6F, -27.5F, -5.9F);
		gripM.addChild(gun64);
		setRotationAngle(gun64, 0.481F, 0.0F, 0.0F);
		gun64.cubeList.add(new ModelBox(gun64, 311, 368, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.5F, -29.2F, 0.67F);
		gripM.addChild(gun65);
		setRotationAngle(gun65, -2.1564F, 0.0F, 0.0F);
		gun65.cubeList.add(new ModelBox(gun65, 335, 378, 0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-3.5F, -30.0F, -0.4F);
		gripM.addChild(gun66);
		gun66.cubeList.add(new ModelBox(gun66, 265, 385, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-1.499F, -25.2756F, -14.3126F);
		gripM.addChild(gun68);
		setRotationAngle(gun68, -1.9635F, 0.0F, 0.0F);
		gun68.cubeList.add(new ModelBox(gun68, 272, 377, -2.0F, -3.0272F, -1.2935F, 4, 6, 1, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-3.5F, -26.5F, -7.0F);
		gripM.addChild(gun69);
		setRotationAngle(gun69, -1.309F, 0.0F, 0.0F);
		gun69.cubeList.add(new ModelBox(gun69, 283, 377, 0.001F, -1.2F, -0.1F, 4, 6, 1, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-3.5F, -30.5F, -7.0F);
		gripM.addChild(gun70);
		gun70.cubeList.add(new ModelBox(gun70, 359, 267, 0.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-3.5F, -15.5F, 3.0F);
		gripM.addChild(gun72);
		setRotationAngle(gun72, 2.491F, 0.0F, 0.0F);
		gun72.cubeList.add(new ModelBox(gun72, 377, 314, 0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-3.5F, -28.5F, -1.5F);
		gripM.addChild(gun73);
		setRotationAngle(gun73, 0.481F, 0.0F, 0.0F);
		gun73.cubeList.add(new ModelBox(gun73, 382, 279, -0.001F, 1.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.5F, -17.5F, -1.0F);
		gripM.addChild(gun74);
		gun74.cubeList.add(new ModelBox(gun74, 325, 20, 0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-3.5F, -30.0F, 2.0F);
		gripM.addChild(gun75);
		setRotationAngle(gun75, -2.5281F, 0.0F, 0.0F);
		gun75.cubeList.add(new ModelBox(gun75, 281, 206, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-3.5F, -26.5F, -6.0F);
		gripM.addChild(gun76);
		setRotationAngle(gun76, 0.481F, 0.0F, 0.0F);
		gun76.cubeList.add(new ModelBox(gun76, 171, 242, 0.002F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));
		gun76.cubeList.add(new ModelBox(gun76, 147, 209, -0.498F, -1.5F, 0.25F, 5, 1, 1, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-3.5F, -31.0F, -7.0F);
		gripM.addChild(gun86);
		gun86.cubeList.add(new ModelBox(gun86, 200, 356, 0.001F, 0.0F, -0.001F, 4, 1, 9, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 9.0F, 0.0F);
		gripM.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 34, 399, -0.35F, -39.8F, -18.001F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 363, 392, -0.349F, -39.8F, -17.5F, 1, 1, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 119, 399, -3.6F, -37.7F, -17.5F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 124, 399, -0.4F, -37.7F, -17.5F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 377, 337, -3.5F, -41.2F, -18.0F, 4, 5, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 11, 369, -3.499F, -41.2F, -17.5F, 4, 5, 2, 0.0F, false));

		gun26_r2 = new ModelRenderer(this);
		gun26_r2.setRotationPoint(-1.5F, -36.2305F, -16.8824F);
		bone14.addChild(gun26_r2);
		setRotationAngle(gun26_r2, 1.1345F, 0.0F, 0.0F);
		gun26_r2.cubeList.add(new ModelBox(gun26_r2, 88, 384, -2.0F, -1.0F, -0.5F, 4, 2, 1, 0.0F, false));

		gun28_r2 = new ModelRenderer(this);
		gun28_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(gun28_r2);
		setRotationAngle(gun28_r2, 0.2182F, 0.0F, 0.0F);
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 276, 385, -3.0F, -39.0F, -8.9F, 3, 3, 1, 0.0F, false));

		selector2 = new ModelRenderer(this);
		selector2.setRotationPoint(-4.0F, -33.2F, -5.2F);
		gripM.addChild(selector2);
		

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(3.65F, 2.1F, -12.3F);
		selector2.addChild(gun88);
		gun88.cubeList.add(new ModelBox(gun88, 370, 392, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(3.65F, 2.1F, -12.8F);
		selector2.addChild(gun89);
		gun89.cubeList.add(new ModelBox(gun89, 129, 399, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(0.1F, -1.6F, -4.8F);
		selector2.addChild(gun90);
		setRotationAngle(gun90, -1.2641F, 0.0F, 0.0F);
		gun90.cubeList.add(new ModelBox(gun90, 260, 383, -0.001F, 0.0302F, 0.0953F, 1, 9, 1, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(0.1F, 0.2F, 0.2F);
		selector2.addChild(gun91);
		setRotationAngle(gun91, -2.9671F, 0.0F, 0.0F);
		gun91.cubeList.add(new ModelBox(gun91, 347, 164, 0.0F, 0.0F, -0.6F, 1, 1, 14, 0.0F, false));
		gun91.cubeList.add(new ModelBox(gun91, 377, 392, 0.0F, 0.0F, -2.2F, 1, 1, 2, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(0.0F, 0.0F, 0.0F);
		selector2.addChild(gun92);
		setRotationAngle(gun92, -2.9496F, 0.0F, 0.0F);
		gun92.cubeList.add(new ModelBox(gun92, 359, 279, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(0.1F, -1.6F, -0.8F);
		selector2.addChild(gun93);
		setRotationAngle(gun93, -1.309F, 0.0F, 0.0F);
		gun93.cubeList.add(new ModelBox(gun93, 180, 379, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(0.0F, -1.4F, -1.0F);
		selector2.addChild(gun94);
		setRotationAngle(gun94, -1.3384F, 0.0F, 0.0F);
		gun94.cubeList.add(new ModelBox(gun94, 298, 357, -0.001F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(0.0F, -1.6F, -4.8F);
		selector2.addChild(gun95);
		setRotationAngle(gun95, -1.2641F, 0.0F, 0.0F);
		gun95.cubeList.add(new ModelBox(gun95, 36, 393, 0.0F, 0.0302F, 0.096F, 1, 4, 1, 0.0F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(0.1F, -1.2F, -4.8F);
		selector2.addChild(gun96);
		setRotationAngle(gun96, -1.2641F, 0.0F, 0.0F);
		gun96.cubeList.add(new ModelBox(gun96, 288, 390, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(0.0F, -1.6F, -4.8F);
		selector2.addChild(gun97);
		setRotationAngle(gun97, -0.5577F, 0.0F, 0.0F);
		gun97.cubeList.add(new ModelBox(gun97, 389, 128, -0.002F, 0.0848F, 0.0529F, 1, 1, 2, 0.0F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-0.1F, -1.2F, -1.2F);
		selector2.addChild(gun98);
		gun98.cubeList.add(new ModelBox(gun98, 160, 209, 0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-0.1F, -1.4F, -1.0F);
		selector2.addChild(gun102);
		gun102.cubeList.add(new ModelBox(gun102, 94, 292, -0.001F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-0.1F, -1.2F, -0.8F);
		selector2.addChild(gun114);
		gun114.cubeList.add(new ModelBox(gun114, 324, 315, 0.002F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(-0.1F, -1.0F, -1.0F);
		selector2.addChild(gun115);
		gun115.cubeList.add(new ModelBox(gun115, 332, 238, 0.001F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.1F, -1.6F, -0.8F);
		selector2.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 285, 385, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		selector2.addChild(bone16);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.9F, 1.5F, -0.5F);
		bone16.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 396, 98, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.8F, 1.0F, -0.5F);
		bone16.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 389, 167, -1.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 389, 163, -4.8F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripM.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}