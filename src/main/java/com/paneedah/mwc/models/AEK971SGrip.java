package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AEK971SGrip extends ModelBase {
	private final ModelRenderer gripS;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer grip_r1;
	private final ModelRenderer grip_r2;
	private final ModelRenderer grip_r3;
	private final ModelRenderer grip_r4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer gun9;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer grip5;
	private final ModelRenderer grip3_r5;
	private final ModelRenderer grip3_r6;
	private final ModelRenderer grip4_r3;
	private final ModelRenderer grip4_r2_r1;
	private final ModelRenderer grip5_r3;
	private final ModelRenderer grip13_r3;

	public AEK971SGrip() {
		textureWidth = 416;
		textureHeight = 416;

		gripS = new ModelRenderer(this);
		gripS.setRotationPoint(-0.8335F, -7.0705F, -5.908F);
		gripS.cubeList.add(new ModelBox(gripS, 100, 395, 1.0836F, 0.0705F, 3.908F, 1, 1, 3, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 68, 291, -3.4166F, 0.0705F, 3.908F, 5, 1, 3, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 106, 404, 1.0836F, -0.1545F, 5.908F, 1, 1, 1, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 118, 45, -3.4166F, -0.1545F, 5.908F, 5, 1, 1, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 404, 107, 1.0815F, 0.0705F, -9.492F, 1, 1, 1, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 130, 45, -3.4164F, 0.0705F, -9.492F, 5, 1, 1, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 374, 134, -3.4165F, -0.9295F, -9.092F, 5, 2, 8, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 372, 173, 1.0835F, -0.9295F, -9.092F, 1, 2, 13, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 292, 387, -3.1665F, -0.9295F, -1.092F, 1, 2, 5, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 214, 314, -2.6655F, 5.5705F, -1.417F, 4, 1, 3, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 56, 394, -2.1665F, 1.0705F, 4.908F, 3, 5, 1, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 188, 385, -2.6655F, 1.0705F, -0.092F, 4, 5, 5, 0.0F, false));
		gripS.cubeList.add(new ModelBox(gripS, 84, 261, 1.1835F, -2.9295F, -24.592F, 1, 1, 33, -0.1F, false));
		gripS.cubeList.add(new ModelBox(gripS, 264, 158, -3.5165F, -2.9295F, -24.592F, 1, 1, 33, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.5131F, 4.3345F, 5.408F);
		gripS.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 266, -0.5F, -9.5F, -30.0F, 1, 1, 33, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.5131F, 3.5345F, 5.408F);
		gripS.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 268, 0, -0.5F, -9.5F, -30.0F, 1, 1, 33, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.5178F, -2.0295F, 5.408F);
		gripS.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 264, 124, -0.5F, -0.5F, -30.0F, 1, 1, 33, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.5178F, -2.8295F, 5.408F);
		gripS.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 264, 90, -0.5F, -0.5F, -30.0F, 1, 1, 33, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.1237F, 0.4847F, -3.092F);
		gripS.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 386, 93, -0.5F, -2.5F, -6.0F, 1, 1, 8, 0.0F, false));

		grip_r1 = new ModelRenderer(this);
		grip_r1.setRotationPoint(-0.6655F, 5.4702F, -7.5422F);
		gripS.addChild(grip_r1);
		setRotationAngle(grip_r1, 0.2618F, 0.0F, 0.0F);
		grip_r1.cubeList.add(new ModelBox(grip_r1, 388, 188, -2.0F, -5.5F, -1.0F, 4, 5, 2, 0.0F, false));

		grip_r2 = new ModelRenderer(this);
		grip_r2.setRotationPoint(-0.6655F, 5.8659F, -7.1851F);
		gripS.addChild(grip_r2);
		setRotationAngle(grip_r2, -0.0436F, 0.0F, 0.0F);
		grip_r2.cubeList.add(new ModelBox(grip_r2, 338, 375, -1.0F, -3.5F, -2.0F, 2, 4, 1, 0.0F, false));

		grip_r3 = new ModelRenderer(this);
		grip_r3.setRotationPoint(-0.6655F, 5.8659F, -2.2851F);
		gripS.addChild(grip_r3);
		setRotationAngle(grip_r3, -0.2182F, 0.0F, 0.0F);
		grip_r3.cubeList.add(new ModelBox(grip_r3, 378, 330, -2.0F, -0.5F, -6.0F, 4, 1, 7, 0.0F, false));

		grip_r4 = new ModelRenderer(this);
		grip_r4.setRotationPoint(-0.6655F, 1.0705F, 4.483F);
		gripS.addChild(grip_r4);
		setRotationAngle(grip_r4, 0.7854F, 0.0F, 0.0F);
		grip_r4.cubeList.add(new ModelBox(grip_r4, 368, 188, -2.0F, -0.7172F, -0.7172F, 4, 2, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.5335F, -0.6295F, 1.208F);
		gripS.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 400, 50, -5.25F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 152, 382, -5.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.4594F, 1.0705F, 1.908F);
		gripS.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 188, 395, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.3763F, -0.9295F, -3.092F);
		gripS.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 376, 0, -0.5F, -0.5F, -6.0F, 1, 1, 13, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.9165F, 0.0711F, 5.7105F);
		gripS.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 116, 395, 4.0F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 108, 395, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.3335F, -0.2001F, -8.8387F);
		gripS.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 114, 404, -3.749F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 404, 109, 0.749F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(0.6335F, -2.4295F, 2.408F);
		gripS.addChild(gun9);
		

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(0.8335F, -3.4295F, 0.408F);
		gripS.addChild(gun17);
		setRotationAngle(gun17, -0.4833F, 0.0F, 0.0F);
		

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(1.0335F, -2.7295F, -5.592F);
		gripS.addChild(gun18);
		

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-0.2F, -0.7F, -8.0F);
		gun18.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 376, 359, 0.4F, 0.2F, 5.0F, 1, 2, 12, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(1.0335F, -2.7295F, -6.292F);
		gripS.addChild(gun20);
		gun20.cubeList.add(new ModelBox(gun20, 362, 388, 0.4F, 0.0F, 4.0F, 1, 1, 5, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(0.8335F, -1.6295F, -8.092F);
		gripS.addChild(gun21);
		

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(1.0335F, -2.7295F, -7.892F);
		gripS.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 350, 388, 0.4F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(1.0335F, -2.7295F, -13.592F);
		gripS.addChild(gun23);
		

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-2.6865F, 8.6505F, 3.868F);
		gripS.addChild(grip5);
		setRotationAngle(grip5, 0.48F, 0.0F, 0.0F);
		

		grip3_r5 = new ModelRenderer(this);
		grip3_r5.setRotationPoint(0.02F, -3.08F, -2.06F);
		grip5.addChild(grip3_r5);
		setRotationAngle(grip3_r5, 0.3718F, 0.0F, 0.0F);
		grip3_r5.cubeList.add(new ModelBox(grip3_r5, 162, 45, 0.001F, 1.9F, -0.5F, 4, 1, 1, 0.0F, false));
		grip3_r5.cubeList.add(new ModelBox(grip3_r5, 310, 192, 0.0F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));

		grip3_r6 = new ModelRenderer(this);
		grip3_r6.setRotationPoint(0.02F, -6.08F, 2.44F);
		grip5.addChild(grip3_r6);
		setRotationAngle(grip3_r6, -1.0782F, 0.0F, 0.0F);
		grip3_r6.cubeList.add(new ModelBox(grip3_r6, 192, 370, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r6.cubeList.add(new ModelBox(grip3_r6, 88, 373, 0.499F, -0.3879F, -0.1879F, 3, 1, 12, 0.0F, false));

		grip4_r3 = new ModelRenderer(this);
		grip4_r3.setRotationPoint(0.02F, 6.12F, 0.84F);
		grip5.addChild(grip4_r3);
		setRotationAngle(grip4_r3, 0.2231F, 0.0F, 0.0F);
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 378, 338, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 220, 42, 0.0F, -0.001F, 6.45F, 4, 1, 2, 0.0F, false));
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 158, 398, 0.5F, -0.0181F, 7.7809F, 3, 1, 1, 0.0F, false));

		grip4_r2_r1 = new ModelRenderer(this);
		grip4_r2_r1.setRotationPoint(2.0F, 0.1945F, 8.1066F);
		grip4_r3.addChild(grip4_r2_r1);
		setRotationAngle(grip4_r2_r1, 1.0908F, 0.0F, 0.0F);
		grip4_r2_r1.cubeList.add(new ModelBox(grip4_r2_r1, 378, 356, -1.5F, -1.5F, -0.5F, 3, 2, 1, 0.0F, false));

		grip5_r3 = new ModelRenderer(this);
		grip5_r3.setRotationPoint(0.02F, 6.12F, 0.84F);
		grip5.addChild(grip5_r3);
		setRotationAngle(grip5_r3, 1.0782F, 0.0F, 0.0F);
		grip5_r3.cubeList.add(new ModelBox(grip5_r3, 168, 214, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r3 = new ModelRenderer(this);
		grip13_r3.setRotationPoint(-0.08F, -3.08F, -2.06F);
		grip5.addChild(grip13_r3);
		setRotationAngle(grip13_r3, 0.3665F, 0.0F, 0.0F);
		grip13_r3.cubeList.add(new ModelBox(grip13_r3, 158, 237, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r3.cubeList.add(new ModelBox(grip13_r3, 214, 293, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripS.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}