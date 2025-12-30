package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK400Grip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer gun16;
	private final ModelRenderer gun40_r2;
	private final ModelRenderer gun17;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun43;
	private final ModelRenderer gun45;
	private final ModelRenderer gun46;
	private final ModelRenderer gun48;
	private final ModelRenderer gun49;
	private final ModelRenderer gun50;
	private final ModelRenderer gun11;
	private final ModelRenderer bone12;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer selector;
	private final ModelRenderer gun104;
	private final ModelRenderer gun105;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r1;

	public AK400Grip() {
		textureWidth = 416;
		textureHeight = 416;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip.addChild(gun16);
		setRotationAngle(gun16, 0.4067F, 0.0F, 0.0F);
		

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(4.0F, 0.0F, 1.0F);
		gun16.addChild(gun40_r2);
		setRotationAngle(gun40_r2, -0.0524F, 0.0F, 0.0F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 37, 370, -4.0F, 0.0F, -1.0F, 4, 7, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.5F, -27.7F, -1.5F);
		grip.addChild(gun17);
		setRotationAngle(gun17, 0.7041F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 378, 187, 0.001F, 1.0F, 0.0F, 4, 4, 1, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-0.4F, -27.5F, -5.9F);
		grip.addChild(gun3);
		setRotationAngle(gun3, 0.481F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 94, 276, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.6F, -27.5F, -5.9F);
		grip.addChild(gun4);
		setRotationAngle(gun4, 0.481F, 0.0F, 0.0F);
		gun4.cubeList.add(new ModelBox(gun4, 185, 368, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip.addChild(gun5);
		setRotationAngle(gun5, -2.1564F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 378, 59, 0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 155, 385, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-1.499F, -25.2756F, -14.3126F);
		grip.addChild(gun8);
		setRotationAngle(gun8, -1.9635F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 377, 238, -2.0F, -3.0272F, -1.2935F, 4, 6, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip.addChild(gun9);
		setRotationAngle(gun9, -1.309F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 377, 246, 0.001F, -1.2F, -0.1F, 4, 6, 1, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip.addChild(gun43);
		gun43.cubeList.add(new ModelBox(gun43, 275, 357, 0.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip.addChild(gun45);
		setRotationAngle(gun45, 2.491F, 0.0F, 0.0F);
		gun45.cubeList.add(new ModelBox(gun45, 259, 377, 0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip.addChild(gun46);
		setRotationAngle(gun46, 0.481F, 0.0F, 0.0F);
		gun46.cubeList.add(new ModelBox(gun46, 382, 264, -0.001F, 1.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip.addChild(gun48);
		gun48.cubeList.add(new ModelBox(gun48, 323, 137, 0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip.addChild(gun49);
		setRotationAngle(gun49, -2.5281F, 0.0F, 0.0F);
		gun49.cubeList.add(new ModelBox(gun49, 266, 206, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip.addChild(gun50);
		setRotationAngle(gun50, 0.481F, 0.0F, 0.0F);
		gun50.cubeList.add(new ModelBox(gun50, 114, 218, 0.002F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));
		gun50.cubeList.add(new ModelBox(gun50, 134, 209, -0.498F, -1.5F, 0.25F, 5, 1, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip.addChild(gun11);
		gun11.cubeList.add(new ModelBox(gun11, 305, 230, 0.001F, 0.0F, -0.001F, 4, 1, 9, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 9.0F, 0.0F);
		grip.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 397, 317, -0.35F, -39.8F, -18.001F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 391, 284, -0.349F, -39.8F, -17.5F, 1, 1, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 397, 320, -3.6F, -37.7F, -17.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 397, 336, -0.4F, -37.7F, -17.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 377, 320, -3.5F, -41.2F, -18.0F, 4, 5, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 293, 27, -3.499F, -41.2F, -17.5F, 4, 5, 2, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-1.5F, -36.2305F, -16.8824F);
		bone12.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 1.1345F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 77, 384, -2.0F, -1.0F, -0.5F, 4, 2, 1, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.2182F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 166, 385, -3.0F, -39.0F, -8.9F, 3, 3, 1, 0.0F, false));

		selector = new ModelRenderer(this);
		selector.setRotationPoint(-4.0F, -33.2F, -5.2F);
		grip.addChild(selector);
		

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(3.65F, 2.1F, -12.3F);
		selector.addChild(gun104);
		gun104.cubeList.add(new ModelBox(gun104, 329, 392, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(3.65F, 2.1F, -12.8F);
		selector.addChild(gun105);
		gun105.cubeList.add(new ModelBox(gun105, 398, 308, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(0.1F, -1.6F, -4.8F);
		selector.addChild(gun12);
		setRotationAngle(gun12, -1.2641F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 255, 383, -0.001F, 0.0302F, 0.0953F, 1, 9, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(0.1F, 0.2F, 0.2F);
		selector.addChild(gun13);
		setRotationAngle(gun13, -2.9671F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 349, 35, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(0.0F, 0.0F, 0.0F);
		selector.addChild(gun24);
		setRotationAngle(gun24, -2.9496F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 359, 255, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(0.1F, -1.6F, -0.8F);
		selector.addChild(gun25);
		setRotationAngle(gun25, -1.309F, 0.0F, 0.0F);
		gun25.cubeList.add(new ModelBox(gun25, 306, 339, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(0.0F, -1.4F, -1.0F);
		selector.addChild(gun26);
		setRotationAngle(gun26, -1.3384F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 143, 357, -0.001F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(0.0F, -1.6F, -4.8F);
		selector.addChild(gun27);
		setRotationAngle(gun27, -1.2641F, 0.0F, 0.0F);
		gun27.cubeList.add(new ModelBox(gun27, 180, 391, 0.0F, 0.0302F, 0.096F, 1, 4, 1, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(0.1F, -1.2F, -4.8F);
		selector.addChild(gun28);
		setRotationAngle(gun28, -1.2641F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 72, 390, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(0.0F, -1.6F, -4.8F);
		selector.addChild(gun29);
		setRotationAngle(gun29, -0.5577F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 123, 389, -0.002F, 0.0848F, 0.0529F, 1, 1, 2, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-0.1F, -1.2F, -1.2F);
		selector.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 210, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-0.1F, -1.4F, -1.0F);
		selector.addChild(gun31);
		gun31.cubeList.add(new ModelBox(gun31, 398, 311, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-0.1F, -1.2F, -0.8F);
		selector.addChild(gun32);
		gun32.cubeList.add(new ModelBox(gun32, 336, 398, 0.002F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-0.1F, -1.0F, -1.0F);
		selector.addChild(gun33);
		gun33.cubeList.add(new ModelBox(gun33, 398, 385, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(0.1F, -1.6F, -0.8F);
		selector.addChild(gun34);
		gun34.cubeList.add(new ModelBox(gun34, 398, 388, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(0.1F, -1.2F, -0.5F);
		selector.addChild(gun35);
		gun35.cubeList.add(new ModelBox(gun35, 398, 391, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(0.1F, -0.8F, -0.8F);
		selector.addChild(gun36);
		gun36.cubeList.add(new ModelBox(gun36, 396, 398, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(4.0F, 33.2F, 5.2F);
		selector.addChild(bone13);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.9F, -31.5236F, -8.5277F);
		bone13.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.8727F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 340, 137, -1.0F, -3.0F, -2.0F, 1, 3, 3, 0.0F, false));
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