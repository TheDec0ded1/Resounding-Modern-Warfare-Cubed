package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ97NSRAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer handle;
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

	public QBZ97NSRAction() {
		textureWidth = 432;
		textureHeight = 432;

		action = new ModelRenderer(this);
		action.setRotationPoint(-1.6684F, -12.9886F, -9.84F);
		action.cubeList.add(new ModelBox(action, 392, 76, -1.2153F, -2.3404F, 22.24F, 2, 3, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 248, -0.3316F, -1.9428F, -9.46F, 1, 1, 32, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 201, 276, 0.0926F, -1.5185F, -9.46F, 1, 1, 32, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 268, 276, -0.7559F, -1.5185F, -9.46F, 1, 1, 32, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 134, 282, -0.3316F, -1.0943F, -9.46F, 1, 1, 32, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5755F, -0.7185F, -23.46F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 282, -1.0F, -1.0F, 14.0F, 1, 1, 32, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.1755F, -0.7185F, -23.46F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 282, -1.0F, -1.0F, 14.0F, 1, 1, 32, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.2145F, -1.4014F, -21.16F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 134, 248, -0.5F, -0.3828F, 11.7F, 1, 1, 32, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.1755F, -1.3185F, -23.46F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 67, 248, -1.0F, -1.0F, 14.0F, 1, 1, 32, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.7316F, 0.9886F, 22.64F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 392, 119, -1.0F, -1.0F, -0.4F, 2, 2, 8, 0.0F, false));

		handle = new ModelRenderer(this);
		handle.setRotationPoint(2.725F, -3.2332F, -5.3705F);
		action.addChild(handle);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 413, 74, -0.75F, -0.6608F, 0.2399F, 2, 1, 1, -0.2F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 413, 100, -0.65F, -1.1436F, 0.2571F, 2, 1, 1, -0.4F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 359, 414, -0.65F, -1.1436F, 0.2228F, 2, 1, 1, -0.4F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 420, 278, -0.85F, -1.1436F, 0.2228F, 1, 1, 1, -0.4F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 418, 219, -0.85F, -1.1436F, 0.2571F, 1, 1, 1, -0.4F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 289, 411, -0.75F, -0.7608F, 0.0399F, 2, 3, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 140, 411, -0.75F, -0.7608F, 0.4399F, 2, 3, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 415, 86, -0.75F, -1.7573F, -0.1859F, 2, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 126, 411, -0.75F, -2.0073F, -0.9859F, 2, 4, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 133, 411, -0.75F, -2.0073F, -0.5859F, 2, 4, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 294, 401, -0.75F, -1.308F, -1.1396F, 2, 2, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 413, 65, -0.75F, -2.1332F, -1.4399F, 2, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 117, 411, -0.75F, -2.1332F, -1.0399F, 2, 1, 2, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 303, 411, -0.25F, -1.1608F, -0.4601F, 1, 2, 2, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 97, 405, -0.75F, 0.6332F, -1.5295F, 2, 3, 3, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.7854F, 0.0F, 1.5708F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 413, 83, -0.75F, -0.2197F, 0.4319F, 2, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 352, 414, -0.75F, -0.3854F, 0.2662F, 2, 1, 1, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.6545F, 0.0F, 1.5708F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 415, -0.75F, 0.8045F, -0.6733F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 410, 414, -0.75F, 0.6545F, -0.6733F, 2, 1, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3054F, 0.0F, 1.5708F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 324, 411, -0.75F, 0.2061F, -1.0014F, 2, 2, 1, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3491F, 0.0F, 1.5708F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 68, 415, -0.75F, -1.7976F, -0.7683F, 2, 1, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.6981F, 0.0F, 1.5708F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 61, 415, -0.75F, -2.1306F, -0.252F, 2, 1, 1, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.9599F, 0.0F, 1.5708F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 405, 336, -0.75F, -0.8108F, -0.8198F, 2, 1, 3, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.5236F, 0.0F, 1.5708F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 413, 54, -0.25F, -1.195F, -0.0427F, 1, 1, 2, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1309F, 0.0F, 1.5708F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 413, 58, -0.25F, -1.3916F, -0.3583F, 1, 1, 2, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1745F, 0.0F, 1.5708F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 296, 411, -0.25F, 0.0157F, -0.3853F, 1, 2, 2, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.1F, 1.4F, 0.0F);
		handle.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 1.5708F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 394, 336, -0.75F, 1.6332F, -1.5295F, 2, 2, 3, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}