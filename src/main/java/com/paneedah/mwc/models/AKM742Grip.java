package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKM742Grip extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer gun38;
	private final ModelRenderer gun37;
	private final ModelRenderer gun36;
	private final ModelRenderer gun35;
	private final ModelRenderer gun34;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun31;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun1;

	public AKM742Grip() {
		textureWidth = 352;
		textureHeight = 352;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-3.6F, -28.8F, -5.0F);
		grip.addChild(gun38);
		gun38.cubeList.add(new ModelBox(gun38, 154, 335, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-0.4F, -28.8F, -5.0F);
		grip.addChild(gun37);
		gun37.cubeList.add(new ModelBox(gun37, 160, 335, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.4F, -28.8F, -6.5F);
		grip.addChild(gun36);
		setRotationAngle(gun36, 0.4461F, 0.0F, 0.0F);
		gun36.cubeList.add(new ModelBox(gun36, 304, 287, -0.001F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.6F, -28.8F, -6.5F);
		grip.addChild(gun35);
		setRotationAngle(gun35, 0.4461F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 228, 332, 0.001F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.6F, -29.8F, -6.5F);
		grip.addChild(gun34);
		gun34.cubeList.add(new ModelBox(gun34, 262, 324, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-0.4F, -27.5F, -5.9F);
		grip.addChild(gun32);
		setRotationAngle(gun32, 0.481F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 262, 306, 0.001F, 0.0F, 0.0F, 1, 13, 5, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-0.4F, -29.8F, -6.5F);
		grip.addChild(gun33);
		gun33.cubeList.add(new ModelBox(gun33, 278, 324, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.6F, -27.5F, -5.9F);
		grip.addChild(gun31);
		setRotationAngle(gun31, 0.481F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 308, 167, -0.001F, 0.0F, 0.0F, 1, 13, 5, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip.addChild(gun15);
		setRotationAngle(gun15, -2.1564F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 192, 285, -0.002F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 278, 330, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip.addChild(gun17);
		setRotationAngle(gun17, 1.2269F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 12, 312, -0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 306, 98, 0.001F, 0.0F, -0.001F, 4, 4, 7, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.5F, -18.8F, 4.2F);
		grip.addChild(gun19);
		setRotationAngle(gun19, -0.6692F, 0.0F, 0.0F);
		gun19.cubeList.add(new ModelBox(gun19, 330, 287, 0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip.addChild(gun20);
		setRotationAngle(gun20, 2.491F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 326, 162, 0.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip.addChild(gun21);
		setRotationAngle(gun21, 0.481F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 234, 322, 0.0F, 0.0F, 0.0F, 4, 12, 1, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 310, 268, 0.001F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip.addChild(gun23);
		setRotationAngle(gun23, -2.5281F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 160, 180, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip.addChild(gun24);
		setRotationAngle(gun24, 0.481F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 122, 303, 0.0F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 96, 303, 0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F, false));
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