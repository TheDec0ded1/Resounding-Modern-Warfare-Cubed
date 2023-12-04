package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type562Grip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer gun38;
	private final ModelRenderer gun37;
	private final ModelRenderer gun36;
	private final ModelRenderer gun35;
	private final ModelRenderer gun34;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun33;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun4;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun1;

	public Type562Grip() {
		textureWidth = 200;
		textureHeight = 200;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-3.6F, -28.8F, -5.0F);
		grip.addChild(gun38);
		

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-0.4F, -28.8F, -5.0F);
		grip.addChild(gun37);
		

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.4F, -28.8F, -6.5F);
		grip.addChild(gun36);
		setRotationAngle(gun36, 0.4461F, 0.0F, 0.0F);
		

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.6F, -28.8F, -6.5F);
		grip.addChild(gun35);
		setRotationAngle(gun35, 0.4461F, 0.0F, 0.0F);
		

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.6F, -29.8F, -6.5F);
		grip.addChild(gun34);
		

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-0.4F, -27.5F, -5.9F);
		grip.addChild(gun32);
		setRotationAngle(gun32, 0.481F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 20, 19, 0.001F, 0.0F, 0.0F, 1, 5, 5, 0.0F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(0.4F, 26.1607F, 1.21F);
		gun32.addChild(gun33_r1);
		setRotationAngle(gun33_r1, -0.3491F, 0.0F, 0.0F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 19, 126, -0.399F, -21.1808F, -8.676F, 1, 7, 5, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-0.4F, -29.8F, -6.5F);
		grip.addChild(gun33);
		

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.6F, -27.5F, -5.9F);
		grip.addChild(gun31);
		setRotationAngle(gun31, 0.481F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 20, 0, -0.001F, 0.0F, 0.0F, 1, 5, 5, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(3.6F, 26.1607F, 1.21F);
		gun31.addChild(gun32_r1);
		setRotationAngle(gun32_r1, -0.3491F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 13, 126, -3.601F, -21.1808F, -8.676F, 1, 7, 5, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip.addChild(gun11);
		setRotationAngle(gun11, -2.1564F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 69, 0, -0.002F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 79, 67, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip.addChild(gun9);
		setRotationAngle(gun9, 1.2269F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 79, 45, -0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 17, 54, 0.001F, 0.0F, -0.001F, 4, 4, 7, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -18.8F, 4.2F);
		grip.addChild(gun7);
		setRotationAngle(gun7, -0.6692F, 0.0F, 0.0F);
		

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip.addChild(gun6);
		setRotationAngle(gun6, 2.491F, 0.0F, 0.0F);
		

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip.addChild(gun5);
		setRotationAngle(gun5, 0.481F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 0, 40, 0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(3.5F, 26.9033F, -3.8499F);
		gun5.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.3491F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 40, -3.5F, -23.1808F, -4.276F, 4, 8, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip.addChild(gun4);
		

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip.addChild(gun3);
		setRotationAngle(gun3, -2.5281F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 47, 35, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip.addChild(gun2);
		setRotationAngle(gun2, 0.481F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, 0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(3.5F, 25.1607F, 1.31F);
		gun2.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -0.3491F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 0, 0, -3.5F, -21.1808F, -8.776F, 4, 8, 5, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 113, 16, 0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F, false));
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