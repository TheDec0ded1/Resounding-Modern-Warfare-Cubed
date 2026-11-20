package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK107Action extends ModelBase {
	private final ModelRenderer action;
	private final ModelRenderer action7;
	private final ModelRenderer action6;
	private final ModelRenderer action4;
	private final ModelRenderer action5;
	private final ModelRenderer action2;
	private final ModelRenderer action3;
	private final ModelRenderer action21;
	private final ModelRenderer action23_r1;
	private final ModelRenderer action22_r1;
	private final ModelRenderer charging_handle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public AK107Action() {
		textureWidth = 400;
		textureHeight = 400;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 1.0F);
		

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-2.4F, -38.5F, -33.5F);
		action.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 0.2974F);
		action7.cubeList.add(new ModelBox(action7, 162, 356, -0.4949F, 0.1389F, 0.0F, 1, 2, 12, 0.0F, false));
		action7.cubeList.add(new ModelBox(action7, 80, 358, -0.494F, -0.3611F, 0.0F, 1, 1, 12, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(-0.6F, -38.5F, -33.5F);
		action.addChild(action6);
		setRotationAngle(action6, 0.0F, 0.0F, -0.2974F);
		action6.cubeList.add(new ModelBox(action6, 188, 356, -0.5051F, 0.1389F, 0.0F, 1, 2, 12, 0.0F, false));
		action6.cubeList.add(new ModelBox(action6, 106, 358, -0.504F, -0.3611F, 0.0F, 1, 1, 12, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(-1.5F, -39.0F, -39.5F);
		action.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, -1.1154F);
		action4.cubeList.add(new ModelBox(action4, 74, 255, -0.4506F, 0.1433F, -17.0F, 1, 1, 35, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(-1.5F, -39.0F, -39.5F);
		action.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, 1.1154F);
		action5.cubeList.add(new ModelBox(action5, 256, 80, -0.548F, 0.1418F, -17.0F, 1, 1, 35, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-3.5F, -37.0F, -33.5F);
		action.addChild(action2);
		action2.cubeList.add(new ModelBox(action2, 352, 339, 0.0F, 0.4F, 0.0F, 4, 1, 12, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-0.5F, -37.0F, -33.5F);
		action.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 260, 40, -1.5047F, -2.5554F, -22.875F, 1, 1, 35, -0.125F, false));

		action21 = new ModelRenderer(this);
		action21.setRotationPoint(-6.7028F, -31.801F, -32.2595F);
		action.addChild(action21);
		action21.cubeList.add(new ModelBox(action21, 156, 368, 2.2528F, -4.999F, -1.3905F, 2, 1, 1, -0.2F, false));
		action21.cubeList.add(new ModelBox(action21, 264, 191, 1.5528F, -5.0F, -0.8405F, 3, 1, 1, -0.2F, false));
		action21.cubeList.add(new ModelBox(action21, 272, 191, 1.6528F, -5.0F, -0.2635F, 3, 1, 1, -0.2F, false));

		action23_r1 = new ModelRenderer(this);
		action23_r1.setRotationPoint(2.2594F, -4.499F, -1.3443F);
		action21.addChild(action23_r1);
		setRotationAngle(action23_r1, 0.0F, 0.4363F, 0.0F);
		action23_r1.cubeList.add(new ModelBox(action23_r1, 176, 370, -1.0F, -0.5F, 1.5F, 2, 1, 3, -0.2F, false));

		action22_r1 = new ModelRenderer(this);
		action22_r1.setRotationPoint(1.8545F, -4.499F, -0.5805F);
		action21.addChild(action22_r1);
		setRotationAngle(action22_r1, 0.0F, 0.4363F, 0.0F);
		action22_r1.cubeList.add(new ModelBox(action22_r1, 354, 379, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.2F, false));

		charging_handle = new ModelRenderer(this);
		charging_handle.setRotationPoint(0.0F, 0.0F, 0.0F);
		action.addChild(charging_handle);
		charging_handle.cubeList.add(new ModelBox(charging_handle, 270, 380, -5.65F, -37.0F, -32.725F, 1, 1, 1, 0.0F, false));
		charging_handle.cubeList.add(new ModelBox(charging_handle, 290, 380, -5.65F, -37.3F, -32.724F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-6.2756F, -36.5015F, -32.525F);
		charging_handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.0036F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 332, 380, 0.0F, -2.0F, -0.4F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 298, 380, 0.0F, -2.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.2756F, -36.6015F, -32.525F);
		charging_handle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.0036F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 328, 380, 0.5F, -1.95F, -0.4F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 294, 380, 0.5F, -1.95F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.4336F, -36.3F, -32.7013F);
		charging_handle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 286, 380, -1.0F, -1.0F, 0.0003F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 274, 380, -1.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.2775F, -36.3F, -32.3667F);
		charging_handle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.48F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 282, 380, -2.0F, -1.0F, 0.0007F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 278, 380, -2.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));
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