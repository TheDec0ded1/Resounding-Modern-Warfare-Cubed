package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class type81grip extends ModelBase {
	private final ModelRenderer grip2;
	private final ModelRenderer gun43;
	private final ModelRenderer gun45;
	private final ModelRenderer gun46;
	private final ModelRenderer gun48;
	private final ModelRenderer gun49;
	private final ModelRenderer gun50;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun51;
	private final ModelRenderer gun52;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun53;
	private final ModelRenderer gun54;
	private final ModelRenderer gun55;
	private final ModelRenderer gun58;
	private final ModelRenderer gun60;
	private final ModelRenderer gun61;
	private final ModelRenderer gun63;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun64;
	private final ModelRenderer gun65;
	private final ModelRenderer gun66;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun67;

	public type81grip() {
		textureWidth = 200;
		textureHeight = 200;

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-3.6F, -28.8F, -5.0F);
		grip2.addChild(gun43);
		

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-0.4F, -28.8F, -5.0F);
		grip2.addChild(gun45);
		

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-0.4F, -28.8F, -6.5F);
		grip2.addChild(gun46);
		setRotationAngle(gun46, 0.4461F, 0.0F, 0.0F);
		

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-3.6F, -28.8F, -6.5F);
		grip2.addChild(gun48);
		setRotationAngle(gun48, 0.4461F, 0.0F, 0.0F);
		

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-3.6F, -29.8F, -6.5F);
		grip2.addChild(gun49);
		

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-0.4F, -27.5F, -5.9F);
		grip2.addChild(gun50);
		setRotationAngle(gun50, 0.481F, 0.0F, 0.0F);
		

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(0.4F, 26.1607F, 1.21F);
		gun50.addChild(gun33_r1);
		setRotationAngle(gun33_r1, -0.3491F, 0.0F, 0.0F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 20, 19, -0.399F, -25.1808F, -8.676F, 1, 11, 5, 0.0F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-0.4F, -29.8F, -6.5F);
		grip2.addChild(gun51);
		

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.6F, -27.5F, -5.9F);
		grip2.addChild(gun52);
		setRotationAngle(gun52, 0.481F, 0.0F, 0.0F);
		

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(3.6F, 26.1607F, 1.21F);
		gun52.addChild(gun32_r1);
		setRotationAngle(gun32_r1, -0.3491F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 20, 0, -3.601F, -25.1808F, -8.676F, 1, 11, 5, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip2.addChild(gun53);
		setRotationAngle(gun53, -2.1564F, 0.0F, 0.0F);
		gun53.cubeList.add(new ModelBox(gun53, 69, 0, -0.002F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip2.addChild(gun54);
		gun54.cubeList.add(new ModelBox(gun54, 79, 67, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip2.addChild(gun55);
		setRotationAngle(gun55, 1.2269F, 0.0F, 0.0F);
		gun55.cubeList.add(new ModelBox(gun55, 79, 45, -0.001F, 0.7F, 0.3F, 4, 2, 1, 0.0F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip2.addChild(gun58);
		gun58.cubeList.add(new ModelBox(gun58, 17, 54, 0.001F, 0.0F, -0.001F, 4, 4, 7, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-3.5F, -18.8F, 4.2F);
		grip2.addChild(gun60);
		setRotationAngle(gun60, -0.6692F, 0.0F, 0.0F);
		

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip2.addChild(gun61);
		setRotationAngle(gun61, 2.491F, 0.0F, 0.0F);
		

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip2.addChild(gun63);
		setRotationAngle(gun63, 0.481F, 0.0F, 0.0F);
		

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(3.5F, 26.9033F, -3.8499F);
		gun63.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.3491F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 40, -3.5F, -27.1808F, -4.276F, 4, 12, 1, 0.0F, false));

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip2.addChild(gun64);
		

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip2.addChild(gun65);
		setRotationAngle(gun65, -2.5281F, 0.0F, 0.0F);
		gun65.cubeList.add(new ModelBox(gun65, 47, 35, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip2.addChild(gun66);
		setRotationAngle(gun66, 0.481F, 0.0F, 0.0F);
		

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(3.5F, 25.1607F, 1.31F);
		gun66.addChild(gun4_r1);
		setRotationAngle(gun4_r1, -0.3491F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 4, 4, -3.5F, -14.1808F, -9.776F, 4, 1, 1, 0.0F, false));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 0, 0, -3.5F, -25.1808F, -8.776F, 4, 12, 5, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip2.addChild(gun67);
		gun67.cubeList.add(new ModelBox(gun67, 113, 16, 0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F, false));
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