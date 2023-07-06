package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MG36Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r15;
	private final ModelRenderer mag2;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r54;

	public MG36Mag() {
		textureWidth = 220;
		textureHeight = 220;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-0.8249F, -3.218F, -17.884F);
		

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-0.75F, 3.0687F, -1.3137F);
		mag.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.1309F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 17, 200, -2.0F, -3.0F, -1.0F, 4, 7, 5, 0.0F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 34, 190, -2.0F, -3.0568F, -4.9701F, 4, 7, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.75F, 9.2187F, -1.6637F);
		mag.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 200, -9.0F, -7.0F, -1.0F, 18, 6, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 190, -9.0F, -7.0568F, -4.9701F, 18, 6, 4, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6981F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 200, 6.7702F, 1.9899F, -0.75F, 3, 4, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 190, 6.7702F, 1.9331F, -4.7201F, 3, 4, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.6981F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 200, -2.4519F, -14.5979F, -0.75F, 3, 4, 5, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 190, -2.4519F, -14.6547F, -4.7201F, 3, 4, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.6981F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 200, 9.0387F, -4.9561F, -0.75F, 3, 5, 5, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 190, 9.0387F, -5.0129F, -4.7201F, 3, 5, 4, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.9599F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 200, 7.9017F, 4.3164F, -0.75F, 3, 4, 5, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 190, 7.9017F, 4.2596F, -4.7201F, 3, 4, 4, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.9599F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 200, -1.5755F, -14.7331F, -0.75F, 3, 5, 5, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 190, -1.5755F, -14.7899F, -4.7201F, 3, 5, 4, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.9599F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 200, 7.0135F, -2.4478F, -0.75F, 3, 3, 5, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 190, 7.0135F, -2.5046F, -4.7201F, 3, 3, 4, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 200, -7.1926F, -12.9621F, -0.75F, 3, 2, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 190, -7.1926F, -13.0189F, -4.7201F, 3, 2, 4, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.5708F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 200, -7.1926F, 11.0757F, -0.75F, 3, 2, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 190, -7.1926F, 11.0189F, -4.7201F, 3, 2, 4, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 1.5708F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 200, -7.16F, 2.0277F, -0.75F, 3, 6, 5, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 190, -7.16F, 1.9709F, -4.7201F, 3, 6, 4, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 1.5708F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 200, -7.1491F, -8.0176F, -0.75F, 3, 6, 5, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 190, -7.1491F, -8.0744F, -4.7201F, 3, 6, 4, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r13);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 200, -9.0F, -11.5216F, -0.75F, 3, 2, 5, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 190, -9.0F, -11.5784F, -4.7201F, 3, 2, 4, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r14);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 200, 6.0F, -11.5216F, -0.75F, 3, 2, 5, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 190, 6.0F, -11.5784F, -4.7201F, 3, 2, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.9599F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 200, -10.9017F, 4.3164F, -0.75F, 3, 4, 5, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 190, -10.9017F, 4.2596F, -4.7201F, 3, 4, 4, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.9599F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 200, -1.4245F, -14.7331F, -0.75F, 3, 5, 5, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 190, -1.4245F, -14.7899F, -4.7201F, 3, 5, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.9599F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 200, -10.0282F, -2.4459F, -0.75F, 3, 3, 5, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 190, -10.0282F, -2.5027F, -4.7201F, 3, 3, 4, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6981F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 200, -9.7702F, 1.9899F, -0.75F, 3, 4, 5, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 190, -9.7702F, 1.9331F, -4.7201F, 3, 4, 4, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.6981F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 200, -0.5481F, -14.5979F, -0.75F, 3, 3, 5, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 190, -0.5481F, -14.6547F, -4.7201F, 3, 3, 4, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.75F, 7.9687F, -1.9137F);
		mag.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.6981F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 200, -12.0387F, -4.9561F, -0.75F, 3, 5, 5, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 190, -12.0387F, -5.0129F, -4.7201F, 3, 5, 4, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag2);
		setRotationAngle(mag2, 0.0436F, 0.0F, 0.0F);
		

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-0.75F, -2.7046F, -0.567F);
		mag2.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.1309F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 26, 196, -2.0F, -3.0F, -1.0F, 4, 6, 5, 0.001F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-0.75F, -3.1615F, -4.0371F);
		mag2.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.1309F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 29, 195, -2.0F, -3.0F, -1.5F, 4, 6, 4, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}