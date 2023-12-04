package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class amd63grip2 extends ModelBase {
	private final ModelRenderer grip2;
	private final ModelRenderer gun7;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun35;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun36;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun37;
	private final ModelRenderer gun38;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun43;

	public amd63grip2() {
		textureWidth = 200;
		textureHeight = 200;

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.0F, 23.0F, -45.0F);
		setRotationAngle(grip2, 0.0F, 3.1416F, 0.0F);
		

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip2.addChild(gun7);
		setRotationAngle(gun7, -2.1564F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 69, 0, -0.002F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip2.addChild(gun31);
		gun31.cubeList.add(new ModelBox(gun31, 79, 67, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip2.addChild(gun32);
		setRotationAngle(gun32, 1.2269F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 79, 45, -0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip2.addChild(gun33);
		gun33.cubeList.add(new ModelBox(gun33, 17, 54, 0.001F, 0.0F, -0.001F, 4, 4, 7, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip2.addChild(gun34);
		setRotationAngle(gun34, 2.491F, 0.0F, 0.0F);
		

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(2.001F, 2.051F, -0.2805F);
		gun34.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.7854F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 27, 0, -2.0F, -3.5272F, -0.3214F, 4, 3, 2, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip2.addChild(gun35);
		setRotationAngle(gun35, 0.481F, 0.0F, 0.0F);
		

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(2.0005F, 8.2558F, -2.2152F);
		gun35.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.1745F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 40, -2.0005F, -8.5575F, 1.2618F, 4, 12, 1, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip2.addChild(gun36);
		

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(2.0005F, -2.6561F, -0.1442F);
		gun36.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.1309F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 47, 28, -1.9995F, 2.234F, -2.3812F, 4, 2, 4, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip2.addChild(gun37);
		setRotationAngle(gun37, -2.5281F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 47, 35, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip2.addChild(gun38);
		setRotationAngle(gun38, 0.481F, 0.0F, 0.0F);
		

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(2.0005F, 8.5647F, 2.6995F);
		gun38.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -0.1745F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 0, 0, -2.0005F, -8.8664F, -3.6529F, 4, 12, 5, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip2.addChild(gun43);
		gun43.cubeList.add(new ModelBox(gun43, 113, 16, 0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}