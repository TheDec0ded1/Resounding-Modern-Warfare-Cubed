package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKStock_CheekRiser extends ModelBase {
	private final ModelRenderer stockHKCheekRiser;
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
	private final ModelRenderer extension_r12;
	private final ModelRenderer gun2;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final ModelRenderer gun37;
	private final ModelRenderer gun38;
	private final ModelRenderer gun39;
	private final ModelRenderer gun40;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;
	private final ModelRenderer gun43;
	private final ModelRenderer gun44;
	private final ModelRenderer gun45;
	private final ModelRenderer gun46;
	private final ModelRenderer gun47;
	private final ModelRenderer buttpad3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public HKStock_CheekRiser() {
		textureWidth = 256;
		textureHeight = 256;

		stockHKCheekRiser = new ModelRenderer(this);
		stockHKCheekRiser.setRotationPoint(-2.0F, -8.7F, 40.0F);
		stockHKCheekRiser.cubeList.add(new ModelBox(stockHKCheekRiser, 172, 0, 0.0F, -7.15F, -25.001F, 1, 1, 20, 0.075F, false));
		stockHKCheekRiser.cubeList.add(new ModelBox(stockHKCheekRiser, 44, 0, -0.5F, -4.15F, -25.001F, 2, 2, 20, 0.075F, false));

		extension_r1 = new ModelRenderer(this);
		extension_r1.setRotationPoint(1.3862F, -6.4737F, -14.501F);
		stockHKCheekRiser.addChild(extension_r1);
		setRotationAngle(extension_r1, 0.0F, 0.0F, 0.3927F);
		extension_r1.cubeList.add(new ModelBox(extension_r1, 0, 171, -0.5F, -0.5F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r2 = new ModelRenderer(this);
		extension_r2.setRotationPoint(-0.3862F, -6.4737F, -14.501F);
		stockHKCheekRiser.addChild(extension_r2);
		setRotationAngle(extension_r2, 0.0F, 0.0F, -0.3927F);
		extension_r2.cubeList.add(new ModelBox(extension_r2, 168, 168, -0.5F, -0.5F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r3 = new ModelRenderer(this);
		extension_r3.setRotationPoint(-0.9259F, -5.1474F, -14.501F);
		stockHKCheekRiser.addChild(extension_r3);
		setRotationAngle(extension_r3, 0.0F, 0.0F, -1.5708F);
		extension_r3.cubeList.add(new ModelBox(extension_r3, 168, 147, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r4 = new ModelRenderer(this);
		extension_r4.setRotationPoint(-0.9029F, -5.263F, -14.501F);
		stockHKCheekRiser.addChild(extension_r4);
		setRotationAngle(extension_r4, 0.0F, 0.0F, -1.1781F);
		extension_r4.cubeList.add(new ModelBox(extension_r4, 168, 126, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r5 = new ModelRenderer(this);
		extension_r5.setRotationPoint(-0.9029F, -5.0319F, -14.501F);
		stockHKCheekRiser.addChild(extension_r5);
		setRotationAngle(extension_r5, 0.0F, 0.0F, -1.9635F);
		extension_r5.cubeList.add(new ModelBox(extension_r5, 126, 168, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r6 = new ModelRenderer(this);
		extension_r6.setRotationPoint(0.5F, -3.7216F, -14.501F);
		stockHKCheekRiser.addChild(extension_r6);
		setRotationAngle(extension_r6, 0.0F, 0.0F, 3.1416F);
		extension_r6.cubeList.add(new ModelBox(extension_r6, 168, 105, -0.5F, -0.5766F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r7 = new ModelRenderer(this);
		extension_r7.setRotationPoint(0.3844F, -3.7445F, -14.501F);
		stockHKCheekRiser.addChild(extension_r7);
		setRotationAngle(extension_r7, 0.0F, 0.0F, -2.7489F);
		extension_r7.cubeList.add(new ModelBox(extension_r7, 168, 84, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r8 = new ModelRenderer(this);
		extension_r8.setRotationPoint(0.6156F, -3.7445F, -14.501F);
		stockHKCheekRiser.addChild(extension_r8);
		setRotationAngle(extension_r8, 0.0F, 0.0F, 2.7489F);
		extension_r8.cubeList.add(new ModelBox(extension_r8, 84, 168, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r9 = new ModelRenderer(this);
		extension_r9.setRotationPoint(1.7509F, -5.4724F, -14.826F);
		stockHKCheekRiser.addChild(extension_r9);
		setRotationAngle(extension_r9, 0.0F, 0.0F, 1.5708F);
		extension_r9.cubeList.add(new ModelBox(extension_r9, 0, 0, 1.35F, -1.2766F, -10.5F, 1, 2, 21, -0.25F, false));
		extension_r9.cubeList.add(new ModelBox(extension_r9, 44, 22, -0.5F, -1.2766F, -10.5F, 1, 1, 21, -0.25F, false));

		extension_r10 = new ModelRenderer(this);
		extension_r10.setRotationPoint(1.9259F, -5.1474F, -14.501F);
		stockHKCheekRiser.addChild(extension_r10);
		setRotationAngle(extension_r10, 0.0F, 0.0F, 1.5708F);
		extension_r10.cubeList.add(new ModelBox(extension_r10, 44, 63, -0.5F, -0.5766F, -10.5F, 2, 1, 20, 0.075F, false));

		extension_r11 = new ModelRenderer(this);
		extension_r11.setRotationPoint(1.9029F, -5.0319F, -14.501F);
		stockHKCheekRiser.addChild(extension_r11);
		setRotationAngle(extension_r11, 0.0F, 0.0F, 1.9635F);
		extension_r11.cubeList.add(new ModelBox(extension_r11, 172, 21, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));
		extension_r11.cubeList.add(new ModelBox(extension_r11, 42, 168, 0.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		extension_r12 = new ModelRenderer(this);
		extension_r12.setRotationPoint(1.9029F, -5.263F, -14.501F);
		stockHKCheekRiser.addChild(extension_r12);
		setRotationAngle(extension_r12, 0.0F, 0.0F, 1.1781F);
		extension_r12.cubeList.add(new ModelBox(extension_r12, 0, 150, -1.2413F, -0.7241F, -10.5F, 1, 1, 20, 0.075F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-1.0F, 6.4F, 2.5F);
		stockHKCheekRiser.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 226, 189, 0.0F, -7.3F, -24.0F, 3, 1, 6, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-1.0F, 11.6F, 14.0F);
		stockHKCheekRiser.addChild(gun26);
		gun26.cubeList.add(new ModelBox(gun26, 230, 87, 0.0F, -7.3F, -24.0F, 3, 2, 5, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-0.5F, 3.9F, 2.8F);
		stockHKCheekRiser.addChild(gun27);
		gun27.cubeList.add(new ModelBox(gun27, 204, 214, -0.001F, -7.3F, -24.0F, 2, 3, 8, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(2.2F, 1.7F, 2.5F);
		stockHKCheekRiser.addChild(gun28);
		setRotationAngle(gun28, 0.0F, 0.0F, 0.6692F);
		

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-1.2F, 1.7F, 2.5F);
		stockHKCheekRiser.addChild(gun29);
		setRotationAngle(gun29, 0.0F, 0.0F, -0.6692F);
		

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-2.0F, 2.3F, 2.5F);
		stockHKCheekRiser.addChild(gun30);
		

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-2.0F, 4.3F, 2.5F);
		stockHKCheekRiser.addChild(gun31);
		setRotationAngle(gun31, 0.0F, 0.0F, -1.1897F);
		

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(3.0F, 4.3F, 2.5F);
		stockHKCheekRiser.addChild(gun32);
		setRotationAngle(gun32, 0.0F, 0.0F, 1.1897F);
		

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-2.0F, 2.3F, 2.5F);
		stockHKCheekRiser.addChild(gun33);
		setRotationAngle(gun33, 0.0F, 0.9295F, 0.0F);
		

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(3.0F, 2.3F, 2.5F);
		stockHKCheekRiser.addChild(gun34);
		setRotationAngle(gun34, 0.0F, -0.9295F, 0.0F);
		

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.5F, 6.9F, 2.8F);
		stockHKCheekRiser.addChild(gun35);
		setRotationAngle(gun35, 1.8961F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 240, 134, 0.0F, -20.4082F, 14.5875F, 2, 1, 3, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-1.0F, 6.4F, 8.5F);
		stockHKCheekRiser.addChild(gun36);
		setRotationAngle(gun36, -0.8179F, 0.0F, 0.0F);
		gun36.cubeList.add(new ModelBox(gun36, 208, 204, -0.001F, 12.5217F, -21.737F, 3, 1, 9, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-0.5F, 5.9F, 9.8F);
		stockHKCheekRiser.addChild(gun37);
		setRotationAngle(gun37, -0.8179F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 90, 209, -0.002F, 12.0217F, -21.737F, 2, 2, 9, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-1.0F, 11.6F, 13.0F);
		stockHKCheekRiser.addChild(gun38);
		gun38.cubeList.add(new ModelBox(gun38, 242, 124, 0.0F, -7.3F, -24.0F, 3, 1, 1, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-0.5F, 6.9F, 19.1F);
		stockHKCheekRiser.addChild(gun39);
		setRotationAngle(gun39, -1.7102F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 186, 225, -0.001F, 24.7815F, -5.8943F, 2, 1, 7, 0.0F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-0.5F, 10.9F, 15.1F);
		stockHKCheekRiser.addChild(gun40);
		gun40.cubeList.add(new ModelBox(gun40, 240, 138, 0.0F, -7.3F, -24.0F, 2, 1, 3, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-0.5F, 8.9F, 13.1F);
		stockHKCheekRiser.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 232, 178, 0.0F, -7.3F, -24.0F, 2, 1, 5, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-0.5F, 6.9F, 11.1F);
		stockHKCheekRiser.addChild(gun42);
		gun42.cubeList.add(new ModelBox(gun42, 66, 220, 0.0F, -7.3F, -24.0F, 2, 1, 8, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(0.0F, 4.9F, 10.1F);
		stockHKCheekRiser.addChild(gun43);
		gun43.cubeList.add(new ModelBox(gun43, 210, 86, 0.0F, -7.3F, -24.0F, 1, 4, 9, 0.0F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(0.0F, 9.9F, 14.1F);
		stockHKCheekRiser.addChild(gun44);
		gun44.cubeList.add(new ModelBox(gun44, 154, 238, 0.0F, -7.3F, -24.0F, 1, 1, 4, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-0.5F, 4.9F, 10.1F);
		stockHKCheekRiser.addChild(gun45);
		gun45.cubeList.add(new ModelBox(gun45, 214, 14, 0.0F, -7.3F, -24.0F, 2, 1, 9, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-0.8F, 5.9F, 9.8F);
		stockHKCheekRiser.addChild(gun46);
		setRotationAngle(gun46, -0.8179F, 0.0F, 0.0F);
		gun46.cubeList.add(new ModelBox(gun46, 198, 189, 0.0F, 12.3217F, -25.737F, 1, 2, 13, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(0.8F, 5.9F, 9.8F);
		stockHKCheekRiser.addChild(gun47);
		setRotationAngle(gun47, -0.8179F, 0.0F, 0.0F);
		gun47.cubeList.add(new ModelBox(gun47, 114, 204, 0.0F, 12.3217F, -25.737F, 1, 2, 13, 0.0F, false));

		buttpad3 = new ModelRenderer(this);
		buttpad3.setRotationPoint(2.0F, 32.7F, -40.0F);
		stockHKCheekRiser.addChild(buttpad3);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.299F, -37.9119F, 35.9423F);
		buttpad3.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.059F, 0.0643F, 0.8271F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 242, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6807F, -34.6331F, 35.6554F);
		buttpad3.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0869F, -0.0076F, -0.0869F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 233, -1.0F, -2.0F, -1.0F, 2, 10, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.8512F, -36.5311F, 35.8215F);
		buttpad3.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 242, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 242, 1.7024F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.3193F, -34.6331F, 35.6554F);
		buttpad3.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0869F, 0.0076F, 0.0869F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 212, 232, -1.0F, -2.0F, -1.0F, 2, 10, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -38.0F, 35.95F);
		buttpad3.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 221, -1.0F, -2.0F, -0.999F, 2, 14, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.701F, -37.9119F, 35.9423F);
		buttpad3.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.059F, -0.0643F, -0.8271F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 240, 238, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0315F, -6.0648F, -18.5F);
		stockHKCheekRiser.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 160, 204, -1.5315F, -2.7352F, -5.0F, 2, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 209, -3.5452F, -0.7215F, -5.0F, 1, 2, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 234, 40, 1.4822F, -0.7215F, 1.0F, 1, 5, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 112, 234, 1.4822F, -0.7215F, -5.0F, 1, 5, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 242, 0.8822F, 0.5035F, -1.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 170, 242, 1.4822F, -0.7215F, -1.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 160, 215, 1.4822F, 4.2785F, -4.5F, 1, 1, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 217, -3.5452F, 1.2785F, -4.5F, 1, 1, 9, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.367F, -0.8008F, 4.0F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 210, 154, 0.0F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.7459F, -1.999F, 4.0F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 210, 143, -1.0F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.9304F, -2.5439F, 4.0F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.1781F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 210, 132, -1.0F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.7005F, -1.4541F, 4.0F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.1781F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 210, 110, -1.0F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.1018F, -1.999F, 4.0F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 210, 121, -1.0F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.264F, -1.8906F, 4.0F);
		bone.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 210, 99, 0.0F, -0.5F, -9.0F, 1, 1, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockHKCheekRiser.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}