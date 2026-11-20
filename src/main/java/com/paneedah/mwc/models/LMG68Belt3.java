package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Belt3 extends ModelWithAttachments {
	private final ModelRenderer belt3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r14;

	public LMG68Belt3() {
		textureWidth = 416;
		textureHeight = 416;

		belt3 = new ModelRenderer(this);
		belt3.setRotationPoint(3.3687F, -10.1594F, -30.5688F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.3F, 0.3F, 0.0F);
		belt3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.7802F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 382, 142, 1.1928F, -1.2589F, -4.15F, 2, 2, 4, -0.5F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 366, 27, 1.1928F, -1.2589F, -1.85F, 2, 2, 7, -0.4F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 382, 45, 1.1928F, -1.2589F, 0.15F, 2, 2, 4, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.059F, 4.0971F, 0.0F);
		belt3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.7366F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 386, 51, -1.2779F, -0.4568F, 0.65F, 2, 1, 3, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.059F, 4.0971F, 0.0F);
		belt3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.9076F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 382, 148, -0.7804F, -0.8243F, -4.15F, 2, 2, 4, -0.5F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 382, 190, -0.7804F, -0.8243F, 0.15F, 2, 2, 4, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 366, 36, -0.7804F, -0.8243F, -1.85F, 2, 2, 7, -0.4F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.441F, 0.0971F, 0.0F);
		belt3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.9076F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 382, 136, -0.7804F, -0.8243F, -4.15F, 2, 2, 4, -0.5F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 366, 9, -0.7804F, -0.8243F, -1.85F, 2, 2, 7, -0.4F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 288, 381, -0.7804F, -0.8243F, 0.15F, 2, 2, 4, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.4864F, -1.928F, 0.0F);
		belt3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.3963F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 382, 130, -0.6637F, -0.8064F, -4.15F, 2, 2, 4, -0.5F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 366, 18, -0.6637F, -0.8064F, -1.85F, 2, 2, 7, -0.4F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 100, 381, -0.6637F, -0.8064F, 0.15F, 2, 2, 4, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.1F, 0.3F, 0.0F);
		belt3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.693F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 196, 385, -0.3184F, -0.9078F, 0.65F, 2, 1, 3, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.441F, 0.0971F, 0.0F);
		belt3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.7366F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 120, 385, -1.2779F, -0.4568F, 0.65F, 2, 1, 3, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.4864F, -1.928F, 0.0F);
		belt3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 1.6581F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 384, 350, -1.375F, -0.6F, 0.65F, 2, 1, 3, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belt3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}