package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKStock_Slimline extends ModelBase {
	private final ModelRenderer stockHKSlimline;
	private final ModelRenderer extension_r1;
	private final ModelRenderer extension_r2;
	private final ModelRenderer extension_r3;
	private final ModelRenderer extension_r4;
	private final ModelRenderer extension_r5;
	private final ModelRenderer extension_r6;
	private final ModelRenderer extension_r7;
	private final ModelRenderer extension_r8;
	private final ModelRenderer extension_r9;
	private final ModelRenderer extension_r10;
	private final ModelRenderer extension_r11;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
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
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer buttpad2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public HKStock_Slimline() {
		textureWidth = 256;
		textureHeight = 256;

		stockHKSlimline = new ModelRenderer(this);
		stockHKSlimline.setRotationPoint(-2.0F, -8.7F, 40.0F);
		stockHKSlimline.cubeList.add(new ModelBox(stockHKSlimline, 126, 147, 0.0F, -7.15F, -25.001F, 1, 1, 20, 0.075F, false));
		stockHKSlimline.cubeList.add(new ModelBox(stockHKSlimline, 0, 23, -0.5F, -4.15F, -25.001F, 2, 2, 20, 0.075F, false));

		extension_r1 = new ModelRenderer(this);
		extension_r1.setRotationPoint(1.3862F, -6.4737F, -14.501F);
		stockHKSlimline.addChild(extension_r1);
		setRotationAngle(extension_r1, 0.0F, 0.0F, 0.3927F);
		extension_r1.cubeList.add(new ModelBox(extension_r1, 84, 147, -0.5F, -0.5F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r2 = new ModelRenderer(this);
		extension_r2.setRotationPoint(-0.3862F, -6.4737F, -14.501F);
		stockHKSlimline.addChild(extension_r2);
		setRotationAngle(extension_r2, 0.0F, 0.0F, -0.3927F);
		extension_r2.cubeList.add(new ModelBox(extension_r2, 42, 147, -0.5F, -0.5F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r3 = new ModelRenderer(this);
		extension_r3.setRotationPoint(-0.9259F, -5.1474F, -14.501F);
		stockHKSlimline.addChild(extension_r3);
		setRotationAngle(extension_r3, 0.0F, 0.0F, -1.5708F);
		extension_r3.cubeList.add(new ModelBox(extension_r3, 132, 42, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r4 = new ModelRenderer(this);
		extension_r4.setRotationPoint(-0.9029F, -5.263F, -14.501F);
		stockHKSlimline.addChild(extension_r4);
		setRotationAngle(extension_r4, 0.0F, 0.0F, -1.1781F);
		extension_r4.cubeList.add(new ModelBox(extension_r4, 130, 63, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r5 = new ModelRenderer(this);
		extension_r5.setRotationPoint(-0.9029F, -5.0319F, -14.501F);
		stockHKSlimline.addChild(extension_r5);
		setRotationAngle(extension_r5, 0.0F, 0.0F, -1.9635F);
		extension_r5.cubeList.add(new ModelBox(extension_r5, 130, 21, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r6 = new ModelRenderer(this);
		extension_r6.setRotationPoint(0.5F, -3.7216F, -14.501F);
		stockHKSlimline.addChild(extension_r6);
		setRotationAngle(extension_r6, 0.0F, 0.0F, 3.1416F);
		extension_r6.cubeList.add(new ModelBox(extension_r6, 130, 0, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r7 = new ModelRenderer(this);
		extension_r7.setRotationPoint(0.3844F, -3.7445F, -14.501F);
		stockHKSlimline.addChild(extension_r7);
		setRotationAngle(extension_r7, 0.0F, 0.0F, -2.7489F);
		extension_r7.cubeList.add(new ModelBox(extension_r7, 0, 129, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r8 = new ModelRenderer(this);
		extension_r8.setRotationPoint(0.6156F, -3.7445F, -14.501F);
		stockHKSlimline.addChild(extension_r8);
		setRotationAngle(extension_r8, 0.0F, 0.0F, 2.7489F);
		extension_r8.cubeList.add(new ModelBox(extension_r8, 126, 126, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r9 = new ModelRenderer(this);
		extension_r9.setRotationPoint(1.9259F, -5.1474F, -14.501F);
		stockHKSlimline.addChild(extension_r9);
		setRotationAngle(extension_r9, 0.0F, 0.0F, 1.5708F);
		extension_r9.cubeList.add(new ModelBox(extension_r9, 126, 105, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r10 = new ModelRenderer(this);
		extension_r10.setRotationPoint(1.9029F, -5.0319F, -14.501F);
		stockHKSlimline.addChild(extension_r10);
		setRotationAngle(extension_r10, 0.0F, 0.0F, 1.9635F);
		extension_r10.cubeList.add(new ModelBox(extension_r10, 126, 84, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r11 = new ModelRenderer(this);
		extension_r11.setRotationPoint(1.9029F, -5.263F, -14.501F);
		stockHKSlimline.addChild(extension_r11);
		setRotationAngle(extension_r11, 0.0F, 0.0F, 1.1781F);
		extension_r11.cubeList.add(new ModelBox(extension_r11, 84, 126, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-1.0F, 6.4F, 2.5F);
		stockHKSlimline.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 204, 225, 0.0F, -7.3F, -24.0F, 3, 1, 6, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-1.0F, 11.6F, 14.0F);
		stockHKSlimline.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 230, 67, 0.0F, -7.3F, -24.0F, 3, 2, 5, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-0.5F, 3.9F, 2.8F);
		stockHKSlimline.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 184, 214, -0.001F, -7.3F, -24.0F, 2, 3, 8, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(2.2F, 1.7F, 2.5F);
		stockHKSlimline.addChild(gun6);
		setRotationAngle(gun6, 0.0F, 0.0F, 0.6692F);
		

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-1.2F, 1.7F, 2.5F);
		stockHKSlimline.addChild(gun7);
		setRotationAngle(gun7, 0.0F, 0.0F, -0.6692F);
		

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-2.0F, 2.3F, 2.5F);
		stockHKSlimline.addChild(gun8);
		

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-2.0F, 4.3F, 2.5F);
		stockHKSlimline.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 0.0F, -1.1897F);
		

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(3.0F, 4.3F, 2.5F);
		stockHKSlimline.addChild(gun10);
		setRotationAngle(gun10, 0.0F, 0.0F, 1.1897F);
		

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-2.0F, 2.3F, 2.5F);
		stockHKSlimline.addChild(gun11);
		setRotationAngle(gun11, 0.0F, 0.9295F, 0.0F);
		

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(3.0F, 2.3F, 2.5F);
		stockHKSlimline.addChild(gun12);
		setRotationAngle(gun12, 0.0F, -0.9295F, 0.0F);
		

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-0.5F, 6.9F, 2.8F);
		stockHKSlimline.addChild(gun13);
		setRotationAngle(gun13, 1.8961F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 8, 240, 0.0F, -20.4082F, 14.5875F, 2, 1, 3, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-1.0F, 6.4F, 8.5F);
		stockHKSlimline.addChild(gun14);
		setRotationAngle(gun14, -0.8179F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 0, 207, -0.001F, 12.5217F, -21.737F, 3, 1, 9, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-0.5F, 5.9F, 9.8F);
		stockHKSlimline.addChild(gun15);
		setRotationAngle(gun15, -0.8179F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 68, 209, -0.002F, 12.0217F, -21.737F, 2, 2, 9, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-1.0F, 11.6F, 13.0F);
		stockHKSlimline.addChild(gun16);
		gun16.cubeList.add(new ModelBox(gun16, 76, 242, 0.0F, -7.3F, -24.0F, 3, 1, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-0.5F, 6.9F, 19.1F);
		stockHKSlimline.addChild(gun17);
		setRotationAngle(gun17, -1.7102F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 168, 225, -0.001F, 24.7815F, -5.8943F, 2, 1, 7, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-0.5F, 10.9F, 15.1F);
		stockHKSlimline.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 240, 74, 0.0F, -7.3F, -24.0F, 2, 1, 3, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-0.5F, 8.9F, 13.1F);
		stockHKSlimline.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 232, 158, 0.0F, -7.3F, -24.0F, 2, 1, 5, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.5F, 6.9F, 11.1F);
		stockHKSlimline.addChild(gun20);
		gun20.cubeList.add(new ModelBox(gun20, 46, 220, 0.0F, -7.3F, -24.0F, 2, 1, 8, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(0.0F, 4.9F, 10.1F);
		stockHKSlimline.addChild(gun21);
		gun21.cubeList.add(new ModelBox(gun21, 210, 73, 0.0F, -7.3F, -24.0F, 1, 4, 9, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(0.0F, 9.9F, 14.1F);
		stockHKSlimline.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 144, 238, 0.0F, -7.3F, -24.0F, 1, 1, 4, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-0.5F, 4.9F, 10.1F);
		stockHKSlimline.addChild(gun23);
		gun23.cubeList.add(new ModelBox(gun23, 212, 42, 0.0F, -7.3F, -24.0F, 2, 1, 9, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-0.8F, 5.9F, 9.8F);
		stockHKSlimline.addChild(gun24);
		setRotationAngle(gun24, -0.8179F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 170, 189, 0.0F, 12.3217F, -25.737F, 1, 2, 13, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(0.8F, 5.9F, 9.8F);
		stockHKSlimline.addChild(gun25);
		setRotationAngle(gun25, -0.8179F, 0.0F, 0.0F);
		gun25.cubeList.add(new ModelBox(gun25, 0, 192, 0.0F, 12.3217F, -25.737F, 1, 2, 13, 0.0F, false));

		buttpad2 = new ModelRenderer(this);
		buttpad2.setRotationPoint(2.0F, 32.7F, -40.0F);
		stockHKSlimline.addChild(buttpad2);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.299F, -37.9119F, 35.9423F);
		buttpad2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.059F, 0.0643F, 0.8271F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 240, 210, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6807F, -34.6331F, 35.6554F);
		buttpad2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0869F, -0.0076F, -0.0869F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 204, 232, -1.0F, -2.0F, -1.0F, 2, 10, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.8512F, -36.5311F, 35.8215F);
		buttpad2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 240, 206, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 240, 202, 1.7024F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.3193F, -34.6331F, 35.6554F);
		buttpad2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0869F, 0.0076F, 0.0869F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 232, 202, -1.0F, -2.0F, -1.0F, 2, 10, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -38.0F, 35.95F);
		buttpad2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 104, 220, -1.0F, -2.0F, -0.999F, 2, 14, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.701F, -37.9119F, 35.9423F);
		buttpad2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.059F, -0.0643F, -0.8271F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 240, 152, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockHKSlimline.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}