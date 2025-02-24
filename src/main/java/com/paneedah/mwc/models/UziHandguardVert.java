package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziHandguardVert extends ModelBase {
	private final ModelRenderer HandguardVert;
	private final ModelRenderer gun48;
	private final ModelRenderer gun49;
	private final ModelRenderer gun50;
	private final ModelRenderer gun51;
	private final ModelRenderer gun52;
	private final ModelRenderer gun53;
	private final ModelRenderer gun54;
	private final ModelRenderer gun55;
	private final ModelRenderer gun58;
	private final ModelRenderer gun59;
	private final ModelRenderer gun62;
	private final ModelRenderer gun63;
	private final ModelRenderer gun64;
	private final ModelRenderer gun65;
	private final ModelRenderer Grip2;
	private final ModelRenderer gun242;
	private final ModelRenderer gun243;
	private final ModelRenderer gun244;
	private final ModelRenderer gun245;
	private final ModelRenderer gun246;
	private final ModelRenderer gun247;

	public UziHandguardVert() {
		textureWidth = 512;
		textureHeight = 512;

		HandguardVert = new ModelRenderer(this);
		HandguardVert.setRotationPoint(0.0F, 25.0F, 0.0F);
		

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-4.1F, -33.0F, -27.5F);
		HandguardVert.addChild(gun48);
		gun48.cubeList.add(new ModelBox(gun48, 175, 228, 0.0F, -1.0F, -2.0F, 4, 1, 15, 0.0F, false));
		gun48.cubeList.add(new ModelBox(gun48, 324, 39, 0.0F, -2.0F, 7.0F, 4, 1, 6, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-3.1F, -32.0F, -27.5F);
		HandguardVert.addChild(gun49);
		gun49.cubeList.add(new ModelBox(gun49, 229, 228, 0.0F, -1.0F, -2.0F, 2, 1, 15, 0.0F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-0.9F, -33.0F, -27.5F);
		HandguardVert.addChild(gun50);
		gun50.cubeList.add(new ModelBox(gun50, 114, 231, 0.0F, -1.0F, -2.0F, 2, 1, 15, 0.0F, false));
		gun50.cubeList.add(new ModelBox(gun50, 332, 287, 0.0F, -2.0F, 7.0F, 2, 1, 6, 0.0F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-1.9F, -32.0F, -27.5F);
		HandguardVert.addChild(gun51);
		gun51.cubeList.add(new ModelBox(gun51, 0, 239, 0.0F, -1.0F, -2.0F, 2, 1, 15, 0.0F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-4.1F, -32.0F, -27.5F);
		HandguardVert.addChild(gun52);
		setRotationAngle(gun52, 0.0F, 0.0F, -0.7854F);
		gun52.cubeList.add(new ModelBox(gun52, 122, 263, 0.7071F, -0.7071F, -2.0F, 1, 1, 15, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-3.1F, -31.0F, -27.5F);
		HandguardVert.addChild(gun53);
		setRotationAngle(gun53, 0.0F, 0.0F, -2.3562F);
		gun53.cubeList.add(new ModelBox(gun53, 155, 263, 0.7071F, 0.7071F, -2.0F, 1, 1, 15, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(1.1F, -32.0F, -27.5F);
		HandguardVert.addChild(gun54);
		setRotationAngle(gun54, 0.0F, 0.0F, 2.3562F);
		gun54.cubeList.add(new ModelBox(gun54, 229, 263, -0.7071F, 0.7071F, -2.0F, 1, 1, 15, 0.0F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(0.1F, -31.0F, -27.5F);
		HandguardVert.addChild(gun55);
		setRotationAngle(gun55, 0.0F, 0.0F, -2.3562F);
		gun55.cubeList.add(new ModelBox(gun55, 264, 17, 0.7071F, 0.7071F, -2.0F, 1, 1, 15, 0.0F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(1.1F, -34.8F, -29.5F);
		HandguardVert.addChild(gun58);
		setRotationAngle(gun58, 0.0F, 0.0F, 2.9557F);
		gun58.cubeList.add(new ModelBox(gun58, 316, 157, -0.1848F, 0.9828F, 0.0F, 1, 3, 9, 0.0F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-4.1F, -34.8F, -29.5F);
		HandguardVert.addChild(gun59);
		setRotationAngle(gun59, 0.0F, 0.0F, -1.3756F);
		gun59.cubeList.add(new ModelBox(gun59, 46, 311, 0.981F, -0.194F, 0.0F, 3, 1, 9, 0.0F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-4.1F, -34.8F, -29.5F);
		HandguardVert.addChild(gun62);
		gun62.cubeList.add(new ModelBox(gun62, 289, 145, 0.0F, -1.0F, 0.0F, 4, 2, 9, 0.0F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-0.9F, -34.8F, -29.5F);
		HandguardVert.addChild(gun63);
		gun63.cubeList.add(new ModelBox(gun63, 316, 145, 0.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, false));

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-1.3F, -36.8F, -29.5F);
		HandguardVert.addChild(gun64);
		gun64.cubeList.add(new ModelBox(gun64, 316, 170, -0.1545F, -1.9483F, 0.0F, 2, 1, 9, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.7F, -36.8F, -29.5F);
		HandguardVert.addChild(gun65);
		gun65.cubeList.add(new ModelBox(gun65, 299, 68, 0.1819F, -1.943F, 0.0F, 4, 1, 9, 0.0F, false));

		Grip2 = new ModelRenderer(this);
		Grip2.setRotationPoint(0.0F, -1.0F, -20.0F);
		HandguardVert.addChild(Grip2);
		

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-3.5F, -31.5F, -6.0F);
		Grip2.addChild(gun242);
		gun242.cubeList.add(new ModelBox(gun242, 71, 311, 0.0F, 0.0F, 0.0F, 4, 11, 5, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.0F, -25.5F, -1.5F);
		Grip2.addChild(gun243);
		gun243.cubeList.add(new ModelBox(gun243, 341, 76, 0.0F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));
		gun243.cubeList.add(new ModelBox(gun243, 114, 332, 0.0F, -6.0F, -5.0F, 3, 11, 2, 0.0F, false));
		gun243.cubeList.add(new ModelBox(gun243, 250, 280, 0.0F, -6.0F, -1.0F, 3, 6, 2, 0.0F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-3.0F, -25.5F, 0.5F);
		Grip2.addChild(gun244);
		setRotationAngle(gun244, -2.8256F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 234, 339, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-3.0F, -31.5F, -0.5F);
		Grip2.addChild(gun245);
		gun245.cubeList.add(new ModelBox(gun245, 114, 228, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun246 = new ModelRenderer(this);
		gun246.setRotationPoint(-3.0F, -30.5F, 0.5F);
		Grip2.addChild(gun246);
		setRotationAngle(gun246, -2.4538F, 0.0F, 0.0F);
		gun246.cubeList.add(new ModelBox(gun246, 343, 55, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));
		gun246.cubeList.add(new ModelBox(gun246, 308, 127, 0.0F, -3.2825F, 10.7569F, 3, 1, 1, 0.0F, false));

		gun247 = new ModelRenderer(this);
		gun247.setRotationPoint(-2.5F, -30.0F, -1.5F);
		Grip2.addChild(gun247);
		setRotationAngle(gun247, 0.0744F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HandguardVert.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}