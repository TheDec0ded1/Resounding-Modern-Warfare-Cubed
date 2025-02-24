package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VSS_Mag extends ModelBase {
	private final ModelRenderer vss_mag;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public VSS_Mag() {
		textureWidth = 256;
		textureHeight = 256;

		vss_mag = new ModelRenderer(this);
		vss_mag.setRotationPoint(-1.8F, -9.0F, -25.0F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.55F, 5.7F, 7.5F);
		vss_mag.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1047F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 201, 36, -2.15F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 53, 223, -2.15F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 201, 43, -2.15F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 210, 105, -2.15F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 84, 226, -2.05F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 226, 85, -2.05F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 148, 211, -2.15F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 181, 211, 0.65F, 3.4F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 201, 56, 0.65F, 2.1F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 91, 226, 0.55F, 3.4F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 98, 226, 0.55F, 0.8F, -7.9F, 1, 1, 2, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 192, 211, 0.65F, 0.8F, -6.65F, 1, 1, 4, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 108, 201, 0.65F, -0.5F, -5.4F, 1, 1, 5, -0.103F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 223, 109, 0.65F, -0.4F, -0.65F, 1, 5, 1, -0.002F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 112, 152, -0.5F, -5.0F, -6.4F, 2, 12, 7, -0.001F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 131, 152, -2.0F, -5.0F, -6.4F, 2, 12, 7, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.45F, 0.2F, 2.6F);
		vss_mag.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0908F, 0.0523F, 0.5212F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 41, 194, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(2.05F, 0.2F, 2.6F);
		vss_mag.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.0908F, -0.0523F, -0.5212F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 195, 68, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.8F, 5.9F, 7.4F);
		vss_mag.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.1047F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 162, 182, -2.5F, -5.0051F, -7.745F, 2, 11, 3, 0.2F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-0.9F, 3.4F, 8.6F);
		vss_mag.addChild(bone46);
		setRotationAngle(bone46, 0.0873F, 0.0F, 0.0F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.192F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 173, 182, 2.0F, 8.9212F, -7.282F, 1, 1, 7, 0.299F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 220, 176, 1.45F, 8.9162F, -8.877F, 1, 1, 3, 0.299F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 220, 181, -0.05F, 8.9162F, -8.877F, 1, 1, 3, 0.3F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 84, 35, -0.6F, 8.9212F, -7.282F, 3, 1, 7, 0.3F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(3.3F, 9.24F, -9.74F);
		bone46.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0535F, 0.1845F, 1.2866F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 232, -3.5289F, -0.3091F, 6.218F, 1, 1, 1, 0.299F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 190, 180, -4.5289F, -0.3091F, 0.818F, 2, 1, 6, 0.3F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(2.75F, 8.74F, -12.14F);
		bone46.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.0535F, 0.1845F, 1.2866F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 187, 142, -4.4838F, -0.3105F, 1.6729F, 2, 1, 6, 0.3F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.35F, 8.74F, -12.14F);
		bone46.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.0535F, -0.1845F, -1.2866F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 190, 188, 2.4838F, -0.3105F, 1.6729F, 2, 1, 6, 0.3F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.9F, 9.24F, -9.74F);
		bone46.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.0535F, -0.1845F, -1.2866F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 232, 21, 2.5289F, -0.3091F, 6.218F, 1, 1, 1, 0.299F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 138, 191, 2.5289F, -0.3091F, 0.818F, 2, 1, 6, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vss_mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}