package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Mag extends ModelBase {
	private final ModelRenderer as_mag;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r172;
	private final ModelRenderer cube_r173;
	private final ModelRenderer bone47;
	private final ModelRenderer cube_r174;
	private final ModelRenderer cube_r112_r1;
	private final ModelRenderer cube_r175;
	private final ModelRenderer cube_r113_r1;
	private final ModelRenderer cube_r176;
	private final ModelRenderer cube_r114_r1;
	private final ModelRenderer cube_r177;
	private final ModelRenderer cube_r115_r1;
	private final ModelRenderer cube_r178;
	private final ModelRenderer cube_r116_r1;

	public AS_Mag() {
		textureWidth = 256;
		textureHeight = 256;

		as_mag = new ModelRenderer(this);
		as_mag.setRotationPoint(-1.8F, -9.0F, -25.0F);
		

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(0.55F, 5.7F, 7.5F);
		as_mag.addChild(cube_r117);
		setRotationAngle(cube_r117, -0.1047F, 0.0F, 0.0F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 41, 202, -2.15F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 136, 223, -2.15F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 203, 170, -2.15F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 212, 21, -2.15F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 226, 100, -2.05F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 226, 104, -2.05F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 212, 111, -2.15F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 63, 213, 0.65F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 0, 204, 0.65F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 125, 226, 0.55F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 226, 143, 0.55F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 10, 214, 0.65F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 28, 204, 0.65F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 141, 223, 0.65F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 54, 158, -0.5F, -5.0F, -6.4F, 2, 10, 7, -0.001F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 27, 159, -2.0F, -5.0F, -6.4F, 2, 10, 7, 0.0F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r117.addChild(cube_r118);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 30, 191, -2.5F, -5.0051F, -7.745F, 2, 9, 3, 0.2F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(0.55F, 18.7F, 7.5F);
		as_mag.addChild(cube_r121);
		setRotationAngle(cube_r121, -0.2356F, 0.0F, 0.0F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 204, 130, -2.151F, -4.7306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 41, 222, -2.15F, -8.1296F, -3.0874F, 1, 5, 1, -0.002F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 204, 137, -2.151F, -7.3306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 216, 170, -2.151F, -3.4306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 227, 191, -2.051F, -3.4306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 146, 226, -2.051F, -6.0306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 214, 27, -2.151F, -6.0306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 216, 210, 0.651F, -3.4306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 149, 204, 0.651F, -4.7306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 227, 195, 0.551F, -3.4306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 164, 226, 0.551F, -6.0306F, -10.4824F, 1, 1, 2, -0.3F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 214, 33, 0.651F, -6.0306F, -9.2324F, 1, 1, 4, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 181, 204, 0.651F, -7.3306F, -7.9824F, 1, 1, 5, -0.103F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 195, 222, 0.65F, -8.1296F, -3.0874F, 1, 5, 1, -0.002F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 163, 46, -0.5F, -7.7773F, -8.7715F, 2, 7, 7, -0.001F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 150, 167, -2.0F, -7.7773F, -8.7715F, 2, 7, 7, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(1.25F, 0.2F, -0.1F);
		cube_r121.addChild(cube_r122);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 138, 199, -2.5F, -7.7824F, -10.1166F, 2, 6, 3, 0.2F, false));

		cube_r172 = new ModelRenderer(this);
		cube_r172.setRotationPoint(-1.45F, 0.2F, 2.6F);
		as_mag.addChild(cube_r172);
		setRotationAngle(cube_r172, -0.0908F, 0.0523F, 0.5212F);
		cube_r172.cubeList.add(new ModelBox(cube_r172, 195, 76, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r173 = new ModelRenderer(this);
		cube_r173.setRotationPoint(2.05F, 0.2F, 2.6F);
		as_mag.addChild(cube_r173);
		setRotationAngle(cube_r173, -0.0908F, -0.0523F, -0.5212F);
		cube_r173.cubeList.add(new ModelBox(cube_r173, 195, 95, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(1.8F, 31.8F, 29.35F);
		as_mag.addChild(bone47);
		setRotationAngle(bone47, 0.1746F, 0.0F, 0.0F);
		

		cube_r174 = new ModelRenderer(this);
		cube_r174.setRotationPoint(-2.7F, -29.6F, 10.7F);
		bone47.addChild(cube_r174);
		setRotationAngle(cube_r174, -0.192F, 0.0F, 0.0F);
		

		cube_r112_r1 = new ModelRenderer(this);
		cube_r112_r1.setRotationPoint(1.3091F, 21.651F, -34.0427F);
		cube_r174.addChild(cube_r112_r1);
		setRotationAngle(cube_r112_r1, -0.2182F, 0.0F, 0.0F);
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 153, 87, -1.9091F, -5.3767F, -2.5716F, 3, 1, 7, 0.3F, false));
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 221, 76, -1.3591F, -5.3817F, -4.1666F, 1, 1, 3, 0.3F, false));
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 221, 63, 0.1409F, -5.3817F, -4.1666F, 1, 1, 3, 0.299F, false));
		cube_r112_r1.cubeList.add(new ModelBox(cube_r112_r1, 184, 59, 0.6909F, -5.3767F, -2.5716F, 1, 1, 7, 0.299F, false));

		cube_r175 = new ModelRenderer(this);
		cube_r175.setRotationPoint(0.6F, -20.36F, 0.96F);
		bone47.addChild(cube_r175);
		setRotationAngle(cube_r175, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r113_r1 = new ModelRenderer(this);
		cube_r113_r1.setRotationPoint(9.7588F, 4.8684F, -26.2448F);
		cube_r175.addChild(cube_r113_r1);
		setRotationAngle(cube_r113_r1, -0.061F, 0.2096F, -0.0064F);
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 0, 188, -7.2187F, -3.1516F, -2.2694F, 2, 1, 6, 0.3F, false));
		cube_r113_r1.cubeList.add(new ModelBox(cube_r113_r1, 231, 166, -6.2187F, -3.1516F, 3.1306F, 1, 1, 1, 0.299F, false));

		cube_r176 = new ModelRenderer(this);
		cube_r176.setRotationPoint(0.05F, -20.86F, -1.44F);
		bone47.addChild(cube_r176);
		setRotationAngle(cube_r176, -0.0535F, 0.1845F, 1.2866F);
		

		cube_r114_r1 = new ModelRenderer(this);
		cube_r114_r1.setRotationPoint(9.9419F, 4.3488F, -23.7934F);
		cube_r176.addChild(cube_r114_r1);
		setRotationAngle(cube_r114_r1, -0.061F, 0.2096F, -0.0064F);
		cube_r114_r1.cubeList.add(new ModelBox(cube_r114_r1, 136, 75, -7.3567F, -2.6334F, -3.8658F, 2, 1, 6, 0.3F, false));

		cube_r177 = new ModelRenderer(this);
		cube_r177.setRotationPoint(-3.05F, -20.86F, -1.44F);
		bone47.addChild(cube_r177);
		setRotationAngle(cube_r177, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r115_r1 = new ModelRenderer(this);
		cube_r115_r1.setRotationPoint(-9.8818F, 4.5585F, -23.7934F);
		cube_r177.addChild(cube_r115_r1);
		setRotationAngle(cube_r115_r1, -0.061F, -0.2096F, 0.0064F);
		cube_r115_r1.cubeList.add(new ModelBox(cube_r115_r1, 173, 191, 5.2966F, -2.8431F, -3.8657F, 2, 1, 6, 0.3F, false));

		cube_r178 = new ModelRenderer(this);
		cube_r178.setRotationPoint(-3.6F, -20.36F, 0.96F);
		bone47.addChild(cube_r178);
		setRotationAngle(cube_r178, -0.0535F, -0.1845F, -1.2866F);
		

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(-9.6987F, 5.0781F, -26.2448F);
		cube_r178.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, -0.061F, -0.2096F, 0.0064F);
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 74, 192, 5.1586F, -3.3613F, -2.2694F, 2, 1, 6, 0.3F, false));
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 232, 35, 5.1586F, -3.3613F, 3.1306F, 1, 1, 1, 0.299F, false));
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