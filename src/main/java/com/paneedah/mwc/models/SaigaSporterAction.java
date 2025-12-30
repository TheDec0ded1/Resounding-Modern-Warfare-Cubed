package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SaigaSporterAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action10;
	private final ModelRenderer action9;
	private final ModelRenderer action8;
	private final ModelRenderer action7;
	private final ModelRenderer action6;
	private final ModelRenderer action4;
	private final ModelRenderer action5;
	private final ModelRenderer action2;
	private final ModelRenderer action1;
	private final ModelRenderer action3;
	private final ModelRenderer action21;
	private final ModelRenderer action22_r1;
	private final ModelRenderer bone;
	private final ModelRenderer action18_r1;
	private final ModelRenderer action17_r1;
	private final ModelRenderer action16_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer action19_r1;
	private final ModelRenderer action18_r2;
	private final ModelRenderer action19_r2;
	private final ModelRenderer action17_r2;
	private final ModelRenderer charging_handle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public SaigaSporterAction() {
		textureWidth = 512;
		textureHeight = 512;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		action10 = new ModelRenderer(this);
		action10.setRotationPoint(-3.3F, -37.0F, -25.5F);
		action.addChild(action10);
		setRotationAngle(action10, 0.0F, 0.0F, -2.1564F);
		action10.cubeList.add(new ModelBox(action10, 41, 86, -1.0F, 0.0F, -0.001F, 1, 1, 5, 0.0F, false));

		action9 = new ModelRenderer(this);
		action9.setRotationPoint(-3.5F, -37.0F, -33.5F);
		action.addChild(action9);
		setRotationAngle(action9, 0.0F, 0.0F, -2.1564F);
		action9.cubeList.add(new ModelBox(action9, 85, 114, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		action8 = new ModelRenderer(this);
		action8.setRotationPoint(0.5F, -37.0F, -33.5F);
		action.addChild(action8);
		setRotationAngle(action8, 0.0F, 0.0F, 2.1564F);
		action8.cubeList.add(new ModelBox(action8, 82, 88, 0.0F, 0.0F, -0.001F, 1, 1, 13, 0.0F, false));

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-2.4F, -38.5F, -33.5F);
		action.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 0.2974F);
		action7.cubeList.add(new ModelBox(action7, 83, 58, 0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(-0.6F, -38.5F, -33.5F);
		action.addChild(action6);
		setRotationAngle(action6, 0.0F, 0.0F, -0.2974F);
		action6.cubeList.add(new ModelBox(action6, 83, 0, -1.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(-1.5F, -39.0F, -39.5F);
		action.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, -1.1154F);
		action4.cubeList.add(new ModelBox(action4, 240, 158, -1.0F, 0.0F, -0.002F, 1, 1, 18, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(-1.5F, -39.0F, -39.5F);
		action.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, 1.1154F);
		action5.cubeList.add(new ModelBox(action5, 223, 238, 0.0F, 0.0F, -0.001F, 1, 1, 18, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-3.5F, -37.0F, -33.5F);
		action.addChild(action2);
		action2.cubeList.add(new ModelBox(action2, 114, 26, 0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-3.3F, -37.0F, -25.5F);
		action.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 41, 56, 0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-0.5F, -37.0F, -33.5F);
		action.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 25, 86, 0.0F, 0.0F, 0.0F, 1, 2, 13, 0.0F, false));

		action21 = new ModelRenderer(this);
		action21.setRotationPoint(-6.7028F, -31.801F, -32.2595F);
		action.addChild(action21);
		action21.cubeList.add(new ModelBox(action21, 114, 73, 2.6028F, -4.999F, -1.3905F, 2, 1, 1, -0.2F, false));
		action21.cubeList.add(new ModelBox(action21, 114, 104, 1.9028F, -4.999F, -0.8405F, 3, 1, 1, -0.2F, false));
		action21.cubeList.add(new ModelBox(action21, 114, 78, 2.0028F, -4.999F, -0.2655F, 3, 1, 1, -0.2F, false));

		action22_r1 = new ModelRenderer(this);
		action22_r1.setRotationPoint(2.2045F, -4.499F, -0.5805F);
		action21.addChild(action22_r1);
		setRotationAngle(action22_r1, 0.0F, 0.4363F, 0.0F);
		action22_r1.cubeList.add(new ModelBox(action22_r1, 47, 71, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.2F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.9279F, -0.599F, -0.3478F);
		action21.addChild(bone);
		

		action18_r1 = new ModelRenderer(this);
		action18_r1.setRotationPoint(0.0F, -4.0F, 0.0F);
		bone.addChild(action18_r1);
		setRotationAngle(action18_r1, 0.0F, -0.6545F, 0.0F);
		

		action17_r1 = new ModelRenderer(this);
		action17_r1.setRotationPoint(-0.0591F, -4.0F, -0.1874F);
		bone.addChild(action17_r1);
		setRotationAngle(action17_r1, 0.0F, -0.3054F, 0.0F);
		

		action16_r1 = new ModelRenderer(this);
		action16_r1.setRotationPoint(0.485F, -4.0F, -0.1755F);
		bone.addChild(action16_r1);
		setRotationAngle(action16_r1, 0.0F, 0.2618F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.9279F, -0.799F, -0.3478F);
		action21.addChild(bone2);
		

		action19_r1 = new ModelRenderer(this);
		action19_r1.setRotationPoint(0.0F, -3.9F, 0.0F);
		bone2.addChild(action19_r1);
		setRotationAngle(action19_r1, 0.0F, -0.6545F, 0.0F);
		

		action18_r2 = new ModelRenderer(this);
		action18_r2.setRotationPoint(-0.0591F, -4.0F, -0.1874F);
		bone2.addChild(action18_r2);
		setRotationAngle(action18_r2, 0.0F, -0.3054F, 0.0F);
		

		action19_r2 = new ModelRenderer(this);
		action19_r2.setRotationPoint(-0.1435F, -4.3762F, -0.2141F);
		bone2.addChild(action19_r2);
		setRotationAngle(action19_r2, 0.2223F, 0.1395F, 1.0192F);
		

		action17_r2 = new ModelRenderer(this);
		action17_r2.setRotationPoint(0.485F, -3.9F, -0.1755F);
		bone2.addChild(action17_r2);
		setRotationAngle(action17_r2, 0.0F, 0.2618F, 0.0F);
		

		charging_handle = new ModelRenderer(this);
		charging_handle.setRotationPoint(0.0F, 0.0F, 0.0F);
		action.addChild(charging_handle);
		charging_handle.cubeList.add(new ModelBox(charging_handle, 127, 129, -5.3F, -37.0F, -32.725F, 1, 1, 1, 0.0F, false));
		charging_handle.cubeList.add(new ModelBox(charging_handle, 125, 12, -5.3F, -37.3F, -32.725F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.9256F, -36.5015F, -32.525F);
		charging_handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.0036F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 123, 104, 0.0F, -2.0F, -0.4F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 114, 124, 0.0F, -2.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.9256F, -36.6015F, -32.525F);
		charging_handle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.0036F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 123, 78, 0.5F, -1.95F, -0.4F, 1, 1, 1, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 128, 104, 0.5F, -1.95F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.0836F, -36.3F, -32.7013F);
		charging_handle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 125, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 128, 78, -1.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.9275F, -36.3F, -32.3667F);
		charging_handle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.48F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 124, 118, -2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 127, -2.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}