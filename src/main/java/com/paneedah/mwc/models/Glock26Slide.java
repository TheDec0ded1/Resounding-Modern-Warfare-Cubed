package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock26Slide extends ModelWithAttachments {
	private final ModelRenderer G26slide;
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

	public Glock26Slide() {
		textureWidth = 192;
		textureHeight = 192;

		G26slide = new ModelRenderer(this);
		G26slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G26slide.cubeList.add(new ModelBox(G26slide, 149, 169, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 107, 167, -2.3F, -37.5F, -23.499F, 2, 5, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 170, 92, -0.7F, -37.5F, -23.501F, 1, 5, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 99, 143, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 143, 134, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 146, 39, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 146, 144, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 99, 104, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 0, 0, -0.6F, -38.101F, -23.5F, 1, 1, 25, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 0, 54, 0.2F, -37.501F, -23.5F, 1, 1, 19, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 61, 143, -3.2F, -37.501F, -23.5F, 1, 1, 8, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 50, 184, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 184, 52, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 59, 165, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 53, 48, 0.201F, -37.001F, -23.5F, 1, 3, 19, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 133, 0, -3.199F, -37.001F, -23.5F, 1, 3, 8, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 174, 27, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 55, 184, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 184, 55, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 184, 58, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 30, 174, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 86, 172, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 91, 172, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 96, 172, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 101, 172, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 114, 172, 0.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 172, 142, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 172, 161, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 36, 173, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 66, 173, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 71, 173, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 117, 77, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 114, 167, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 185, 110, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 174, 32, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 40, 134, -2.4F, -38.1F, -23.5F, 2, 1, 8, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 184, 61, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G26slide.cubeList.add(new ModelBox(G26slide, 172, 148, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide57_r5 = new ModelRenderer(this);
		slide57_r5.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G26slide.addChild(slide57_r5);
		setRotationAngle(slide57_r5, 0.0F, 0.0F, -0.6545F);
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 117, 63, -1.0F, 0.0F, 18.0F, 1, 1, 12, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 80, 143, -1.0F, 0.0F, 5.0F, 1, 1, 8, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 184, 64, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide55_r2 = new ModelRenderer(this);
		slide55_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G26slide.addChild(slide55_r2);
		setRotationAngle(slide55_r2, 0.0F, 0.0F, 0.6545F);
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 0, 27, 0.0F, 0.0F, 5.0F, 1, 1, 25, 0.0F, false));
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 184, 67, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide24_r5 = new ModelRenderer(this);
		slide24_r5.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G26slide.addChild(slide24_r5);
		setRotationAngle(slide24_r5, -0.7854F, 0.0F, 0.0F);
		slide24_r5.cubeList.add(new ModelBox(slide24_r5, 170, 167, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r6 = new ModelRenderer(this);
		slide23_r6.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G26slide.addChild(slide23_r6);
		setRotationAngle(slide23_r6, -0.7854F, 0.0F, 0.0F);
		slide23_r6.cubeList.add(new ModelBox(slide23_r6, 170, 170, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r6 = new ModelRenderer(this);
		slide22_r6.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G26slide.addChild(slide22_r6);
		setRotationAngle(slide22_r6, -0.7854F, 0.0F, 0.0F);
		slide22_r6.cubeList.add(new ModelBox(slide22_r6, 0, 171, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r7 = new ModelRenderer(this);
		slide22_r7.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G26slide.addChild(slide22_r7);
		setRotationAngle(slide22_r7, -0.7854F, 0.0F, 0.0F);
		slide22_r7.cubeList.add(new ModelBox(slide22_r7, 57, 171, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r6 = new ModelRenderer(this);
		slide21_r6.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G26slide.addChild(slide21_r6);
		setRotationAngle(slide21_r6, -0.7854F, 0.0F, 0.0F);
		slide21_r6.cubeList.add(new ModelBox(slide21_r6, 132, 171, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, 0.0F, 0.0F);
		G26slide.addChild(sights);
		

		front = new ModelRenderer(this);
		front.setRotationPoint(0.5F, 8.0F, 0.0F);
		sights.addChild(front);
		front.cubeList.add(new ModelBox(front, 184, 73, -2.0F, -46.7874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r1 = new ModelRenderer(this);
		sights_r1.setRotationPoint(-1.5F, -46.1732F, -22.8556F);
		front.addChild(sights_r1);
		setRotationAngle(sights_r1, -0.5672F, 0.0F, 0.0F);
		sights_r1.cubeList.add(new ModelBox(sights_r1, 74, 184, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		dot_r1 = new ModelRenderer(this);
		dot_r1.setRotationPoint(-1.5F, -46.2199F, -22.5596F);
		front.addChild(dot_r1);
		setRotationAngle(dot_r1, 0.2618F, 0.0F, 0.0F);
		dot_r1.cubeList.add(new ModelBox(dot_r1, 184, 76, -0.5F, -0.55F, -0.375F, 1, 1, 1, -0.3F, false));
		dot_r1.cubeList.add(new ModelBox(dot_r1, 184, 70, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		rear = new ModelRenderer(this);
		rear.setRotationPoint(0.0F, 0.2F, 23.3F);
		sights.addChild(rear);
		rear.cubeList.add(new ModelBox(rear, 57, 174, -2.0F, -38.8874F, -23.1474F, 2, 1, 1, -0.2F, false));

		sights_r2 = new ModelRenderer(this);
		sights_r2.setRotationPoint(-1.0F, -38.5021F, -22.7088F);
		rear.addChild(sights_r2);
		setRotationAngle(sights_r2, -0.1309F, 0.0F, 0.0F);
		sights_r2.cubeList.add(new ModelBox(sights_r2, 155, 174, -1.0F, -0.35F, -0.5F, 2, 1, 1, -0.2F, false));

		sights_r3 = new ModelRenderer(this);
		sights_r3.setRotationPoint(-1.125F, -37.2908F, -22.4015F);
		rear.addChild(sights_r3);
		setRotationAngle(sights_r3, 0.1309F, 0.0F, 0.0F);
		sights_r3.cubeList.add(new ModelBox(sights_r3, 184, 164, -0.7F, -1.9F, -0.275F, 1, 1, 1, -0.425F, false));
		sights_r3.cubeList.add(new ModelBox(sights_r3, 184, 167, -0.7F, -2.05F, -0.275F, 1, 1, 1, -0.425F, false));

		sights_r4 = new ModelRenderer(this);
		sights_r4.setRotationPoint(-0.975F, -38.2823F, -22.532F);
		rear.addChild(sights_r4);
		setRotationAngle(sights_r4, 0.1309F, 0.0F, 0.0F);
		sights_r4.cubeList.add(new ModelBox(sights_r4, 164, 184, -0.2F, -1.05F, -0.275F, 1, 1, 1, -0.425F, false));
		sights_r4.cubeList.add(new ModelBox(sights_r4, 151, 184, -0.2F, -0.9F, -0.275F, 1, 1, 1, -0.425F, false));

		sights_r5 = new ModelRenderer(this);
		sights_r5.setRotationPoint(-1.0F, -38.5021F, -22.5861F);
		rear.addChild(sights_r5);
		setRotationAngle(sights_r5, 0.1309F, 0.0F, 0.0F);
		sights_r5.cubeList.add(new ModelBox(sights_r5, 174, 184, -0.4F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 169, 184, -0.2F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 0, 185, -0.6F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 146, 184, -0.8F, -0.5F, -0.275F, 1, 1, 1, -0.4F, false));
		sights_r5.cubeList.add(new ModelBox(sights_r5, 129, 174, -1.0F, -0.35F, -0.5F, 2, 1, 1, -0.2F, false));

		rear2 = new ModelRenderer(this);
		rear2.setRotationPoint(0.0F, -0.4F, 23.3F);
		sights.addChild(rear2);
		rear2.cubeList.add(new ModelBox(rear2, 79, 184, -1.0F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));
		rear2.cubeList.add(new ModelBox(rear2, 84, 185, -0.75F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r6 = new ModelRenderer(this);
		sights_r6.setRotationPoint(0.4079F, -36.0446F, -22.6474F);
		rear2.addChild(sights_r6);
		setRotationAngle(sights_r6, 0.0F, 0.0F, -1.0472F);
		sights_r6.cubeList.add(new ModelBox(sights_r6, 106, 174, -1.0F, -3.5F, -0.5F, 2, 1, 1, -0.2F, false));

		sights_r7 = new ModelRenderer(this);
		sights_r7.setRotationPoint(0.0072F, -36.8615F, -22.6474F);
		rear2.addChild(sights_r7);
		setRotationAngle(sights_r7, 0.0F, 0.0F, -0.5236F);
		sights_r7.cubeList.add(new ModelBox(sights_r7, 180, 93, 0.0F, -1.5F, -0.5F, 1, 2, 1, -0.2F, false));

		sights_r8 = new ModelRenderer(this);
		sights_r8.setRotationPoint(-0.75F, -37.9021F, -22.5861F);
		rear2.addChild(sights_r8);
		setRotationAngle(sights_r8, 0.1309F, 0.0F, 0.0F);
		sights_r8.cubeList.add(new ModelBox(sights_r8, 180, 97, 0.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r8.cubeList.add(new ModelBox(sights_r8, 106, 184, -0.25F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r9 = new ModelRenderer(this);
		sights_r9.setRotationPoint(-0.75F, -37.9021F, -22.7088F);
		rear2.addChild(sights_r9);
		setRotationAngle(sights_r9, -0.1309F, 0.0F, 0.0F);
		sights_r9.cubeList.add(new ModelBox(sights_r9, 180, 109, 0.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r9.cubeList.add(new ModelBox(sights_r9, 141, 184, -0.25F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		rear3 = new ModelRenderer(this);
		rear3.setRotationPoint(-1.75F, -0.4F, 23.3F);
		sights.addChild(rear3);
		rear3.cubeList.add(new ModelBox(rear3, 184, 79, -0.25F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));
		rear3.cubeList.add(new ModelBox(rear3, 5, 185, -0.5F, -38.5874F, -23.1474F, 1, 1, 1, -0.2F, false));

		sights_r10 = new ModelRenderer(this);
		sights_r10.setRotationPoint(0.5F, -37.9021F, -22.5861F);
		rear3.addChild(sights_r10);
		setRotationAngle(sights_r10, 0.1309F, 0.0F, 0.0F);
		sights_r10.cubeList.add(new ModelBox(sights_r10, 180, 101, -1.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r10.cubeList.add(new ModelBox(sights_r10, 126, 184, -0.75F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));

		sights_r11 = new ModelRenderer(this);
		sights_r11.setRotationPoint(0.5F, -37.9021F, -22.7088F);
		rear3.addChild(sights_r11);
		setRotationAngle(sights_r11, -0.1309F, 0.0F, 0.0F);
		sights_r11.cubeList.add(new ModelBox(sights_r11, 180, 105, -1.0F, -0.65F, -0.5F, 1, 2, 1, -0.2F, false));
		sights_r11.cubeList.add(new ModelBox(sights_r11, 184, 145, -0.75F, -0.65F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G26slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}