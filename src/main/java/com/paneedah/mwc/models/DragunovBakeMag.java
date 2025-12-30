package com.paneedah.mwc.models;


import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DragunovBakeMag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r104_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r103_r1;

	public DragunovBakeMag() {
		textureWidth = 350;
		textureHeight = 350;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-1.0F, 0.0F, -36.0F);
		mag.cubeList.add(new ModelBox(mag, 119, 121, -1.8F, -9.5F, 4.5F, 3, 3, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 127, 123, -2.2F, -9.5F, 4.5F, 1, 3, 7, 0.001F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-0.5F, -1.2F, 12.8F);
		mag.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.1571F, 0.0F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 19, 50, -1.5F, 0.0F, -8.0F, 3, 4, 6, 0.001F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0526F, -0.1046F, -0.0055F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 57, 39, 0.0F, -1.0F, -1.0F, 1, 7, 1, 0.002F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 98, 62, 0.0F, -1.0F, -4.0F, 1, 6, 2, 0.002F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-2.0F, -1.5F, 4.75F);
		mag.addChild(cube_r103);
		setRotationAngle(cube_r103, -0.1579F, -0.1034F, 0.0164F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 89, 64, 0.0F, 0.0F, -1.0F, 1, 3, 1, 0.001F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 66, 44, 0.0F, 0.0F, -4.0F, 1, 3, 2, 0.001F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(1.0F, -1.5F, 4.75F);
		mag.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.1579F, 0.1034F, -0.0164F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 97, 90, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.001F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 41, 80, -1.0F, 0.0F, -4.0F, 1, 3, 2, 0.001F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0526F, 0.1046F, 0.0055F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 57, 57, -1.0F, -1.0F, -1.0F, 1, 7, 1, 0.002F, false));
		cube_r105.cubeList.add(new ModelBox(cube_r105, 89, 43, -1.0F, -1.0F, -4.0F, 1, 6, 2, 0.002F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-0.5F, -11.2F, 13.3F);
		mag.addChild(cube_r106);
		setRotationAngle(cube_r106, -0.3054F, 0.0F, 0.0F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 87, 80, -1.0F, 14.8153F, 1.3468F, 2, 8, 1, 0.001F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-0.5F, -7.0F, 1.1F);
		mag.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.3142F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 119, 79, -1.0F, 7.4125F, 1.7924F, 2, 5, 4, 0.2F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 186, 155, -1.0F, 7.4125F, 10.2924F, 2, 5, 2, 0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, -7.0F, 1.1F);
		mag.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 87, 69, -1.0F, 0.0F, 1.5F, 2, 10, 2, 0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 208, 150, -1.0F, 0.0F, 8.0F, 2, 10, 2, 0.2F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(1.1F, -1.1F, 5.2F);
		mag.addChild(cube_r108);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.1F, 5.9F, 5.2F);
		mag.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2094F, 0.0F, 0.0F);
		

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.1F, -5.0F, 4.4F);
		mag.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.0873F, 0.0F, 0.0F);
		

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(1.1F, -1.1F, 5.2F);
		mag.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0349F, 0.0F, 0.0F);
		

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(1.1F, -0.7F, 4.4F);
		mag.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0175F, 0.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.1F, 2.3F, 4.4F);
		mag.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
		

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(1.1F, -0.9F, 8.1F);
		mag.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0349F, 0.0F, 0.0F);
		

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(0.0F, -6.5F, -0.5F);
		mag.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.0524F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 53, 47, -2.0F, 0.0F, 5.0F, 3, 6, 6, 0.002F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 41, 33, -1.5F, 0.0F, 0.5F, 2, 6, 1, 0.0F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 63, 57, -2.0F, 0.0F, 11.0F, 3, 6, 1, 0.002F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -6.5F, -0.5F);
		mag.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3142F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 128, 47, -2.0F, 5.4221F, 7.1174F, 3, 6, 6, 0.002F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 33, -1.5F, 5.4221F, 2.6174F, 2, 6, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 57, -2.0F, 5.4221F, 13.1174F, 3, 6, 1, 0.002F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-2.25F, -6.6F, 3.9F);
		mag.addChild(cube_r114);
		setRotationAngle(cube_r114, -0.3054F, -0.1034F, 0.0164F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 146, 115, 0.2447F, 14.5154F, -1.6667F, 1, 1, 4, 0.001F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(1.25F, -6.6F, 3.9F);
		mag.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.3054F, 0.1034F, -0.0164F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 110, 142, -1.2447F, 14.5154F, -1.6667F, 1, 1, 4, 0.001F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0701F, -0.1046F, -0.0055F);
		

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.1574F, -0.1046F, -0.0055F);
		

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0003F, -0.1046F, -0.0055F);
		

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r119);
		setRotationAngle(cube_r119, -0.176F, -0.1015F, 0.0118F);
		

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.176F, 0.1015F, -0.0118F);
		

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0701F, 0.1046F, 0.0055F);
		

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0003F, 0.1046F, 0.0055F);
		

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.1574F, 0.1046F, 0.0055F);
		

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(0.5F, -4.1F, 13.0F);
		mag.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.1745F, 0.0F, 0.0F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 127, 124, -2.0F, -2.0F, -1.0F, 2, 2, 2, -0.2F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-0.5F, -6.5F, -0.7F);
		mag.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0524F, 0.0F, 0.0F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 145, 60, -1.0F, -2.0F, 12.0F, 2, 8, 1, 0.002F, false));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(1.1F, -5.5F, 1.5F);
		mag.addChild(cube_r126);
		setRotationAngle(cube_r126, -0.9604F, 0.0386F, 0.0057F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 57, 72, -1.06F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(1.0F, -5.5F, 1.5F);
		mag.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.0F, 0.0524F, 0.0F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 99, 38, -1.95F, -1.0F, -2.0F, 2, 1, 2, 0.001F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(-2.5F, -6.8F, 2.7F);
		mag.addChild(cube_r128);
		setRotationAngle(cube_r128, -0.0349F, -0.0524F, 0.0F);
		

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(1.5F, -6.8F, 2.7F);
		mag.addChild(cube_r129);
		setRotationAngle(cube_r129, -0.0349F, 0.0524F, 0.0F);
		

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(1.2F, -8.5F, 4.5F);
		mag.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.0F, 0.0524F, 0.0F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 125, 123, -2.0F, -1.0F, -5.0F, 2, 3, 5, 0.001F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-2.1F, -5.5F, 1.5F);
		mag.addChild(cube_r131);
		setRotationAngle(cube_r131, -0.9604F, -0.0386F, -0.0057F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 103, 90, 0.06F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-2.0F, -5.5F, 1.5F);
		mag.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.0F, -0.0524F, 0.0F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 41, 106, -0.05F, -1.0F, -2.0F, 1, 1, 2, 0.001F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(-2.2F, -8.5F, 4.5F);
		mag.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0F, -0.0524F, 0.0F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 126, 128, 0.0F, -1.0F, -5.0F, 2, 3, 5, 0.002F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(-2.2F, -9.5F, 4.5F);
		mag.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, 0.4363F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 124, 122, 0.0F, -1.0F, 0.0F, 1, 1, 7, -0.002F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(1.2F, -9.5F, 4.5F);
		mag.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, 0.0F, -0.4363F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 120, 117, -1.0F, -1.0F, 0.0F, 1, 1, 7, -0.002F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 5.0F, 0.0F);
		mag.addChild(bone);
		setRotationAngle(bone, -0.3491F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 87, 90, -2.0F, -5.7033F, 6.726F, 3, 4, 1, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 112, 61, -2.0F, -5.7033F, 1.926F, 3, 5, 5, 0.001F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(bone2);
		setRotationAngle(bone2, -0.1745F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 63, 57, -2.0F, -3.1646F, 10.4216F, 3, 5, 1, 0.002F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -14.0F, 0.6F);
		mag.addChild(bone3);
		setRotationAngle(bone3, -0.3054F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 153, 144, -1.5F, 13.6153F, 3.6468F, 2, 8, 1, 0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 110, 134, -2.25F, 20.6153F, 7.2468F, 1, 1, 7, 0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 41, 135, 0.25F, 20.6153F, 7.2468F, 1, 1, 7, 0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 66, 33, -2.0F, 17.6153F, 7.1468F, 3, 4, 7, 0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(bone4);
		

		cube_r104_r1 = new ModelRenderer(this);
		cube_r104_r1.setRotationPoint(1.0F, 24.0F, 36.0F);
		bone4.addChild(cube_r104_r1);
		setRotationAngle(cube_r104_r1, -0.3054F, 0.0873F, 0.0F);
		cube_r104_r1.cubeList.add(new ModelBox(cube_r104_r1, 77, 57, 1.7553F, -7.9846F, -40.9167F, 1, 4, 4, 0.001F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(bone5);
		

		cube_r103_r1 = new ModelRenderer(this);
		cube_r103_r1.setRotationPoint(1.0F, 24.0F, 36.0F);
		bone5.addChild(cube_r103_r1);
		setRotationAngle(cube_r103_r1, -0.3054F, -0.0873F, 0.0F);
		cube_r103_r1.cubeList.add(new ModelBox(cube_r103_r1, 97, 90, -5.7553F, -8.0846F, -40.9167F, 1, 4, 4, 0.001F, false));
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