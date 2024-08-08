package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ASM_Mag extends ModelBase {
	private final ModelRenderer asm_mag;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r113_r1;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r114_r1;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r115_r1;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r116_r1;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r117_r1;

	public ASM_Mag() {
		textureWidth = 256;
		textureHeight = 256;

		asm_mag = new ModelRenderer(this);
		asm_mag.setRotationPoint(-1.8F, -9.0F, -25.0F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.55F, 5.7F, 7.5F);
		asm_mag.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1047F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 151, 60, -2.15F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 134, -2.15F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 150, -2.15F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 116, 146, -2.15F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 163, 132, -2.05F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 157, -2.05F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 143, -2.15F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 130, 94, 0.65F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 132, 149, 0.65F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 118, 154, 0.55F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 143, 0.55F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 114, 0.65F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 141, 0.65F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 132, 0.65F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 116, -0.5F, -5.0F, -6.4F, 2, 10, 7, -0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 116, -2.0F, -5.0F, -6.4F, 2, 10, 7, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r13.addChild(cube_r14);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 0, -2.5F, -5.0051F, -7.745F, 2, 9, 3, 0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.55F, 18.7F, 7.5F);
		asm_mag.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2792F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 140, -2.151F, -4.6318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 161, -2.15F, -8.0308F, -3.4399F, 1, 7, 1, -0.002F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 62, 134, -2.151F, -7.2318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 158, 40, -2.151F, -3.3318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 164, 157, -2.051F, -3.3318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 142, 142, -2.051F, -5.9318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 91, 102, -2.151F, -5.9318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 157, 157, 0.651F, -3.3318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 66, 116, 0.651F, -4.6318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 93, 154, 0.651F, -2.1318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 154, -2.151F, -2.1318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 164, 150, 0.551F, -3.3318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 141, 109, 0.551F, -5.9318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 101, 0.651F, -5.9318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 86, 0.651F, -7.2318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 123, 0.65F, -8.0308F, -3.4399F, 1, 7, 1, -0.002F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 123, 27, -0.5F, -7.6784F, -9.1241F, 2, 7, 7, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 122, 122, -2.0F, -7.6784F, -9.1241F, 2, 7, 7, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r15.addChild(cube_r16);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 54, -2.5F, -7.6835F, -10.4691F, 2, 6, 3, 0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.55F, 26.3901F, 5.2951F);
		asm_mag.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.4101F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 78, 69, -2.151F, -6.5397F, -9.493F, 1, 1, 5, -0.103F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 75, 86, -2.15F, -8.6387F, -4.598F, 1, 5, 1, -0.002F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 75, 17, -2.151F, -4.1397F, -9.493F, 1, 1, 5, -0.103F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 157, 48, -2.151F, -5.2397F, -10.743F, 1, 1, 4, -0.103F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 136, 164, -2.051F, -5.2397F, -11.993F, 1, 1, 2, -0.3F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 141, 87, -2.051F, -7.8397F, -11.993F, 1, 1, 2, -0.3F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 157, 28, 0.651F, -5.2397F, -10.743F, 1, 1, 4, -0.103F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 70, 0.651F, -6.5397F, -9.493F, 1, 1, 5, -0.103F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 98, 164, 0.551F, -5.2397F, -11.993F, 1, 1, 2, -0.3F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 141, 69, 0.551F, -7.8397F, -11.993F, 1, 1, 2, -0.3F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 93, 36, 0.651F, -7.8397F, -10.743F, 1, 1, 4, -0.103F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 70, 0.651F, -4.1397F, -9.493F, 1, 1, 5, -0.103F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 48, 82, 0.65F, -8.6387F, -4.598F, 1, 5, 1, -0.002F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 92, 122, -0.5F, -8.3288F, -10.2388F, 2, 7, 7, -0.001F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 113, 44, -2.0F, -8.3288F, -10.2388F, 2, 7, 7, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r24.addChild(cube_r25);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 43, 0, -2.5F, -8.3339F, -11.5838F, 2, 6, 3, 0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.45F, 0.2F, 2.6F);
		asm_mag.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0908F, 0.0523F, 0.5212F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 147, 0, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(2.05F, 0.2F, 2.6F);
		asm_mag.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0908F, -0.0523F, -0.5212F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 122, 146, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.8F, 32.7675F, 29.1224F);
		asm_mag.addChild(bone3);
		setRotationAngle(bone3, 0.1309F, 0.0F, 0.0F);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.7F, -31.3438F, 30.6238F);
		bone3.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.192F, 0.0F, 0.0F);
		

		cube_r113_r1 = new ModelRenderer(this);
		cube_r113_r1.setRotationPoint(1.3091F, 21.651F, -34.0427F);
		cube_r19.addChild(cube_r113_r1);
		setRotationAngle(cube_r113_r1, -0.3491F, 0.0F, 0.0F);
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 34, 51, -1.9091F, 13.233F, -20.1976F, 3, 1, 7, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 162, 6, -1.3591F, 13.228F, -21.7927F, 1, 1, 3, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 162, 21, 0.1409F, 13.228F, -21.7927F, 1, 1, 3, 0.299F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 135, 25, 0.6909F, 13.233F, -20.1976F, 1, 1, 7, 0.299F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.6F, -22.1038F, 20.8838F);
		bone3.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r114_r1 = new ModelRenderer(this);
		cube_r114_r1.setRotationPoint(9.7588F, 4.8684F, -26.2448F);
		cube_r20.addChild(cube_r114_r1);
		setRotationAngle(cube_r114_r1, -0.1F, 0.335F, -0.0169F);
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 18, 38, 10.6706F, 1.9772F, -19.8952F, 2, 1, 6, 0.3F, false));
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 27, 0, 11.6706F, 1.9772F, -14.4952F, 1, 1, 1, 0.299F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.05F, -22.6038F, 18.4838F);
		bone3.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r115_r1 = new ModelRenderer(this);
		cube_r115_r1.setRotationPoint(9.9419F, 4.3488F, -23.7934F);
		cube_r21.addChild(cube_r115_r1);
		setRotationAngle(cube_r115_r1, -0.1F, 0.335F, -0.0169F);
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 142, 88, 10.5326F, 2.4954F, -21.4915F, 2, 1, 6, 0.3F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.05F, -22.6038F, 18.4838F);
		bone3.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(-9.8818F, 4.5585F, -23.7934F);
		cube_r22.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, -0.1F, -0.335F, 0.0169F);
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 72, 146, -12.5927F, 2.2857F, -21.4915F, 2, 1, 6, 0.3F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.6F, -22.1038F, 20.8838F);
		bone3.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r117_r1 = new ModelRenderer(this);
		cube_r117_r1.setRotationPoint(-9.6987F, 5.0781F, -26.2448F);
		cube_r23.addChild(cube_r117_r1);
		setRotationAngle(cube_r117_r1, -0.1F, -0.335F, 0.0169F);
		cube_r117_r1.cubeList.add(new ModelBox(cube_r117_r1, 141, 122, -12.7307F, 1.7675F, -19.8952F, 2, 1, 6, 0.3F, false));
		cube_r117_r1.cubeList.add(new ModelBox(cube_r117_r1, 8, 38, -12.7307F, 1.7675F, -14.4952F, 1, 1, 1, 0.299F, false));
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