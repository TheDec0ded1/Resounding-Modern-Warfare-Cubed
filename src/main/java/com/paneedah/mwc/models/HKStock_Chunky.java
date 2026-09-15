package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKStock_Chunky extends ModelBase {
	private final ModelRenderer stockHK;
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
	private final ModelRenderer gun378;
	private final ModelRenderer gun380;
	private final ModelRenderer gun386;
	private final ModelRenderer gun415;
	private final ModelRenderer gun416;
	private final ModelRenderer gun417;
	private final ModelRenderer gun418;
	private final ModelRenderer gun419;
	private final ModelRenderer gun420;
	private final ModelRenderer gun421;
	private final ModelRenderer gun422;
	private final ModelRenderer gun423;
	private final ModelRenderer gun424;
	private final ModelRenderer gun425;
	private final ModelRenderer gun426;
	private final ModelRenderer gun427;
	private final ModelRenderer gun428;
	private final ModelRenderer gun429;
	private final ModelRenderer gun430;
	private final ModelRenderer gun431;
	private final ModelRenderer gun432;
	private final ModelRenderer gun433;
	private final ModelRenderer gun434;
	private final ModelRenderer buttpad;
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

	public HKStock_Chunky() {
		textureWidth = 256;
		textureHeight = 256;

		stockHK = new ModelRenderer(this);
		stockHK.setRotationPoint(-2.0F, -8.7F, 40.0F);
		stockHK.cubeList.add(new ModelBox(stockHK, 42, 126, 0.0F, -7.15F, -25.001F, 1, 1, 20, 0.075F, false));
		stockHK.cubeList.add(new ModelBox(stockHK, 0, 45, -0.5F, -3.15F, -25.001F, 2, 1, 20, 0.075F, false));

		extension_r1 = new ModelRenderer(this);
		extension_r1.setRotationPoint(1.3862F, -6.4737F, -14.501F);
		stockHK.addChild(extension_r1);
		setRotationAngle(extension_r1, 0.0F, 0.0F, 0.3927F);
		extension_r1.cubeList.add(new ModelBox(extension_r1, 0, 108, -0.5F, -0.5F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r2 = new ModelRenderer(this);
		extension_r2.setRotationPoint(-0.3862F, -6.4737F, -14.501F);
		stockHK.addChild(extension_r2);
		setRotationAngle(extension_r2, 0.0F, 0.0F, -0.3927F);
		extension_r2.cubeList.add(new ModelBox(extension_r2, 84, 105, -0.5F, -0.5F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r3 = new ModelRenderer(this);
		extension_r3.setRotationPoint(-0.9259F, -5.1474F, -14.501F);
		stockHK.addChild(extension_r3);
		setRotationAngle(extension_r3, 0.0F, 0.0F, -1.5708F);
		extension_r3.cubeList.add(new ModelBox(extension_r3, 42, 105, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r4 = new ModelRenderer(this);
		extension_r4.setRotationPoint(-0.9029F, -5.263F, -14.501F);
		stockHK.addChild(extension_r4);
		setRotationAngle(extension_r4, 0.0F, 0.0F, -1.1781F);
		extension_r4.cubeList.add(new ModelBox(extension_r4, 90, 42, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r5 = new ModelRenderer(this);
		extension_r5.setRotationPoint(-0.9029F, -5.0319F, -14.501F);
		stockHK.addChild(extension_r5);
		setRotationAngle(extension_r5, 0.0F, 0.0F, -1.9635F);
		extension_r5.cubeList.add(new ModelBox(extension_r5, 88, 63, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r6 = new ModelRenderer(this);
		extension_r6.setRotationPoint(0.5F, -3.7216F, -14.501F);
		stockHK.addChild(extension_r6);
		setRotationAngle(extension_r6, 0.0F, 0.0F, 3.1416F);
		extension_r6.cubeList.add(new ModelBox(extension_r6, 88, 21, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r7 = new ModelRenderer(this);
		extension_r7.setRotationPoint(0.3844F, -3.7445F, -14.501F);
		stockHK.addChild(extension_r7);
		setRotationAngle(extension_r7, 0.0F, 0.0F, -2.7489F);
		extension_r7.cubeList.add(new ModelBox(extension_r7, 88, 0, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r8 = new ModelRenderer(this);
		extension_r8.setRotationPoint(0.6156F, -3.7445F, -14.501F);
		stockHK.addChild(extension_r8);
		setRotationAngle(extension_r8, 0.0F, 0.0F, 2.7489F);
		extension_r8.cubeList.add(new ModelBox(extension_r8, 0, 87, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r9 = new ModelRenderer(this);
		extension_r9.setRotationPoint(1.9259F, -5.1474F, -14.501F);
		stockHK.addChild(extension_r9);
		setRotationAngle(extension_r9, 0.0F, 0.0F, 1.5708F);
		extension_r9.cubeList.add(new ModelBox(extension_r9, 84, 84, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r10 = new ModelRenderer(this);
		extension_r10.setRotationPoint(1.9029F, -5.0319F, -14.501F);
		stockHK.addChild(extension_r10);
		setRotationAngle(extension_r10, 0.0F, 0.0F, 1.9635F);
		extension_r10.cubeList.add(new ModelBox(extension_r10, 42, 84, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r11 = new ModelRenderer(this);
		extension_r11.setRotationPoint(1.9029F, -5.263F, -14.501F);
		stockHK.addChild(extension_r11);
		setRotationAngle(extension_r11, 0.0F, 0.0F, 1.1781F);
		extension_r11.cubeList.add(new ModelBox(extension_r11, 0, 66, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		gun378 = new ModelRenderer(this);
		gun378.setRotationPoint(-1.0F, 6.4F, 2.5F);
		stockHK.addChild(gun378);
		gun378.cubeList.add(new ModelBox(gun378, 214, 35, 0.0F, -7.3F, -24.0F, 3, 1, 6, 0.0F, false));

		gun380 = new ModelRenderer(this);
		gun380.setRotationPoint(-1.0F, 11.6F, 14.0F);
		stockHK.addChild(gun380);
		gun380.cubeList.add(new ModelBox(gun380, 230, 60, 0.0F, -7.3F, -24.0F, 3, 2, 5, 0.0F, false));

		gun386 = new ModelRenderer(this);
		gun386.setRotationPoint(-0.5F, 3.9F, 2.8F);
		stockHK.addChild(gun386);
		gun386.cubeList.add(new ModelBox(gun386, 214, 24, -0.001F, -7.3F, -24.0F, 2, 3, 8, 0.0F, false));

		gun415 = new ModelRenderer(this);
		gun415.setRotationPoint(2.2F, 1.7F, 2.5F);
		stockHK.addChild(gun415);
		setRotationAngle(gun415, 0.0F, 0.0F, 0.6692F);
		gun415.cubeList.add(new ModelBox(gun415, 172, 63, -5.2609F, -6.2183F, -24.399F, 2, 1, 17, 0.0F, false));

		gun416 = new ModelRenderer(this);
		gun416.setRotationPoint(-1.2F, 1.7F, 2.5F);
		stockHK.addChild(gun416);
		setRotationAngle(gun416, 0.0F, 0.0F, -0.6692F);
		gun416.cubeList.add(new ModelBox(gun416, 174, 42, 3.2609F, -6.2183F, -24.399F, 2, 1, 17, 0.0F, false));

		gun417 = new ModelRenderer(this);
		gun417.setRotationPoint(-2.0F, 2.3F, 2.5F);
		stockHK.addChild(gun417);
		gun417.cubeList.add(new ModelBox(gun417, 44, 44, -0.5F, -7.5F, -24.399F, 6, 2, 17, 0.0F, false));

		gun418 = new ModelRenderer(this);
		gun418.setRotationPoint(-2.0F, 4.3F, 2.5F);
		stockHK.addChild(gun418);
		setRotationAngle(gun418, 0.0F, 0.0F, -1.1897F);
		gun418.cubeList.add(new ModelBox(gun418, 42, 189, 6.776F, -3.2537F, -24.399F, 1, 3, 17, 0.0F, false));

		gun419 = new ModelRenderer(this);
		gun419.setRotationPoint(3.0F, 4.3F, 2.5F);
		stockHK.addChild(gun419);
		setRotationAngle(gun419, 0.0F, 0.0F, 1.1897F);
		gun419.cubeList.add(new ModelBox(gun419, 78, 189, -7.776F, -3.2537F, -24.399F, 1, 3, 17, 0.0F, false));

		gun420 = new ModelRenderer(this);
		gun420.setRotationPoint(-2.0F, 2.3F, 2.5F);
		stockHK.addChild(gun420);
		setRotationAngle(gun420, 0.0F, 0.9295F, 0.0F);
		gun420.cubeList.add(new ModelBox(gun420, 164, 238, 19.2523F, -7.5F, -14.997F, 3, 2, 2, 0.0F, false));

		gun421 = new ModelRenderer(this);
		gun421.setRotationPoint(3.0F, 2.3F, 2.5F);
		stockHK.addChild(gun421);
		setRotationAngle(gun421, 0.0F, -0.9295F, 0.0F);
		gun421.cubeList.add(new ModelBox(gun421, 174, 238, -22.2523F, -7.5F, -14.997F, 3, 2, 2, 0.0F, false));

		gun422 = new ModelRenderer(this);
		gun422.setRotationPoint(-0.5F, 6.9F, 2.8F);
		stockHK.addChild(gun422);
		setRotationAngle(gun422, 1.8961F, 0.0F, 0.0F);
		gun422.cubeList.add(new ModelBox(gun422, 184, 238, 0.0F, -20.4082F, 14.5875F, 2, 1, 3, 0.0F, false));

		gun423 = new ModelRenderer(this);
		gun423.setRotationPoint(-1.0F, 6.4F, 8.5F);
		stockHK.addChild(gun423);
		setRotationAngle(gun423, -0.8179F, 0.0F, 0.0F);
		gun423.cubeList.add(new ModelBox(gun423, 184, 204, -0.001F, 12.5217F, -21.737F, 3, 1, 9, 0.0F, false));

		gun424 = new ModelRenderer(this);
		gun424.setRotationPoint(-0.5F, 5.9F, 9.8F);
		stockHK.addChild(gun424);
		setRotationAngle(gun424, -0.8179F, 0.0F, 0.0F);
		gun424.cubeList.add(new ModelBox(gun424, 46, 209, -0.002F, 12.0217F, -21.737F, 2, 2, 9, 0.0F, false));

		gun425 = new ModelRenderer(this);
		gun425.setRotationPoint(-1.0F, 11.6F, 13.0F);
		stockHK.addChild(gun425);
		gun425.cubeList.add(new ModelBox(gun425, 240, 84, 0.0F, -7.3F, -24.0F, 3, 1, 1, 0.0F, false));

		gun426 = new ModelRenderer(this);
		gun426.setRotationPoint(-0.5F, 6.9F, 19.1F);
		stockHK.addChild(gun426);
		setRotationAngle(gun426, -1.7102F, 0.0F, 0.0F);
		gun426.cubeList.add(new ModelBox(gun426, 150, 225, -0.001F, 24.7815F, -5.8943F, 2, 1, 7, 0.0F, false));

		gun427 = new ModelRenderer(this);
		gun427.setRotationPoint(-0.5F, 10.9F, 15.1F);
		stockHK.addChild(gun427);
		gun427.cubeList.add(new ModelBox(gun427, 194, 238, 0.0F, -7.3F, -24.0F, 2, 1, 3, 0.0F, false));

		gun428 = new ModelRenderer(this);
		gun428.setRotationPoint(-0.5F, 8.9F, 13.1F);
		stockHK.addChild(gun428);
		gun428.cubeList.add(new ModelBox(gun428, 130, 232, 0.0F, -7.3F, -24.0F, 2, 1, 5, 0.0F, false));

		gun429 = new ModelRenderer(this);
		gun429.setRotationPoint(-0.5F, 6.9F, 11.1F);
		stockHK.addChild(gun429);
		gun429.cubeList.add(new ModelBox(gun429, 112, 219, 0.0F, -7.3F, -24.0F, 2, 1, 8, 0.0F, false));

		gun430 = new ModelRenderer(this);
		gun430.setRotationPoint(0.0F, 4.9F, 10.1F);
		stockHK.addChild(gun430);
		gun430.cubeList.add(new ModelBox(gun430, 210, 60, 0.0F, -7.3F, -24.0F, 1, 4, 9, 0.0F, false));

		gun431 = new ModelRenderer(this);
		gun431.setRotationPoint(0.0F, 9.9F, 14.1F);
		stockHK.addChild(gun431);
		gun431.cubeList.add(new ModelBox(gun431, 134, 238, 0.0F, -7.3F, -24.0F, 1, 1, 4, 0.0F, false));

		gun432 = new ModelRenderer(this);
		gun432.setRotationPoint(-0.5F, 4.9F, 10.1F);
		stockHK.addChild(gun432);
		gun432.cubeList.add(new ModelBox(gun432, 210, 179, 0.0F, -7.3F, -24.0F, 2, 1, 9, 0.0F, false));

		gun433 = new ModelRenderer(this);
		gun433.setRotationPoint(-0.8F, 5.9F, 9.8F);
		stockHK.addChild(gun433);
		setRotationAngle(gun433, -0.8179F, 0.0F, 0.0F);
		gun433.cubeList.add(new ModelBox(gun433, 114, 189, 0.0F, 12.3217F, -25.737F, 1, 2, 13, 0.0F, false));

		gun434 = new ModelRenderer(this);
		gun434.setRotationPoint(0.8F, 5.9F, 9.8F);
		stockHK.addChild(gun434);
		setRotationAngle(gun434, -0.8179F, 0.0F, 0.0F);
		gun434.cubeList.add(new ModelBox(gun434, 142, 189, 0.0F, 12.3217F, -25.737F, 1, 2, 13, 0.0F, false));

		buttpad = new ModelRenderer(this);
		buttpad.setRotationPoint(2.0F, 32.7F, -40.0F);
		stockHK.addChild(buttpad);
		buttpad.cubeList.add(new ModelBox(buttpad, 60, 242, -4.1935F, -40.3717F, 34.101F, 3, 1, 1, 0.0F, false));
		buttpad.cubeList.add(new ModelBox(buttpad, 68, 242, -1.8065F, -40.3717F, 34.101F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.5215F, -38.1598F, 35.101F);
		buttpad.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.6109F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 180, 215, -1.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5215F, -38.1598F, 35.101F);
		buttpad.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.9599F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 240, 156, -2.0F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.5F, -37.9142F, 35.101F);
		buttpad.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 226, 202, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.5F, -37.9142F, 35.101F);
		buttpad.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 206, 60, 0.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.299F, -37.9119F, 35.9423F);
		buttpad.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.059F, 0.0643F, 0.8271F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 230, 238, -1.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.2743F, -33.9513F, 35.5958F);
		buttpad.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0865F, -0.0114F, -0.1304F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 232, 146, -1.0F, -2.0F, -1.0F, 2, 10, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.5268F, -35.7966F, 35.7572F);
		buttpad.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 240, 148, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 122, 234, 3.0535F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.2743F, -33.9513F, 35.5958F);
		buttpad.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0865F, 0.0114F, 0.1304F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 232, 134, -1.0F, -2.0F, -1.0F, 2, 10, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -38.0F, 35.95F);
		buttpad.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 74, 229, -1.5F, 0.0F, -0.25F, 3, 11, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 192, -1.0F, -2.0F, -1.0F, 2, 14, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.701F, -37.9119F, 35.9423F);
		buttpad.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.059F, -0.0643F, -0.8271F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 220, 238, -2.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockHK.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}