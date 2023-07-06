package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MinimiStock extends ModelWithAttachments {
	private final ModelRenderer mk48para_stock;
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

	public MinimiStock() {
		textureWidth = 350;
		textureHeight = 350;

		mk48para_stock = new ModelRenderer(this);
		mk48para_stock.setRotationPoint(3.0F, 4.25F, 81.0F);
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 207, 129, -5.499F, -20.35F, -61.002F, 2, 2, 23, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 222, 210, -4.999F, -18.35F, -68.752F, 1, 2, 23, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 207, 129, -4.999F, -16.35F, -68.752F, 1, 2, 23, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 224, 212, -4.999F, -14.35F, -68.752F, 1, 2, 23, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 111, 78, -4.999F, -12.35F, -49.752F, 1, 2, 4, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 113, 80, -4.999F, -10.35F, -47.752F, 1, 2, 2, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 222, 144, -5.499F, -20.35F, -69.002F, 2, 2, 8, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 212, 45, -5.499F, -13.95F, -69.102F, 2, 2, 17, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -9.8F, -70.9F);
		mk48para_stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9076F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 97, -4.999F, -1.6156F, -3.788F, 5, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -9.6F, -70.0F);
		mk48para_stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0349F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 103, -4.499F, -12.0F, 0.0F, 4, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 118, 98, -4.998F, -10.8F, -2.0F, 5, 8, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 93, 29, -4.998F, -11.0F, -1.0F, 5, 9, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 0, -4.999F, -11.0F, 0.0F, 5, 10, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.5F, -13.85F, -69.0F);
		mk48para_stock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -13.85F, -69.0F);
		mk48para_stock.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-7.5F, -16.85F, -69.0F);
		mk48para_stock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -16.85F, -69.0F);
		mk48para_stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-6.001F, -19.85F, -69.001F);
		mk48para_stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -1.0996F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-6.001F, -10.85F, -69.001F);
		mk48para_stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.0996F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.999F, -19.85F, -69.001F);
		mk48para_stock.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.0996F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.999F, -10.85F, -69.001F);
		mk48para_stock.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 212, 45, -2.5F, -12.2322F, 12.0648F, 2, 2, 17, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.599F, -14.45F, -61.502F);
		mk48para_stock.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3316F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.999F, -20.85F, -37.002F);
		mk48para_stock.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 100, 98, -3.0F, 0.0F, -2.0F, 3, 11, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 100, 98, -3.0F, 11.0F, -2.0F, 3, 7, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -9.6F, -70.0F);
		mk48para_stock.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2269F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 130, 64, -5.0F, -1.9744F, -1.225F, 5, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mk48para_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}