package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PPShStock extends ModelWithAttachments {
	private final ModelRenderer stock;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;

	public PPShStock() {
		textureWidth = 128;
		textureHeight = 128;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 84, 64, 1.2819F, -37.6027F, -23.8351F, 1, 7, 19, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 63, 91, -4.7181F, -31.6027F, -23.8351F, 6, 1, 6, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 67, 95, -4.7181F, -31.6027F, -6.8351F, 6, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 68, 13, -5.2181F, -37.6027F, -23.8351F, 1, 7, 19, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.2129F, -34.1027F, -2.537F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 96, -3.75F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.7233F, -34.1027F, -7.1332F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 96, 2.75F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.4252F, -27.313F, 4.0092F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.829F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 94, -3.0F, -1.5F, -1.5F, 6, 2, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.4252F, -28.3798F, 2.213F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.6572F, 0.5484F, 0.5942F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 94, -2.1945F, 1.0481F, 0.5F, 1, 1, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 94, 1.0481F, -2.1945F, 0.5F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.4252F, -28.3798F, 2.213F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.829F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 94, -2.2929F, -0.3964F, 0.5F, 3, 1, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 94, 0.2929F, -0.3964F, 0.5F, 2, 1, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.4252F, -28.9329F, 0.6815F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3876F, 0.3614F, 0.7137F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 87, 1.0481F, -2.1945F, -6.5F, 1, 1, 10, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 87, -2.1945F, 1.0481F, -6.5F, 1, 1, 10, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.4252F, -28.9329F, 0.6815F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 87, 0.2929F, -0.3964F, -6.5F, 2, 1, 10, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 87, -2.2929F, -0.3964F, -6.5F, 3, 1, 10, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-10.1323F, -31.6242F, 15.2048F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 90, 9.0F, 7.0F, -10.0F, 2, 1, 7, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 90, 6.4142F, 7.0F, -10.0F, 3, 1, 7, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.7181F, -24.4421F, 13.9384F);
		bone2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.124F, 0.1231F, 0.7777F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 90, -0.5F, -0.5F, -10.0F, 1, 1, 7, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.8677F, -24.4421F, 13.9384F);
		bone2.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.124F, 0.1231F, 0.7777F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 90, -0.5F, -0.5F, -10.0F, 1, 1, 7, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.7181F, -23.8184F, 20.7185F);
		bone2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.124F, 0.1231F, 0.7777F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 32, -0.5F, -0.5F, -10.0F, 1, 1, 20, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.8677F, -23.8184F, 20.7185F);
		bone2.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.124F, 0.1231F, 0.7777F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 86, -0.5F, -0.5F, -10.0F, 1, 1, 20, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-10.1323F, -31.0005F, 21.9849F);
		bone2.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 11, 9.0F, 7.0F, -10.0F, 2, 1, 20, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 82, 48, 6.4142F, 7.0F, -10.0F, 3, 1, 20, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.4252F, -27.7576F, 21.4131F);
		bone2.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 77, -3.0F, 2.0F, -10.0F, 6, 2, 20, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.4252F, -28.2945F, 15.1254F);
		bone2.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 0, -3.0F, -4.9F, -4.0F, 6, 8, 20, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.4252F, -38.4998F, 3.3182F);
		bone2.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 71, -3.0F, 6.0F, 2.9F, 6, 6, 7, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 22, -3.0F, 4.0F, -2.1F, 6, 2, 12, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.4252F, -37.0161F, -3.312F);
		bone2.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.5236F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 75, 37, -3.0F, -0.1F, -1.0F, 6, 5, 12, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.6965F, -22.2674F, 14.5981F);
		stock.addChild(bone3);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0618F, -0.0617F, -0.7835F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 107, 0.6F, -14.9F, -4.0F, 1, 1, 20, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 86, 107, 1.0F, -14.9F, -4.0F, 1, 1, 20, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-7.1217F, -6.0271F, 0.5273F);
		bone3.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 33, 9, -2.0F, -5.9F, -4.0F, 4, 2, 20, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.4645F, -3.5221F, 0.3081F);
		bone3.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.0618F, -0.0617F, -0.7835F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 86, 43, 1.0F, -9.9F, -4.0F, 1, 1, 20, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 107, 1.0F, -9.5F, -4.0F, 1, 1, 20, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.4252F, -38.7736F, 21.5402F);
		stock.addChild(bone4);
		setRotationAngle(bone4, 0.6981F, 0.0F, 0.0F);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(7.1217F, 7.4139F, -27.287F);
		bone4.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0618F, -0.0617F, -0.7835F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 79, 17, 0.6F, -14.9F, 10.0F, 1, 1, 6, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 79, 17, 1.0F, -14.9F, 10.0F, 1, 1, 6, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 1.3868F, -26.7597F);
		bone4.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 79, 17, -2.0F, -5.9F, 10.0F, 4, 2, 6, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(7.5861F, 3.8918F, -26.9789F);
		bone4.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0618F, -0.0617F, -0.7835F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 79, 17, 1.0F, -9.9F, 10.0F, 1, 1, 6, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 79, 17, 1.0F, -9.5F, 10.0F, 1, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}