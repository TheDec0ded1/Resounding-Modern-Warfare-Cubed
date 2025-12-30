package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class C8Mag extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer gun1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun14;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer magpul;
	private final ModelRenderer gun36;
	private final ModelRenderer gun37;
	private final ModelRenderer gun38;
	private final ModelRenderer gun39;
	private final ModelRenderer gun40;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;
	private final ModelRenderer gun7;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun6;

	public C8Mag() {
		textureWidth = 96;
		textureHeight = 96;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(1.0F, -36.0F, -4.5F);
		magazine.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 21, 59, -0.001F, -0.001F, -0.101F, 3, 7, 5, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 69, 33, 1.998F, -0.501F, 2.849F, 1, 1, 3, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 69, 38, -0.002F, -0.501F, 2.849F, 1, 1, 3, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 38, 66, 0.0F, -0.002F, 4.749F, 3, 7, 1, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 68, 62, 0.5F, 0.999F, 4.999F, 2, 6, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(1.0F, -29.0F, 1.5F);
		magazine.addChild(gun2);
		setRotationAngle(gun2, -1.7846F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, 0.001F, 1.001F, 0.001F, 3, 5, 10, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 0, 16, 0.002F, 0.251F, 0.0F, 3, 1, 10, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 27, 0, 0.501F, 0.001F, 0.001F, 2, 1, 10, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(0.8F, -36.0F, -0.5F);
		magazine.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 63, 68, -0.099F, 0.0F, -0.1F, 1, 7, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 74, 54, -0.098F, -0.499F, -0.101F, 1, 1, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 68, 70, -0.1F, 0.0F, -0.6F, 1, 7, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 0, 75, -0.099F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(3.2F, -36.0F, -0.5F);
		magazine.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 9, 72, 0.101F, 0.0F, -0.1F, 1, 7, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 34, 75, 0.201F, 2.0F, -0.5F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 39, 75, 0.2F, 1.999F, 0.0F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 75, 62, 0.3F, 2.699F, -0.2F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 75, 65, 0.501F, 3.099F, -0.2F, 1, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 76, 43, 0.102F, -0.499F, -0.101F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 14, 72, 0.1F, 0.0F, -0.6F, 1, 7, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 44, 76, 0.101F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 13, 63, -0.8F, -0.2F, 1.0F, 2, 7, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 49, 76, 0.201F, -0.7F, 1.001F, 1, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 61, 33, -0.799F, 6.3F, 1.001F, 2, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 56, 68, -2.6F, -0.2F, 1.0F, 2, 7, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 54, 77, -2.599F, -0.7F, 1.001F, 1, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 73, 27, -2.599F, 6.3F, 1.001F, 2, 1, 1, -0.2F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(0.8F, -29.0F, 1.5F);
		magazine.addChild(gun5);
		setRotationAngle(gun5, -1.7846F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 0, 28, -0.098F, 1.0977F, 0.0212F, 1, 1, 10, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 23, 36, -0.099F, 1.5977F, 0.0212F, 1, 1, 10, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(3.2F, -29.0F, 1.5F);
		magazine.addChild(gun8);
		setRotationAngle(gun8, -1.7846F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 0, 40, 0.102F, 1.0977F, 0.0212F, 1, 1, 10, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 27, 12, -0.8F, -0.0023F, -0.0788F, 2, 1, 10, -0.2F, false));
		gun8.cubeList.add(new ModelBox(gun8, 46, 36, 0.101F, 1.5977F, 0.0212F, 1, 1, 10, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 73, 30, -0.799F, -0.003F, 9.2212F, 2, 1, 1, -0.2F, false));
		gun8.cubeList.add(new ModelBox(gun8, 27, 24, -2.6F, -0.0023F, -0.0788F, 2, 1, 10, -0.2F, false));
		gun8.cubeList.add(new ModelBox(gun8, 74, 48, -2.599F, -0.003F, 9.2212F, 2, 1, 1, -0.2F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(3.2F, -29.0F, -1.0F);
		magazine.addChild(gun9);
		setRotationAngle(gun9, -1.7846F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 23, 48, 0.001F, 1.0F, 0.0F, 1, 1, 9, 0.0F, false));
		gun9.cubeList.add(new ModelBox(gun9, 44, 48, 0.002F, 0.5F, 0.0F, 1, 1, 9, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(3.2F, -36.0F, -3.0F);
		magazine.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 19, 72, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));
		gun10.cubeList.add(new ModelBox(gun10, 59, 77, -0.001F, 0.001F, -0.75F, 1, 1, 1, 0.0F, false));
		gun10.cubeList.add(new ModelBox(gun10, 24, 72, 0.001F, 0.0F, 0.5F, 1, 7, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(3.2F, -36.0F, -4.5F);
		magazine.addChild(gun11);
		gun11.cubeList.add(new ModelBox(gun11, 29, 72, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(3.2F, -29.0F, -3.5F);
		magazine.addChild(gun12);
		setRotationAngle(gun12, -1.7846F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 0, 52, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(0.8F, -36.0F, -4.5F);
		magazine.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 73, 0, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(0.8F, -29.0F, -1.0F);
		magazine.addChild(gun14);
		setRotationAngle(gun14, -1.7846F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 52, 0, 0.001F, 1.0F, 0.0F, 1, 1, 9, 0.0F, false));
		gun14.cubeList.add(new ModelBox(gun14, 52, 11, 0.002F, 0.5F, 0.0F, 1, 1, 9, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(0.8F, -36.0F, -3.0F);
		magazine.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 73, 9, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 0, 78, 0.001F, 0.001F, -0.75F, 1, 1, 1, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 73, 18, 0.001F, 0.0F, 0.5F, 1, 7, 1, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(0.8F, -29.0F, -3.5F);
		magazine.addChild(gun16);
		setRotationAngle(gun16, -1.7846F, 0.0F, 0.0F);
		gun16.cubeList.add(new ModelBox(gun16, 52, 22, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(3.2F, -20.7F, -2.7F);
		magazine.addChild(gun17);
		setRotationAngle(gun17, -1.7846F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 78, 0, 0.0F, 1.1F, 0.0F, 1, 1, 1, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 78, 3, 0.001F, 0.6F, 0.0F, 1, 1, 1, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(0.8F, -20.7F, -2.7F);
		magazine.addChild(gun18);
		setRotationAngle(gun18, -1.7846F, 0.0F, 0.0F);
		gun18.cubeList.add(new ModelBox(gun18, 78, 6, 0.0F, 1.1F, 0.0F, 1, 1, 1, 0.0F, false));
		gun18.cubeList.add(new ModelBox(gun18, 78, 9, 0.001F, 0.6F, 0.0F, 1, 1, 1, 0.0F, false));

		magpul = new ModelRenderer(this);
		magpul.setRotationPoint(0.0F, 0.8F, -0.325F);
		magazine.addChild(magpul);
		

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(1.0F, -18.0F, -1.2F);
		magpul.addChild(gun36);
		setRotationAngle(gun36, 2.7884F, 0.0F, 0.0F);
		gun36.cubeList.add(new ModelBox(gun36, 68, 57, 0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(1.0F, -18.0F, -1.2F);
		magpul.addChild(gun37);
		setRotationAngle(gun37, -3.0115F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 38, 59, 0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(1.5F, -18.0F, -1.2F);
		magpul.addChild(gun38);
		setRotationAngle(gun38, -3.123F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 69, 43, 0.0F, 0.4F, 4.0F, 2, 3, 1, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(1.4F, -22.8F, 0.5F);
		magpul.addChild(gun39);
		setRotationAngle(gun39, -1.7846F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 55, 59, 0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(0.6F, -22.8F, 0.5F);
		magpul.addChild(gun40);
		setRotationAngle(gun40, -1.7846F, 0.0F, 0.0F);
		gun40.cubeList.add(new ModelBox(gun40, 65, 48, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(0.7F, -22.8F, 0.5F);
		magpul.addChild(gun41);
		setRotationAngle(gun41, -1.7846F, 0.0F, 0.0F);
		gun41.cubeList.add(new ModelBox(gun41, 0, 69, 0.0F, 4.5F, 0.0F, 1, 2, 3, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(1.3F, -22.8F, 0.5F);
		magpul.addChild(gun42);
		setRotationAngle(gun42, -1.7846F, 0.0F, 0.0F);
		gun42.cubeList.add(new ModelBox(gun42, 0, 63, 0.0F, 4.5F, 0.0F, 3, 2, 3, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(3.2F, -20.1F, -0.2F);
		magpul.addChild(gun7);
		setRotationAngle(gun7, -1.7846F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 73, 70, 0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(3.2F, -21.2F, -5.35F);
		magpul.addChild(gun31);
		setRotationAngle(gun31, -1.7846F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 74, 51, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(0.9F, -21.2F, -5.35F);
		magpul.addChild(gun32);
		setRotationAngle(gun32, -1.7846F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 52, 33, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(0.8F, -20.1F, -0.2F);
		magpul.addChild(gun6);
		setRotationAngle(gun6, -1.7846F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 47, 68, 0.0F, 0.0F, 0.0F, 3, 6, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}