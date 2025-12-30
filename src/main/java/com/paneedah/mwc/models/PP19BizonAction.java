package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PP19BizonAction extends ModelWithAttachments {
	private final ModelRenderer action;
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
	private final ModelRenderer bone;
	private final ModelRenderer action18_r1;
	private final ModelRenderer action17_r1;
	private final ModelRenderer action16_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer action19_r1;
	private final ModelRenderer action18_r2;
	private final ModelRenderer action19_r2;
	private final ModelRenderer action17_r2;

	public PP19BizonAction() {
		textureWidth = 512;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		action9 = new ModelRenderer(this);
		action9.setRotationPoint(-3.5F, -37.0F, -33.5F);
		action.addChild(action9);
		setRotationAngle(action9, 0.0F, 0.0F, -2.1564F);
		action9.cubeList.add(new ModelBox(action9, 138, 0, -1.0F, 0.0F, 5.0F, 1, 1, 10, 0.0F, false));

		action8 = new ModelRenderer(this);
		action8.setRotationPoint(0.5F, -37.0F, -33.5F);
		action.addChild(action8);
		setRotationAngle(action8, 0.0F, 0.0F, 2.1564F);
		action8.cubeList.add(new ModelBox(action8, 133, 24, 0.0F, 0.0F, 4.999F, 1, 1, 10, 0.0F, false));

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-2.4F, -38.5F, -33.5F);
		action.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 0.2974F);
		action7.cubeList.add(new ModelBox(action7, 155, 0, 0.0F, 0.0F, 5.0F, 1, 2, 8, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(-0.6F, -38.5F, -33.5F);
		action.addChild(action6);
		setRotationAngle(action6, 0.0F, 0.0F, -0.2974F);
		action6.cubeList.add(new ModelBox(action6, 145, 6, -1.0F, 0.0F, 5.0F, 1, 2, 8, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(-1.5F, -39.0F, -39.5F);
		action.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, -1.1154F);
		action4.cubeList.add(new ModelBox(action4, 137, 0, -1.0F, 0.0F, 4.998F, 1, 1, 14, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(-1.5F, -39.0F, -39.5F);
		action.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, 1.1154F);
		action5.cubeList.add(new ModelBox(action5, 124, 6, 0.0F, 0.0F, 4.999F, 1, 1, 14, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-3.5F, -37.0F, -33.5F);
		action.addChild(action2);
		action2.cubeList.add(new ModelBox(action2, 118, 0, 0.0F, 0.0F, 5.0F, 1, 2, 10, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-3.3F, -37.0F, -25.5F);
		action.addChild(action1);
		

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-0.5F, -37.0F, -33.5F);
		action.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 138, 22, 0.0F, 0.0F, 5.0F, 1, 2, 10, 0.0F, false));

		action21 = new ModelRenderer(this);
		action21.setRotationPoint(-6.7028F, -31.801F, -32.2595F);
		action.addChild(action21);
		action21.cubeList.add(new ModelBox(action21, 150, 36, 2.5028F, -4.999F, 8.5595F, 2, 1, 1, -0.2F, false));
		action21.cubeList.add(new ModelBox(action21, 150, 36, 2.5028F, -4.999F, 8.9595F, 2, 1, 1, -0.2F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.9279F, -0.599F, -0.3478F);
		action21.addChild(bone);
		

		action18_r1 = new ModelRenderer(this);
		action18_r1.setRotationPoint(0.0F, -4.0F, 0.0F);
		bone.addChild(action18_r1);
		setRotationAngle(action18_r1, 0.0F, -0.6545F, 0.0F);
		action18_r1.cubeList.add(new ModelBox(action18_r1, 150, 36, 4.7876F, -0.5F, 7.4336F, 1, 1, 1, -0.1F, false));

		action17_r1 = new ModelRenderer(this);
		action17_r1.setRotationPoint(-0.0591F, -4.0F, -0.1874F);
		bone.addChild(action17_r1);
		setRotationAngle(action17_r1, 0.0F, -0.3054F, 0.0F);
		action17_r1.cubeList.add(new ModelBox(action17_r1, 150, 36, 2.5067F, -0.5F, 9.0373F, 1, 1, 1, -0.1F, false));

		action16_r1 = new ModelRenderer(this);
		action16_r1.setRotationPoint(0.485F, -4.0F, -0.1755F);
		bone.addChild(action16_r1);
		setRotationAngle(action16_r1, 0.0F, 0.2618F, 0.0F);
		action16_r1.cubeList.add(new ModelBox(action16_r1, 150, 36, -3.0882F, -0.5F, 9.1593F, 1, 1, 1, -0.1F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.9279F, -0.799F, -0.3478F);
		action21.addChild(bone2);
		

		action19_r1 = new ModelRenderer(this);
		action19_r1.setRotationPoint(0.0F, -3.9F, 0.0F);
		bone2.addChild(action19_r1);
		setRotationAngle(action19_r1, 0.0F, -0.6545F, 0.0F);
		action19_r1.cubeList.add(new ModelBox(action19_r1, 150, 36, 4.7876F, -0.6F, 7.4336F, 1, 1, 1, -0.1F, false));

		action18_r2 = new ModelRenderer(this);
		action18_r2.setRotationPoint(-0.0591F, -4.0F, -0.1874F);
		bone2.addChild(action18_r2);
		setRotationAngle(action18_r2, 0.0F, -0.3054F, 0.0F);
		action18_r2.cubeList.add(new ModelBox(action18_r2, 150, 36, 2.5067F, -0.5F, 9.0373F, 1, 1, 1, -0.1F, false));

		action19_r2 = new ModelRenderer(this);
		action19_r2.setRotationPoint(-0.1435F, -4.3762F, -0.2141F);
		bone2.addChild(action19_r2);
		setRotationAngle(action19_r2, 0.2223F, 0.1395F, 1.0192F);
		action19_r2.cubeList.add(new ModelBox(action19_r2, 150, 36, -1.0904F, 1.0833F, 9.5592F, 1, 1, 1, -0.3F, false));
		action19_r2.cubeList.add(new ModelBox(action19_r2, 150, 36, -1.0904F, 1.0833F, 9.1592F, 1, 1, 1, -0.3F, false));

		action17_r2 = new ModelRenderer(this);
		action17_r2.setRotationPoint(0.485F, -3.9F, -0.1755F);
		bone2.addChild(action17_r2);
		setRotationAngle(action17_r2, 0.0F, 0.2618F, 0.0F);
		action17_r2.cubeList.add(new ModelBox(action17_r2, 150, 36, -3.0882F, -0.5F, 9.1593F, 1, 1, 1, -0.1F, false));
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