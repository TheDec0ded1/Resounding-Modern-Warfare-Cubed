package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock19Slide extends ModelWithAttachments {
	private final ModelRenderer G19slide;
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

	public Glock19Slide() {
		textureWidth = 208;
		textureHeight = 208;

		G19slide = new ModelRenderer(this);
		G19slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19slide.cubeList.add(new ModelBox(G19slide, 22, 188, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 153, 125, -2.3F, -37.5F, -26.499F, 2, 5, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 39, 83, -0.7F, -37.5F, -26.501F, 1, 5, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 38, 167, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 53, 167, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 167, 170, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 171, 69, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 119, 99, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 0, -0.6F, -38.101F, -26.5F, 1, 1, 28, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 59, 55, 0.2F, -37.501F, -26.5F, 1, 1, 22, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 145, 13, -3.2F, -37.501F, -26.5F, 1, 1, 11, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 35, 202, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 202, 39, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 185, 14, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 59, 29, 0.201F, -37.001F, -26.5F, 1, 3, 22, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 27, 133, -3.199F, -37.001F, -26.5F, 1, 3, 11, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 191, 170, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 40, 202, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 202, 42, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 45, 202, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 173, 191, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 54, 67, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 39, 90, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 148, 105, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 21, 149, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 21, 155, 0.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 71, 157, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 170, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 16, 189, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 190, 142, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 190, 182, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 137, 47, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 186, 75, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 203, 83, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 192, 20, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 136, -2.4F, -38.1F, -26.5F, 2, 1, 11, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 202, 45, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 190, 188, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide57_r5 = new ModelRenderer(this);
		slide57_r5.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G19slide.addChild(slide57_r5);
		setRotationAngle(slide57_r5, 0.0F, 0.0F, -0.6545F);
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 93, 132, -1.0F, 0.0F, 18.0F, 1, 1, 12, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 27, 148, -1.0F, 0.0F, 2.0F, 1, 1, 11, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 202, 48, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide55_r2 = new ModelRenderer(this);
		slide55_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19slide.addChild(slide55_r2);
		setRotationAngle(slide55_r2, 0.0F, 0.0F, 0.6545F);
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 0, 30, 0.0F, 0.0F, 2.0F, 1, 1, 28, 0.0F, false));
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 50, 202, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide24_r5 = new ModelRenderer(this);
		slide24_r5.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19slide.addChild(slide24_r5);
		setRotationAngle(slide24_r5, -0.7854F, 0.0F, 0.0F);
		slide24_r5.cubeList.add(new ModelBox(slide24_r5, 188, 123, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r6 = new ModelRenderer(this);
		slide23_r6.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19slide.addChild(slide23_r6);
		setRotationAngle(slide23_r6, -0.7854F, 0.0F, 0.0F);
		slide23_r6.cubeList.add(new ModelBox(slide23_r6, 125, 188, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r6 = new ModelRenderer(this);
		slide22_r6.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19slide.addChild(slide22_r6);
		setRotationAngle(slide22_r6, -0.7854F, 0.0F, 0.0F);
		slide22_r6.cubeList.add(new ModelBox(slide22_r6, 188, 126, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r7 = new ModelRenderer(this);
		slide22_r7.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19slide.addChild(slide22_r7);
		setRotationAngle(slide22_r7, -0.7854F, 0.0F, 0.0F);
		slide22_r7.cubeList.add(new ModelBox(slide22_r7, 188, 129, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r6 = new ModelRenderer(this);
		slide21_r6.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19slide.addChild(slide21_r6);
		setRotationAngle(slide21_r6, -0.7854F, 0.0F, 0.0F);
		slide21_r6.cubeList.add(new ModelBox(slide21_r6, 188, 132, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, 0.0F, 0.0F);
		G19slide.addChild(sights);
		

		front = new ModelRenderer(this);
		front.setRotationPoint(0.5F, 8.0F, -3.0F);
		sights.addChild(front);
		front.cubeList.add(new ModelBox(front, 62, 202, -2.0F, -46.7874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r1 = new ModelRenderer(this);
		sights_r1.setRotationPoint(-1.5F, -46.1732F, -22.8556F);
		front.addChild(sights_r1);
		setRotationAngle(sights_r1, -0.5672F, 0.0F, 0.0F);
		sights_r1.cubeList.add(new ModelBox(sights_r1, 202, 63, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		dot_r1 = new ModelRenderer(this);
		dot_r1.setRotationPoint(-1.5F, -46.2199F, -22.5596F);
		front.addChild(dot_r1);
		setRotationAngle(dot_r1, 0.2618F, 0.0F, 0.0F);
		dot_r1.cubeList.add(new ModelBox(dot_r1, 202, 60, -0.5F, -0.55F, -0.375F, 1, 1, 1, -0.3F, false));
		dot_r1.cubeList.add(new ModelBox(dot_r1, 202, 57, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		rear = new ModelRenderer(this);
		rear.setRotationPoint(0.0F, 0.2F, 23.3F);
		sights.addChild(rear);
		rear.cubeList.add(new ModelBox(rear, 21, 192, -2.0F, -38.8874F, -23.1474F, 2, 1, 1, -0.2F, false));

		sights_r2 = new ModelRenderer(this);
		sights_r2.setRotationPoint(-1.0F, -38.5021F, -22.7088F);
		rear.addChild(sights_r2);
		setRotationAngle(sights_r2, -0.1309F, 0.0F, 0.0F);
		sights_r2.cubeList.add(new ModelBox(sights_r2, 192, 26, -1.0F, -0.35F, -0.5F, 2, 1, 1, -0.2F, false));

		sights_r3 = new ModelRenderer(this);
		sights_r3.setRotationPoint(-1.125F, -37.2908F, -22.4015F);
		rear.addChild(sights_r3);
		setRotationAngle(sights_r3, 0.1309F, 0.0F, 0.0F);
		sights_r3.cubeList.add(new ModelBox(sights_r3, 102, 202, -0.7F, -1.9F, -0.275F, 1, 1, 1, -0.425F, false));
		sights_r3.cubeList.add(new ModelBox(sights_r3, 97, 202, -0.7F, -2.05F, -0.275F, 1, 1, 1, -0.425F, false));

		sights_r4 = new ModelRenderer(this);
		sights_r4.setRotationPoint(-0.975F, -38.2823F, -22.532F);
		rear.addChild(sights_r4);
		setRotationAngle(sights_r4, 0.1309F, 0.0F, 0.0F);
		sights_r4.cubeList.add(new ModelBox(sights_r4, 92, 202, -0.2F, -1.05F, -0.275F, 1, 1, 1, -0.425F, false));
		sights_r4.cubeList.add(new ModelBox(sights_r4, 87, 202, -0.2F, -0.9F, -0.275F, 1, 1, 1, -0.425F, false));

		sights_r5 = new ModelRenderer(this);
		sights_r5.setRotationPoint(-1.0F, -38.5021F, -22.5861F);
		rear.addChild(sights_r5);
		setRotationAngle(sights_r5, 0.1309F, 0.0F, 0.0F);
		sights_r5.cubeList.add(new ModelBox(sights_r5, 82, 202, -0.4F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 77, 202, -0.2F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 72, 202, -0.6F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 67, 202, -0.8F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 192, 23, -1.0F, -0.35F, -0.5F, 2, 1, 1, -0.2F, false));

		rear2 = new ModelRenderer(this);
		rear2.setRotationPoint(0.0F, -0.4F, 23.3F);
		sights.addChild(rear2);
		rear2.cubeList.add(new ModelBox(rear2, 107, 202, -1.0F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));
		rear2.cubeList.add(new ModelBox(rear2, 202, 121, -0.75F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r6 = new ModelRenderer(this);
		sights_r6.setRotationPoint(0.4079F, -36.0446F, -22.6474F);
		rear2.addChild(sights_r6);
		setRotationAngle(sights_r6, 0.0F, 0.0F, -1.0472F);
		sights_r6.cubeList.add(new ModelBox(sights_r6, 28, 192, -1.0F, -3.5F, -0.5F, 2, 1, 1, -0.2F, false));

		sights_r7 = new ModelRenderer(this);
		sights_r7.setRotationPoint(0.0072F, -36.8615F, -22.6474F);
		rear2.addChild(sights_r7);
		setRotationAngle(sights_r7, 0.0F, 0.0F, -0.5236F);
		sights_r7.cubeList.add(new ModelBox(sights_r7, 197, 138, 0.0F, -1.5F, -0.5F, 1, 2, 1, -0.2F, false));

		sights_r8 = new ModelRenderer(this);
		sights_r8.setRotationPoint(-0.75F, -37.9021F, -22.5861F);
		rear2.addChild(sights_r8);
		setRotationAngle(sights_r8, 0.1309F, 0.0F, 0.0F);
		sights_r8.cubeList.add(new ModelBox(sights_r8, 197, 134, 0.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r8.cubeList.add(new ModelBox(sights_r8, 112, 202, -0.25F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r9 = new ModelRenderer(this);
		sights_r9.setRotationPoint(-0.75F, -37.9021F, -22.7088F);
		rear2.addChild(sights_r9);
		setRotationAngle(sights_r9, -0.1309F, 0.0F, 0.0F);
		sights_r9.cubeList.add(new ModelBox(sights_r9, 197, 130, 0.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r9.cubeList.add(new ModelBox(sights_r9, 117, 202, -0.25F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		rear3 = new ModelRenderer(this);
		rear3.setRotationPoint(-1.75F, -0.4F, 23.3F);
		sights.addChild(rear3);
		rear3.cubeList.add(new ModelBox(rear3, 202, 124, -0.25F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));
		rear3.cubeList.add(new ModelBox(rear3, 202, 133, -0.5F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r10 = new ModelRenderer(this);
		sights_r10.setRotationPoint(0.5F, -37.9021F, -22.5861F);
		rear3.addChild(sights_r10);
		setRotationAngle(sights_r10, 0.1309F, 0.0F, 0.0F);
		sights_r10.cubeList.add(new ModelBox(sights_r10, 65, 198, -1.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r10.cubeList.add(new ModelBox(sights_r10, 202, 127, -0.75F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r11 = new ModelRenderer(this);
		sights_r11.setRotationPoint(0.5F, -37.9021F, -22.7088F);
		rear3.addChild(sights_r11);
		setRotationAngle(sights_r11, -0.1309F, 0.0F, 0.0F);
		sights_r11.cubeList.add(new ModelBox(sights_r11, 197, 187, -1.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r11.cubeList.add(new ModelBox(sights_r11, 202, 130, -0.75F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G19slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}