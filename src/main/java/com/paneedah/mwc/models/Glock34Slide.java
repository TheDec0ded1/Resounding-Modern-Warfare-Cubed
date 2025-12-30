package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock34Slide extends ModelWithAttachments {
	private final ModelRenderer G34slide;
	private final ModelRenderer slide57_r5;
	private final ModelRenderer slide55_r2;
	private final ModelRenderer slide24_r5;
	private final ModelRenderer slide23_r6;
	private final ModelRenderer slide22_r6;
	private final ModelRenderer slide22_r7;
	private final ModelRenderer slide21_r6;
	private final ModelRenderer sights;
	private final ModelRenderer front;
	private final ModelRenderer sights_r1;
	private final ModelRenderer dot_r1;
	private final ModelRenderer rear;
	private final ModelRenderer sights_r2;
	private final ModelRenderer sights_r3;
	private final ModelRenderer sights_r4;
	private final ModelRenderer sights_r5;
	private final ModelRenderer rear2;
	private final ModelRenderer sights_r6;
	private final ModelRenderer sights_r7;
	private final ModelRenderer sights_r8;
	private final ModelRenderer sights_r9;
	private final ModelRenderer rear3;
	private final ModelRenderer sights_r10;
	private final ModelRenderer sights_r11;

	public Glock34Slide() {
		textureWidth = 240;
		textureHeight = 240;

		G34slide = new ModelRenderer(this);
		G34slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G34slide.cubeList.add(new ModelBox(G34slide, 186, 213, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 123, 184, -2.3F, -37.5F, -31.499F, 2, 5, 3, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 164, 144, -0.7F, -37.5F, -31.501F, 1, 5, 3, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 72, 140, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 107, 195, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 42, 199, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 57, 199, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 164, 109, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 0, 0, -0.6F, -38.101F, -31.5F, 1, 1, 33, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 69, 65, 0.2F, -37.501F, -31.5F, 1, 1, 27, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 129, 135, -3.2F, -37.501F, -31.5F, 1, 1, 16, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 228, 203, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 206, 228, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 213, 46, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 69, 34, 0.201F, -37.001F, -31.5F, 1, 3, 27, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 126, 54, -3.199F, -37.001F, -31.5F, 1, 3, 16, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 146, 218, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 211, 228, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 216, 228, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 221, 228, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 151, 218, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 64, 77, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 39, 121, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 39, 127, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 39, 133, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 33, 142, 0.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 33, 148, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 25, 175, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 102, 178, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 25, 181, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 176, 191, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 171, 0, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 109, 213, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 230, 87, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 218, 167, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 126, 74, -2.4F, -38.1F, -31.5F, 2, 1, 16, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 226, 228, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G34slide.cubeList.add(new ModelBox(G34slide, 183, 217, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide57_r5 = new ModelRenderer(this);
		slide57_r5.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G34slide.addChild(slide57_r5);
		setRotationAngle(slide57_r5, 0.0F, 0.0F, -0.6545F);
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 107, 170, -1.0F, 0.0F, 18.0F, 1, 1, 12, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 136, 0, -1.0F, 0.0F, -3.0F, 1, 1, 16, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 229, 0, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide55_r2 = new ModelRenderer(this);
		slide55_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G34slide.addChild(slide55_r2);
		setRotationAngle(slide55_r2, 0.0F, 0.0F, 0.6545F);
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 0, 35, 0.0F, 0.0F, -3.0F, 1, 1, 33, 0.0F, false));
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 5, 229, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide24_r5 = new ModelRenderer(this);
		slide24_r5.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G34slide.addChild(slide24_r5);
		setRotationAngle(slide24_r5, -0.7854F, 0.0F, 0.0F);
		slide24_r5.cubeList.add(new ModelBox(slide24_r5, 216, 164, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r6 = new ModelRenderer(this);
		slide23_r6.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G34slide.addChild(slide23_r6);
		setRotationAngle(slide23_r6, -0.7854F, 0.0F, 0.0F);
		slide23_r6.cubeList.add(new ModelBox(slide23_r6, 216, 184, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r6 = new ModelRenderer(this);
		slide22_r6.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G34slide.addChild(slide22_r6);
		setRotationAngle(slide22_r6, -0.7854F, 0.0F, 0.0F);
		slide22_r6.cubeList.add(new ModelBox(slide22_r6, 216, 187, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r7 = new ModelRenderer(this);
		slide22_r7.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G34slide.addChild(slide22_r7);
		setRotationAngle(slide22_r7, -0.7854F, 0.0F, 0.0F);
		slide22_r7.cubeList.add(new ModelBox(slide22_r7, 216, 190, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r6 = new ModelRenderer(this);
		slide21_r6.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G34slide.addChild(slide21_r6);
		setRotationAngle(slide21_r6, -0.7854F, 0.0F, 0.0F);
		slide21_r6.cubeList.add(new ModelBox(slide21_r6, 216, 193, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, 0.0F, 0.0F);
		G34slide.addChild(sights);
		

		front = new ModelRenderer(this);
		front.setRotationPoint(0.5F, 8.0F, -8.0F);
		sights.addChild(front);
		front.cubeList.add(new ModelBox(front, 70, 229, -2.0F, -46.7874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r1 = new ModelRenderer(this);
		sights_r1.setRotationPoint(-1.5F, -46.1732F, -22.8556F);
		front.addChild(sights_r1);
		setRotationAngle(sights_r1, -0.5672F, 0.0F, 0.0F);
		sights_r1.cubeList.add(new ModelBox(sights_r1, 75, 229, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		dot_r1 = new ModelRenderer(this);
		dot_r1.setRotationPoint(-1.5F, -46.2199F, -22.5596F);
		front.addChild(dot_r1);
		setRotationAngle(dot_r1, 0.2618F, 0.0F, 0.0F);
		dot_r1.cubeList.add(new ModelBox(dot_r1, 65, 229, -0.5F, -0.55F, -0.375F, 1, 1, 1, -0.3F, false));
		dot_r1.cubeList.add(new ModelBox(dot_r1, 60, 229, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		rear = new ModelRenderer(this);
		rear.setRotationPoint(0.0F, 0.2F, 23.3F);
		sights.addChild(rear);
		rear.cubeList.add(new ModelBox(rear, 218, 176, -2.0F, -38.8874F, -23.1474F, 2, 1, 1, -0.2F, false));

		sights_r2 = new ModelRenderer(this);
		sights_r2.setRotationPoint(-1.0F, -38.5021F, -22.7088F);
		rear.addChild(sights_r2);
		setRotationAngle(sights_r2, -0.1309F, 0.0F, 0.0F);
		sights_r2.cubeList.add(new ModelBox(sights_r2, 211, 218, -1.0F, -0.35F, -0.5F, 2, 1, 1, -0.2F, false));

		sights_r3 = new ModelRenderer(this);
		sights_r3.setRotationPoint(-1.125F, -37.2908F, -22.4015F);
		rear.addChild(sights_r3);
		setRotationAngle(sights_r3, 0.1309F, 0.0F, 0.0F);
		sights_r3.cubeList.add(new ModelBox(sights_r3, 122, 229, -0.7F, -1.9F, -0.275F, 1, 1, 1, -0.425F, false));
		sights_r3.cubeList.add(new ModelBox(sights_r3, 117, 229, -0.7F, -2.05F, -0.275F, 1, 1, 1, -0.425F, false));

		sights_r4 = new ModelRenderer(this);
		sights_r4.setRotationPoint(-0.975F, -38.2823F, -22.532F);
		rear.addChild(sights_r4);
		setRotationAngle(sights_r4, 0.1309F, 0.0F, 0.0F);
		sights_r4.cubeList.add(new ModelBox(sights_r4, 112, 229, -0.2F, -1.05F, -0.275F, 1, 1, 1, -0.425F, false));
		sights_r4.cubeList.add(new ModelBox(sights_r4, 107, 229, -0.2F, -0.9F, -0.275F, 1, 1, 1, -0.425F, false));

		sights_r5 = new ModelRenderer(this);
		sights_r5.setRotationPoint(-1.0F, -38.5021F, -22.5861F);
		rear.addChild(sights_r5);
		setRotationAngle(sights_r5, 0.1309F, 0.0F, 0.0F);
		sights_r5.cubeList.add(new ModelBox(sights_r5, 102, 229, -0.4F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 97, 229, -0.2F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 92, 229, -0.6F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 80, 229, -0.8F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 218, 179, -1.0F, -0.35F, -0.5F, 2, 1, 1, -0.2F, false));

		rear2 = new ModelRenderer(this);
		rear2.setRotationPoint(0.0F, -0.4F, 23.3F);
		sights.addChild(rear2);
		rear2.cubeList.add(new ModelBox(rear2, 229, 124, -1.0F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));
		rear2.cubeList.add(new ModelBox(rear2, 229, 130, -0.75F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r6 = new ModelRenderer(this);
		sights_r6.setRotationPoint(0.4079F, -36.0446F, -22.6474F);
		rear2.addChild(sights_r6);
		setRotationAngle(sights_r6, 0.0F, 0.0F, -1.0472F);
		sights_r6.cubeList.add(new ModelBox(sights_r6, 218, 218, -1.0F, -3.5F, -0.5F, 2, 1, 1, -0.2F, false));

		sights_r7 = new ModelRenderer(this);
		sights_r7.setRotationPoint(0.0072F, -36.8615F, -22.6474F);
		rear2.addChild(sights_r7);
		setRotationAngle(sights_r7, 0.0F, 0.0F, -0.5236F);
		sights_r7.cubeList.add(new ModelBox(sights_r7, 225, 38, 0.0F, -1.5F, -0.5F, 1, 2, 1, -0.2F, false));

		sights_r8 = new ModelRenderer(this);
		sights_r8.setRotationPoint(-0.75F, -37.9021F, -22.5861F);
		rear2.addChild(sights_r8);
		setRotationAngle(sights_r8, 0.1309F, 0.0F, 0.0F);
		sights_r8.cubeList.add(new ModelBox(sights_r8, 224, 221, 0.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r8.cubeList.add(new ModelBox(sights_r8, 127, 229, -0.25F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r9 = new ModelRenderer(this);
		sights_r9.setRotationPoint(-0.75F, -37.9021F, -22.7088F);
		rear2.addChild(sights_r9);
		setRotationAngle(sights_r9, -0.1309F, 0.0F, 0.0F);
		sights_r9.cubeList.add(new ModelBox(sights_r9, 224, 196, 0.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r9.cubeList.add(new ModelBox(sights_r9, 229, 127, -0.25F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		rear3 = new ModelRenderer(this);
		rear3.setRotationPoint(-1.75F, -0.4F, 23.3F);
		sights.addChild(rear3);
		rear3.cubeList.add(new ModelBox(rear3, 229, 133, -0.25F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));
		rear3.cubeList.add(new ModelBox(rear3, 150, 229, -0.5F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r10 = new ModelRenderer(this);
		sights_r10.setRotationPoint(0.5F, -37.9021F, -22.5861F);
		rear3.addChild(sights_r10);
		setRotationAngle(sights_r10, 0.1309F, 0.0F, 0.0F);
		sights_r10.cubeList.add(new ModelBox(sights_r10, 225, 76, -1.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r10.cubeList.add(new ModelBox(sights_r10, 229, 136, -0.75F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r11 = new ModelRenderer(this);
		sights_r11.setRotationPoint(0.5F, -37.9021F, -22.7088F);
		rear3.addChild(sights_r11);
		setRotationAngle(sights_r11, -0.1309F, 0.0F, 0.0F);
		sights_r11.cubeList.add(new ModelBox(sights_r11, 225, 72, -1.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r11.cubeList.add(new ModelBox(sights_r11, 229, 139, -0.75F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G34slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}