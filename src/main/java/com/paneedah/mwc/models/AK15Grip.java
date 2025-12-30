package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK15Grip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer gun1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final ModelRenderer triggerGuard;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun14;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun23;
	private final ModelRenderer gun22;
	private final ModelRenderer gun24;
	private final ModelRenderer gun26;
	private final ModelRenderer gun25;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun30;
	private final ModelRenderer gun29;
	private final ModelRenderer selector;
	private final ModelRenderer gun104;
	private final ModelRenderer gun105;
	private final ModelRenderer gun119;
	private final ModelRenderer gun117;
	private final ModelRenderer gun127;
	private final ModelRenderer gun115;
	private final ModelRenderer gun126;
	private final ModelRenderer gun128;
	private final ModelRenderer gun125;
	private final ModelRenderer gun118;
	private final ModelRenderer gun123;
	private final ModelRenderer gun121;
	private final ModelRenderer gun124;
	private final ModelRenderer gun122;
	private final ModelRenderer gun114;
	private final ModelRenderer gun120;
	private final ModelRenderer gun116;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r1;

	public AK15Grip() {
		textureWidth = 416;
		textureHeight = 416;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 270, 216, 0.001F, 0.0F, -0.001F, 4, 1, 9, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip.addChild(gun3);
		setRotationAngle(gun3, 0.481F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 216, 341, 0.002F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip.addChild(gun4);
		setRotationAngle(gun4, -2.5281F, 0.0F, 0.0F);
		gun4.cubeList.add(new ModelBox(gun4, 160, 116, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 89, 367, 0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip.addChild(gun6);
		setRotationAngle(gun6, 0.481F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 209, 386, -0.001F, 1.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip.addChild(gun7);
		setRotationAngle(gun7, 2.491F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 377, 170, 0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 352, 190, 0.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip.addChild(gun9);
		setRotationAngle(gun9, 1.2269F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 78, 387, 0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 366, 387, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip.addChild(gun11);
		setRotationAngle(gun11, -2.1564F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 179, 252, 0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.6F, -27.5F, -5.9F);
		grip.addChild(gun31);
		setRotationAngle(gun31, 0.481F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 53, 234, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-0.4F, -27.5F, -5.9F);
		grip.addChild(gun32);
		setRotationAngle(gun32, 0.481F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 111, 363, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-3.5F, -27.7F, -1.5F);
		grip.addChild(gun33);
		setRotationAngle(gun33, 0.7041F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 381, 117, 0.001F, 1.0F, 0.0F, 4, 4, 1, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip.addChild(gun34);
		setRotationAngle(gun34, 0.4067F, 0.0F, 0.0F);
		

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(4.0F, 0.0F, 1.0F);
		gun34.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.0524F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 98, 374, -4.0F, 0.0F, -1.0F, 4, 7, 1, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.5F, -25.0F, -4.3F);
		grip.addChild(gun35);
		setRotationAngle(gun35, -0.4856F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 190, 116, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-3.5F, -21.0F, -2.2F);
		grip.addChild(gun36);
		setRotationAngle(gun36, -0.4856F, 0.0F, 0.0F);
		gun36.cubeList.add(new ModelBox(gun36, 203, 116, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

		triggerGuard = new ModelRenderer(this);
		triggerGuard.setRotationPoint(-3.2F, -31.5F, -7.5F);
		grip.addChild(triggerGuard);
		

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(0.0F, 0.0F, 0.0F);
		triggerGuard.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 385, 310, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(2.4F, 0.0F, 0.0F);
		triggerGuard.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 342, 366, 0.001F, 0.0F, -0.001F, 1, 5, 1, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(0.0F, 5.0F, 0.8F);
		triggerGuard.addChild(gun14);
		setRotationAngle(gun14, -2.3423F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 392, 57, -0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(2.4F, 5.0F, 0.8F);
		triggerGuard.addChild(gun15);
		setRotationAngle(gun15, -2.3423F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 399, 165, 0.0F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(2.4F, 4.7F, -7.0F);
		triggerGuard.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 364, 317, 0.001F, -0.001F, 0.0F, 1, 1, 7, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(0.0F, 4.7F, -7.0F);
		triggerGuard.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 360, 42, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(0.0F, -0.3F, -8.0F);
		triggerGuard.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 385, 303, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(2.4F, -0.3F, -8.0F);
		triggerGuard.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 210, 363, 0.001F, 0.0F, -0.001F, 1, 5, 1, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(0.0F, 4.7F, -8.0F);
		triggerGuard.addChild(gun20);
		setRotationAngle(gun20, 0.7436F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 392, 54, -0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(2.4F, 4.7F, -8.0F);
		triggerGuard.addChild(gun21);
		setRotationAngle(gun21, 0.7436F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 399, 162, -0.001F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(0.0F, 5.7F, -7.0F);
		triggerGuard.addChild(gun23);
		setRotationAngle(gun23, 2.4538F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 392, 51, -0.002F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(2.4F, 5.7F, -7.0F);
		triggerGuard.addChild(gun22);
		setRotationAngle(gun22, 2.4538F, 0.0F, 0.0F);
		gun22.cubeList.add(new ModelBox(gun22, 399, 159, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-0.3F, -1.0F, -10.0F);
		triggerGuard.addChild(gun24);
		gun24.cubeList.add(new ModelBox(gun24, 373, 218, 0.001F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-0.3F, 4.0F, -10.5F);
		triggerGuard.addChild(gun26);
		setRotationAngle(gun26, 1.45F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 382, 386, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-0.3F, -1.0F, -10.5F);
		triggerGuard.addChild(gun25);
		gun25.cubeList.add(new ModelBox(gun25, 203, 379, 0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-0.3F, 4.2F, -9.1F);
		triggerGuard.addChild(gun27);
		setRotationAngle(gun27, 1.45F, 0.0F, 0.0F);
		gun27.cubeList.add(new ModelBox(gun27, 386, 340, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(0.2F, 4.0F, -10.3F);
		triggerGuard.addChild(gun28);
		setRotationAngle(gun28, 0.2603F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 156, 391, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(2.8F, 2.5F, -10.0F);
		triggerGuard.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 399, 156, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-0.4F, 2.5F, -10.0F);
		triggerGuard.addChild(gun29);
		gun29.cubeList.add(new ModelBox(gun29, 399, 137, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		selector = new ModelRenderer(this);
		selector.setRotationPoint(-4.0F, -33.2F, -5.2F);
		grip.addChild(selector);
		

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(3.65F, 2.1F, -12.3F);
		selector.addChild(gun104);
		gun104.cubeList.add(new ModelBox(gun104, 263, 392, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(3.65F, 2.1F, -12.8F);
		selector.addChild(gun105);
		gun105.cubeList.add(new ModelBox(gun105, 399, 90, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(0.1F, -1.6F, -4.8F);
		selector.addChild(gun119);
		setRotationAngle(gun119, -1.2641F, 0.0F, 0.0F);
		gun119.cubeList.add(new ModelBox(gun119, 64, 383, -0.001F, 0.0302F, 0.0953F, 1, 9, 1, 0.0F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(0.1F, 0.2F, 0.2F);
		selector.addChild(gun117);
		setRotationAngle(gun117, -2.9671F, 0.0F, 0.0F);
		gun117.cubeList.add(new ModelBox(gun117, 31, 327, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(0.0F, 0.0F, 0.0F);
		selector.addChild(gun127);
		setRotationAngle(gun127, -2.9496F, 0.0F, 0.0F);
		gun127.cubeList.add(new ModelBox(gun127, 345, 305, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(0.1F, -1.6F, -0.8F);
		selector.addChild(gun115);
		setRotationAngle(gun115, -1.309F, 0.0F, 0.0F);
		gun115.cubeList.add(new ModelBox(gun115, 66, 234, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(0.0F, -1.4F, -1.0F);
		selector.addChild(gun126);
		setRotationAngle(gun126, -1.3384F, 0.0F, 0.0F);
		gun126.cubeList.add(new ModelBox(gun126, 59, 383, -0.001F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(0.0F, -1.6F, -4.8F);
		selector.addChild(gun128);
		setRotationAngle(gun128, -1.2641F, 0.0F, 0.0F);
		gun128.cubeList.add(new ModelBox(gun128, 322, 367, 0.0F, 0.0302F, 0.096F, 1, 4, 1, 0.0F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(0.1F, -1.2F, -4.8F);
		selector.addChild(gun125);
		setRotationAngle(gun125, -1.2641F, 0.0F, 0.0F);
		gun125.cubeList.add(new ModelBox(gun125, 106, 367, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(0.0F, -1.6F, -4.8F);
		selector.addChild(gun118);
		setRotationAngle(gun118, -0.5577F, 0.0F, 0.0F);
		gun118.cubeList.add(new ModelBox(gun118, 373, 130, -0.002F, 0.0848F, 0.0529F, 1, 1, 2, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(-0.1F, -1.2F, -1.2F);
		selector.addChild(gun123);
		gun123.cubeList.add(new ModelBox(gun123, 175, 404, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-0.1F, -1.4F, -1.0F);
		selector.addChild(gun121);
		gun121.cubeList.add(new ModelBox(gun121, 35, 399, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-0.1F, -1.2F, -0.8F);
		selector.addChild(gun124);
		gun124.cubeList.add(new ModelBox(gun124, 399, 18, 0.002F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-0.1F, -1.0F, -1.0F);
		selector.addChild(gun122);
		gun122.cubeList.add(new ModelBox(gun122, 22, 399, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(0.1F, -1.6F, -0.8F);
		selector.addChild(gun114);
		gun114.cubeList.add(new ModelBox(gun114, 72, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(0.1F, -1.2F, -0.5F);
		selector.addChild(gun120);
		gun120.cubeList.add(new ModelBox(gun120, 40, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(0.1F, -0.8F, -0.8F);
		selector.addChild(gun116);
		gun116.cubeList.add(new ModelBox(gun116, 45, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(4.0F, 33.2F, 5.2F);
		selector.addChild(bone12);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.9F, -31.5236F, -8.5277F);
		bone12.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.8727F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 328, 382, -1.0F, -3.0F, -2.0F, 1, 3, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}