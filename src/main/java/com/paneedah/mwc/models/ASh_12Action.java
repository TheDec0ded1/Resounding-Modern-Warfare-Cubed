package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ASh_12Action extends ModelWithAttachments {
	private final ModelRenderer action;
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

	public ASh_12Action() {
		textureWidth = 512;
		textureHeight = 512;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 203, 122, -3.0F, -40.0F, -21.0F, 2, 1, 28, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 13, 120, -4.7F, -39.95F, -21.3F, 2, 1, 3, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 132, 89, -4.7F, -39.95F, -19.1F, 2, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 120, 92, -3.5F, -39.0F, 8.0F, 2, 3, 4, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 120, 85, -3.5F, -39.0F, 13.5F, 2, 3, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.1073F, -38.0F, 13.2544F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.6109F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 69, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.1073F, -38.0F, 12.2456F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.6109F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 77, 104, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.0989F, -42.4642F, -20.2178F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.5672F, 1.2654F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 144, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.4188F, -40.3072F, -19.0151F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.2618F, 1.2654F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 144, 16, -2.5F, -0.5F, -1.0F, 1, 1, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.5283F, -40.6547F, -19.4237F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.0436F, 1.2654F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 147, -1.5F, -0.5F, -1.0F, 1, 1, 1, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.2789F, -43.0352F, -20.3714F);
		action.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.5708F, 1.2654F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 147, -0.5F, -0.5F, -0.7F, 1, 1, 1, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.347F, -43.251F, -19.9551F);
		action.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, -0.48F, -1.8762F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 147, 37, -1.175F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.2717F, -43.0124F, -20.3674F);
		action.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -1.5708F, 1.2654F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 144, 6, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.9626F, -42.0319F, -18.1658F);
		action.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -1.0908F, 1.2654F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 144, 12, -2.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.7965F, -41.505F, -18.4727F);
		action.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.7418F, 1.2654F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 147, -2.1F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 147, -2.1F, -0.5F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-5.02F, -42.214F, -19.2035F);
		action.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.6109F, 1.2654F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 147, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 147, -0.5F, -0.5F, -1.0F, 1, 1, 1, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.2581F, -39.7975F, -19.4985F);
		action.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.3927F, 1.2654F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 111, 81, -2.2F, -0.5F, -0.2F, 1, 1, 2, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.316F, -39.9812F, -19.8151F);
		action.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.2182F, 1.2654F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 32, -1.6F, -0.5F, -0.2F, 1, 1, 2, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.3937F, -40.2275F, -19.9898F);
		action.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.0436F, 1.2654F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 147, -1.0F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 111, 86, -1.0F, -0.5F, -0.2F, 1, 1, 2, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.5013F, -40.5689F, -19.6543F);
		action.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.2182F, 1.2654F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 111, 89, -1.0F, -0.5F, -1.0F, 1, 1, 2, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-4.466F, -40.457F, -19.7461F);
		action.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.3927F, 1.2654F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 144, 18, -0.5F, -0.5F, -1.0F, 1, 1, 1, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-4.5781F, -40.8124F, -20.124F);
		action.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 1.2654F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 131, 16, 0.1436F, -0.5F, -1.076F, 1, 1, 3, -0.2F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 145, 0.7436F, -0.5F, -1.076F, 1, 1, 1, -0.2F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 145, 0.7436F, -0.5F, 0.924F, 1, 1, 1, -0.2F, false));
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