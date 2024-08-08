package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Mag extends ModelBase {
	private final ModelRenderer as_mag;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r112_r1;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r113_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r114_r1;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r115_r1;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r116_r1;

	public AS_Mag() {
		textureWidth = 256;
		textureHeight = 256;

		as_mag = new ModelRenderer(this);
		as_mag.setRotationPoint(-1.8F, -9.0F, -25.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.55F, 5.7F, 7.5F);
		as_mag.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 153, 104, -2.15F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 134, -2.15F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 153, 83, -2.15F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 155, 92, -2.15F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 164, 46, -2.05F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 164, 36, -2.05F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 155, 22, -2.15F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 154, 142, 0.65F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 153, 76, 0.65F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 164, 26, 0.55F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 163, 163, 0.55F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 122, 154, 0.65F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 152, 0.65F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 134, 0.65F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 117, 73, -0.5F, -5.0F, -6.4F, 2, 10, 7, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 73, 116, -2.0F, -5.0F, -6.4F, 2, 10, 7, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r2.addChild(cube_r5);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 38, -2.5F, -5.0051F, -7.745F, 2, 9, 3, 0.2F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.55F, 18.7F, 7.5F);
		as_mag.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2792F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 152, -2.151F, -4.6318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 108, 80, -2.15F, -8.0308F, -3.4399F, 1, 5, 1, -0.002F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 152, -2.151F, -7.2318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 159, -2.151F, -3.3318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 165, -2.051F, -3.3318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 156, 163, -2.051F, -5.9318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 111, 154, -2.151F, -5.9318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 136, 158, 0.651F, -3.3318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 140, 151, 0.651F, -4.6318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 165, 0.551F, -3.3318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 163, 146, 0.551F, -5.9318F, -10.8349F, 1, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 149, 0.651F, -5.9318F, -9.5849F, 1, 1, 4, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 151, 69, 0.651F, -7.2318F, -8.3349F, 1, 1, 5, -0.103F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 105, 47, 0.65F, -8.0308F, -3.4399F, 1, 5, 1, -0.002F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 126, 52, -0.5F, -7.6784F, -9.1241F, 2, 7, 7, -0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 125, -2.0F, -7.6784F, -9.1241F, 2, 7, 7, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r11.addChild(cube_r12);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 17, -2.5F, -7.6835F, -10.4691F, 2, 6, 3, 0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.45F, 0.2F, 2.6F);
		as_mag.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0908F, 0.0523F, 0.5212F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 148, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.05F, 0.2F, 2.6F);
		as_mag.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0908F, -0.0523F, -0.5212F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 148, 32, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.9F, 3.4F, 35.7F);
		as_mag.addChild(bone2);
		setRotationAngle(bone2, 0.0873F, 0.0F, 0.0F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.192F, 0.0F, 0.0F);
		

		cube_r112_r1 = new ModelRenderer(this);
		cube_r112_r1.setRotationPoint(1.3091F, 21.651F, -34.0427F);
		cube_r6.addChild(cube_r112_r1);
		setRotationAngle(cube_r112_r1, -0.2182F, 0.0F, 0.0F);
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 34, 82, -1.9091F, -5.3767F, -2.5716F, 3, 1, 7, 0.3F, false));
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 26, 120, -1.3591F, -5.3817F, -4.1666F, 1, 1, 3, 0.3F, false));
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 160, 119, 0.1409F, -5.3817F, -4.1666F, 1, 1, 3, 0.299F, false));
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 132, 140, 0.6909F, -5.3767F, -2.5716F, 1, 1, 7, 0.299F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.3F, 9.24F, -9.74F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r113_r1 = new ModelRenderer(this);
		cube_r113_r1.setRotationPoint(9.7588F, 4.8684F, -26.2448F);
		cube_r7.addChild(cube_r113_r1);
		setRotationAngle(cube_r113_r1, -0.061F, 0.2096F, -0.0064F);
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 142, 107, -7.2187F, -3.1516F, -2.2694F, 2, 1, 6, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 15, 86, -6.2187F, -3.1516F, 3.1306F, 1, 1, 1, 0.299F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.75F, 8.74F, -12.14F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r114_r1 = new ModelRenderer(this);
		cube_r114_r1.setRotationPoint(9.9419F, 4.3488F, -23.7934F);
		cube_r8.addChild(cube_r114_r1);
		setRotationAngle(cube_r114_r1, -0.061F, 0.2096F, -0.0064F);
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 141, 79, -7.3567F, -2.6334F, -3.8658F, 2, 1, 6, 0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.35F, 8.74F, -12.14F);
		bone2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r115_r1 = new ModelRenderer(this);
		cube_r115_r1.setRotationPoint(-9.8818F, 4.5585F, -23.7934F);
		cube_r9.addChild(cube_r115_r1);
		setRotationAngle(cube_r115_r1, -0.061F, -0.2096F, 0.0064F);
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 145, 134, 5.2966F, -2.8431F, -3.8657F, 2, 1, 6, 0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.9F, 9.24F, -9.74F);
		bone2.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(-9.6987F, 5.0781F, -26.2448F);
		cube_r10.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, -0.061F, -0.2096F, 0.0064F);
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 105, 146, 5.1586F, -3.3613F, -2.2694F, 2, 1, 6, 0.3F, false));
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 100, 36, 5.1586F, -3.3613F, 3.1306F, 1, 1, 1, 0.299F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		as_mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}