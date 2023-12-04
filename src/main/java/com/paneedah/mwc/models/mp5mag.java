package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class mp5mag extends ModelBase {
	private final ModelRenderer magazine30;
	private final ModelRenderer bone23;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;

	public mp5mag() {
		textureWidth = 280;
		textureHeight = 300;

		magazine30 = new ModelRenderer(this);
		magazine30.setRotationPoint(-1.5F, 2.7314F, -19.6454F);
		setRotationAngle(magazine30, 0.1309F, 0.0F, 0.0F);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -6.4236F, 4.0209F);
		magazine30.addChild(bone23);
		setRotationAngle(bone23, -0.3054F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 169, 118, -1.5F, -4.0F, -1.0F, 3, 3, 2, -0.1F, false));
		bone23.cubeList.add(new ModelBox(bone23, 43, 17, -1.5F, -5.5F, -1.0F, 3, 2, 2, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 43, 0, -1.5F, -1.5F, -1.0F, 3, 4, 2, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 107, 4, -1.3F, -4.0F, -1.2F, 3, 3, 1, -0.201F, false));
		bone23.cubeList.add(new ModelBox(bone23, 107, 0, -1.7F, -4.0F, -1.2F, 3, 3, 1, -0.201F, false));
		bone23.cubeList.add(new ModelBox(bone23, 20, 59, -0.5F, -5.4998F, -2.0F, 1, 8, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 27, 38, -1.5F, -5.5008F, -3.0F, 3, 8, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.2776F, 0.0F, -2.8034F);
		bone23.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.3054F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 72, 86, -3.3612F, -5.5F, 0.9021F, 1, 8, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.7224F, 0.0F, -2.8034F);
		bone23.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.3054F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 131, -0.5F, -5.5F, 0.0F, 1, 8, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(2.2776F, 0.0F, -1.8034F);
		bone23.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.3054F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 107, -3.3612F, -5.5F, -0.0979F, 1, 8, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.7224F, 0.0F, -1.8034F);
		bone23.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.3054F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 121, 129, -0.5F, -5.5F, -1.0F, 1, 8, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone23.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 131, 3, -6.1311F, -4.6048F, -1.0054F, 1, 1, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone23.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 131, 10, 2.312F, -5.6309F, -1.0054F, 1, 1, 2, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0463F, 2.8216F, 1.253F);
		magazine30.addChild(bone25);
		setRotationAngle(bone25, -0.3054F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 0, 0, -1.5473F, -7.1486F, -1.141F, 3, 8, 2, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.5473F, -7.1486F, -3.141F, 3, 8, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, 0.6777F, -11.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.7723F, -11.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, 0.6777F, -8.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.7723F, -8.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, 0.6777F, -5.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.7723F, -5.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, 0.6777F, -2.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.7723F, -2.1486F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, 0.6777F, 0.8514F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.7723F, 0.8514F, -3.141F, 1, 2, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, 0.6777F, 3.8514F, -3.141F, 1, 4, 1, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.7723F, 3.8514F, -3.141F, 1, 4, 1, 0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(2.2313F, -2.7855F, -4.1693F);
		bone25.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.3054F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 47, 59, -2.9938F, -4.3631F, 2.0706F, 1, 8, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.6762F, -2.7855F, -4.1693F);
		bone25.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.3054F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 84, -0.8693F, -4.3631F, 1.1679F, 1, 8, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.2313F, -2.7855F, -3.1693F);
		bone25.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -0.3054F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 44, 85, -2.9938F, -4.3631F, 1.0706F, 1, 8, 2, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.6762F, -2.7855F, -3.1693F);
		bone25.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.3054F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 78, 104, -0.8693F, -4.3631F, 0.1679F, 1, 8, 2, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0463F, 5.3158F, -0.4874F);
		magazine30.addChild(bone26);
		setRotationAngle(bone26, -0.3054F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 14, 26, -1.5463F, -2.0497F, -0.23F, 3, 7, 2, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 96, 151, -1.5463F, 1.9503F, -1.23F, 3, 3, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 0, 52, -1.5463F, -2.0497F, -2.23F, 3, 7, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(2.2313F, 2.2648F, -4.2034F);
		bone26.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.3054F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 76, 16, -2.7087F, -4.3145F, 2.9717F, 1, 7, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.6762F, 2.2648F, -4.2034F);
		bone26.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3054F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 109, -1.1525F, -4.3145F, 2.0696F, 1, 7, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(2.2313F, 2.2648F, -3.2034F);
		bone26.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -0.3054F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 0, -2.7087F, -4.3145F, 1.9717F, 1, 7, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.6762F, 2.2648F, -3.2034F);
		bone26.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.3054F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 10, -1.1525F, -4.3145F, 1.0696F, 1, 7, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine30.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}