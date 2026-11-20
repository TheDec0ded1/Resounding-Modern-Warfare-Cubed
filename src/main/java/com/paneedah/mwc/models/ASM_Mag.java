package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ASM_Mag extends ModelBase {
	private final ModelRenderer asm_mag;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r113_r1;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r114_r1;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r115_r1;
	private final ModelRenderer cube_r179;
	private final ModelRenderer cube_r116_r1;
	private final ModelRenderer cube_r180;
	private final ModelRenderer cube_r117_r1;

	public ASM_Mag() {
		textureWidth = 256;
		textureHeight = 256;

		asm_mag = new ModelRenderer(this);
		asm_mag.setRotationPoint(-1.8F, -9.0F, -25.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.55F, 5.7F, 7.5F);
		asm_mag.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 194, 204, -2.15F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 225, -2.15F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 205, 8, -2.15F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 39, -2.15F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 171, 226, -2.05F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 178, 226, -2.05F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 45, -2.15F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 51, 0.65F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 205, 157, 0.65F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 226, 0.55F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 212, 226, 0.55F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 57, 0.65F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 205, 196, 0.65F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 225, 26, 0.65F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 160, -0.5F, -5.0F, -6.4F, 2, 10, 7, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 163, 28, -2.0F, -5.0F, -6.4F, 2, 10, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r2.addChild(cube_r3);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 194, -2.5F, -5.0051F, -7.745F, 2, 9, 3, 0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.55F, 18.7F, 7.5F);
		asm_mag.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2356F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 67, 206, -2.151F, -4.7306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 113, 220, -2.15F, -8.1296F, -3.0874F, 1, 7, 1, -0.002F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 207, -2.151F, -7.3306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 216, 216, -2.151F, -3.4306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 227, 199, -2.051F, -3.4306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 219, 226, -2.051F, -6.0306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 74, 214, -2.151F, -6.0306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 217, 0.651F, -3.4306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 207, 0.651F, -4.7306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 207, 203, -2.151F, -2.0306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 208, 84, 0.651F, -2.0306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 227, 208, 0.551F, -3.4306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 226, 226, 0.551F, -6.0306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 85, 214, 0.651F, -6.0306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 93, 207, 0.651F, -7.3306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 221, 81, 0.65F, -8.1296F, -3.0874F, 1, 7, 1, -0.002F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 73, 168, -0.5F, -7.7773F, -8.7715F, 2, 7, 7, -0.001F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 92, 168, -2.0F, -7.7773F, -8.7715F, 2, 7, 7, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r4.addChild(cube_r5);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 170, 199, -2.5F, -7.7824F, -10.1166F, 2, 6, 3, 0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.55F, 27.4514F, 5.3992F);
		asm_mag.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3665F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 207, 177, -2.151F, -7.4176F, -9.2435F, 1, 1, 5, -0.103F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 221, 100, -2.15F, -9.8166F, -4.3485F, 1, 7, 1, -0.002F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 217, 125, -2.151F, -6.1176F, -10.4935F, 1, 1, 4, -0.103F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 227, 212, -2.051F, -6.1176F, -11.7435F, 1, 1, 2, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 227, -2.051F, -8.7176F, -11.7435F, 1, 1, 2, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 96, 214, -2.151F, -8.7176F, -10.4935F, 1, 1, 4, -0.103F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 217, 131, 0.651F, -6.1176F, -10.4935F, 1, 1, 4, -0.103F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 207, 184, 0.651F, -7.4176F, -9.2435F, 1, 1, 5, -0.103F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 227, 216, 0.551F, -6.1176F, -11.7435F, 1, 1, 2, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 227, 0.551F, -8.7176F, -11.7435F, 1, 1, 2, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 107, 214, 0.651F, -8.7176F, -10.4935F, 1, 1, 4, -0.103F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 222, 0.65F, -9.8166F, -4.3485F, 1, 7, 1, -0.002F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 168, 137, -0.5F, -9.4643F, -10.0327F, 2, 7, 7, -0.001F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 169, 167, -2.0F, -9.4643F, -10.0327F, 2, 7, 7, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r6.addChild(cube_r7);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 200, -2.5F, -9.4693F, -11.3777F, 2, 6, 3, 0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.45F, 0.2F, 2.6F);
		asm_mag.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0908F, 0.0523F, 0.5212F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 195, 103, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.05F, 0.2F, 2.6F);
		asm_mag.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0908F, -0.0523F, -0.5212F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 196, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.8F, 40.0F, 41.3F);
		asm_mag.addChild(bone2);
		setRotationAngle(bone2, 0.0698F, 0.0F, 0.0F);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.7F, -30.8F, -4.95F);
		bone2.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.192F, 0.0F, 0.0F);
		

		cube_r113_r1 = new ModelRenderer(this);
		cube_r113_r1.setRotationPoint(1.3091F, 21.651F, -34.0427F);
		cube_r17.addChild(cube_r113_r1);
		setRotationAngle(cube_r113_r1, -0.2182F, 0.0F, 0.0F);
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 163, 61, -1.9091F, -5.3767F, -2.5716F, 3, 1, 7, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 221, 95, -1.3591F, -5.3817F, -4.1666F, 1, 1, 3, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 221, 90, 0.1409F, -5.3817F, -4.1666F, 1, 1, 3, 0.299F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 43, 185, 0.6909F, -5.3767F, -2.5716F, 1, 1, 7, 0.299F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.6F, -21.56F, -14.69F);
		bone2.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r114_r1 = new ModelRenderer(this);
		cube_r114_r1.setRotationPoint(9.7588F, 4.8684F, -26.2448F);
		cube_r27.addChild(cube_r114_r1);
		setRotationAngle(cube_r114_r1, -0.061F, 0.2096F, -0.0064F);
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 188, 162, -7.2187F, -3.1516F, -2.2694F, 2, 1, 6, 0.3F, false));
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 206, 231, -6.2187F, -3.1516F, 3.1306F, 1, 1, 1, 0.299F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.05F, -22.06F, -17.09F);
		bone2.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r115_r1 = new ModelRenderer(this);
		cube_r115_r1.setRotationPoint(9.9419F, 4.3488F, -23.7934F);
		cube_r28.addChild(cube_r115_r1);
		setRotationAngle(cube_r115_r1, -0.061F, 0.2096F, -0.0064F);
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 187, 134, -7.3567F, -2.6334F, -3.8658F, 2, 1, 6, 0.3F, false));

		cube_r179 = new ModelRenderer(this);
		cube_r179.setRotationPoint(-3.05F, -22.06F, -17.09F);
		bone2.addChild(cube_r179);
		setRotationAngle(cube_r179, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(-9.8818F, 4.5585F, -23.7934F);
		cube_r179.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, -0.061F, -0.2096F, 0.0064F);
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 192, 0, 5.2966F, -2.8431F, -3.8657F, 2, 1, 6, 0.3F, false));

		cube_r180 = new ModelRenderer(this);
		cube_r180.setRotationPoint(-3.6F, -21.56F, -14.69F);
		bone2.addChild(cube_r180);
		setRotationAngle(cube_r180, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r117_r1 = new ModelRenderer(this);
		cube_r117_r1.setRotationPoint(-9.6987F, 5.0781F, -26.2448F);
		cube_r180.addChild(cube_r117_r1);
		setRotationAngle(cube_r117_r1, -0.061F, -0.2096F, 0.0064F);
		cube_r117_r1.cubeList.add(new ModelBox(cube_r117_r1, 91, 192, 5.1586F, -3.3613F, -2.2694F, 2, 1, 6, 0.3F, false));
		cube_r117_r1.cubeList.add(new ModelBox(cube_r117_r1, 232, 38, 5.1586F, -3.3613F, 3.1306F, 1, 1, 1, 0.299F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		asm_mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}