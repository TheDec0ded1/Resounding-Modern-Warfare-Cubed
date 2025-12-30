package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3MMag extends ModelWithAttachments {
	private final ModelRenderer asval_mag;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer i_hate_this_process;
	private final ModelRenderer cube_r119_r1;

	public SR3MMag() {
		textureWidth = 512;
		textureHeight = 256;

		asval_mag = new ModelRenderer(this);
		asval_mag.setRotationPoint(0.0F, -3.0F, -16.5F);
		

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(0.0F, 9.2F, -0.9F);
		asval_mag.addChild(cube_r116);
		setRotationAngle(cube_r116, -0.192F, 0.0F, 0.0F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 143, 74, -2.5F, 0.04F, -9.79F, 2, 10, 3, 0.199F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 23.2F, -0.9F);
		asval_mag.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3229F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 143, 74, -2.5F, -2.0658F, -12.8396F, 2, 9, 3, 0.199F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-2.75F, 8.1F, -0.7F);
		asval_mag.addChild(cube_r117);
		setRotationAngle(cube_r117, -0.0349F, 0.0F, 0.0F);
		

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-1.25F, 1.0F, -1.0F);
		asval_mag.addChild(cube_r118);
		setRotationAngle(cube_r118, -0.192F, 0.0F, 0.0F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 175, 77, -2.15F, 10.5F, -4.65F, 1, 1, 5, -0.004F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 178, 86, 0.65F, 13.5F, -4.65F, 1, 1, 5, -0.004F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 217, 82, -2.15F, 13.5F, -4.65F, 1, 1, 5, -0.004F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 178, 92, 0.65F, 10.5F, -4.65F, 1, 1, 5, -0.004F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.25F, 11.0F, -2.0F);
		asval_mag.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3229F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 247, 109, -2.15F, 13.5F, -4.65F, 1, 1, 5, -0.004F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 175, 77, -2.15F, 10.5F, -4.65F, 1, 1, 5, -0.004F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 178, 86, 0.65F, 13.5F, -4.65F, 1, 1, 5, -0.004F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 207, 75, 0.65F, 10.5F, -4.65F, 1, 1, 5, -0.004F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-0.15F, 9.0F, -0.8F);
		asval_mag.addChild(cube_r119);
		setRotationAngle(cube_r119, -0.192F, 0.0F, 0.0F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 241, 84, -3.25F, 0.6193F, -7.3991F, 1, 9, 1, -0.003F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 240, 36, -0.45F, 0.6193F, -7.3991F, 1, 9, 1, -0.003F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 199, 82, -1.6F, 0.04F, -7.44F, 2, 10, 7, -0.002F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 206, 52, -3.1F, 0.04F, -7.44F, 2, 11, 7, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.15F, 9.0F, -0.8F);
		asval_mag.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3229F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 260, 110, -3.25F, 10.3666F, -6.0891F, 1, 10, 1, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 240, 36, -0.45F, 10.3666F, -6.0891F, 1, 10, 1, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 238, 54, -1.6F, 10.0078F, -6.126F, 2, 10, 7, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 219, 72, -3.1F, 10.0078F, -6.126F, 2, 10, 7, -0.001F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(-1.25F, 1.0F, -1.0F);
		asval_mag.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.1047F, 0.0F, 0.0F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 175, 71, -2.15F, 7.0F, -5.4F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 175, 63, -2.15F, 4.0F, -5.4F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 208, 65, -2.149F, -0.001F, -6.395F, 1, 8, 1, -0.002F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 175, 57, -2.15F, 1.0F, -5.4F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 188, 63, 0.65F, 7.0F, -5.4F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 201, 60, 0.65F, 4.0F, -5.4F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 201, 66, 0.65F, 1.0F, -5.4F, 1, 1, 5, -0.003F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 191, 103, 0.649F, -0.001F, -6.395F, 1, 8, 1, -0.002F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 247, 6, -0.5F, -5.0F, -6.4F, 2, 13, 7, -0.001F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 210, 55, -2.0F, -5.0F, -6.4F, 2, 13, 7, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-3.25F, -4.5F, -5.9F);
		asval_mag.addChild(cube_r121);
		setRotationAngle(cube_r121, -0.0908F, 0.0523F, 0.5212F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 217, 57, -0.0212F, -1.0368F, 0.048F, 1, 1, 6, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(0.25F, -4.5F, -5.9F);
		asval_mag.addChild(cube_r122);
		setRotationAngle(cube_r122, -0.0908F, -0.0523F, -0.5212F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 179, 78, -0.9801F, -1.0365F, 0.047F, 1, 1, 6, 0.0F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(-2.75F, 8.1F, -0.7F);
		asval_mag.addChild(cube_r123);
		setRotationAngle(cube_r123, -0.192F, 0.0F, 0.0F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 131, 17, 1.5F, 20.0287F, -11.0766F, 1, 1, 3, 0.299F, false));
		cube_r123.cubeList.add(new ModelBox(cube_r123, 142, 114, 0.0F, 20.0287F, -11.0766F, 1, 1, 3, 0.3F, false));
		cube_r123.cubeList.add(new ModelBox(cube_r123, 112, 67, 2.05F, 20.0287F, -8.4766F, 1, 1, 7, 0.299F, false));
		cube_r123.cubeList.add(new ModelBox(cube_r123, 201, 81, -0.55F, 20.0287F, -8.4766F, 3, 1, 7, 0.3F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-3.6F, 17.34F, -10.34F);
		asval_mag.addChild(cube_r124);
		setRotationAngle(cube_r124, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(0.6F, 17.34F, -10.34F);
		asval_mag.addChild(cube_r125);
		setRotationAngle(cube_r125, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(-3.05F, 16.84F, -12.84F);
		asval_mag.addChild(cube_r126);
		setRotationAngle(cube_r126, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(0.05F, 16.84F, -12.84F);
		asval_mag.addChild(cube_r127);
		setRotationAngle(cube_r127, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(0.0F, 1.2F, -1.1F);
		asval_mag.addChild(cube_r128);
		setRotationAngle(cube_r128, -0.1047F, 0.0F, 0.0F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 252, 97, -2.5F, -5.0F, -8.75F, 2, 13, 3, 0.2F, false));

		i_hate_this_process = new ModelRenderer(this);
		i_hate_this_process.setRotationPoint(0.0F, 0.0F, 0.0F);
		asval_mag.addChild(i_hate_this_process);
		

		cube_r119_r1 = new ModelRenderer(this);
		cube_r119_r1.setRotationPoint(0.0F, 27.0F, 16.5F);
		i_hate_this_process.addChild(cube_r119_r1);
		setRotationAngle(cube_r119_r1, -0.2356F, 0.0F, 0.0F);
		cube_r119_r1.cubeList.add(new ModelBox(cube_r119_r1, 201, 80, -0.6F, -4.5F, -27.15F, 1, 1, 5, -0.004F, false));
		cube_r119_r1.cubeList.add(new ModelBox(cube_r119_r1, 218, 57, -3.4F, -4.5F, -27.15F, 1, 1, 5, -0.004F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		asval_mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}