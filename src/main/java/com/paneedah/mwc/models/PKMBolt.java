package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBolt extends ModelWithAttachments {
	private final ModelRenderer bolt;
	private final ModelRenderer bolt2;
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
	private final ModelRenderer bone7;
	private final ModelRenderer action18_r1;
	private final ModelRenderer action17_r1;
	private final ModelRenderer action16_r1;
	private final ModelRenderer bone8;
	private final ModelRenderer action19_r1;
	private final ModelRenderer action18_r2;
	private final ModelRenderer action19_r2;
	private final ModelRenderer action17_r2;

	public PKMBolt() {
		textureWidth = 512;
		textureHeight = 512;

		bolt = new ModelRenderer(this);
		bolt.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bolt2 = new ModelRenderer(this);
		bolt2.setRotationPoint(-3.0F, -86.0F, -2.0F);
		bolt.addChild(bolt2);
		setRotationAngle(bolt2, 0.0F, 0.0F, -3.1416F);
		

		action10 = new ModelRenderer(this);
		action10.setRotationPoint(-3.3F, -52.0F, -25.5F);
		bolt2.addChild(action10);
		setRotationAngle(action10, 0.0F, 0.0F, -2.1564F);
		action10.cubeList.add(new ModelBox(action10, 53, 20, -1.0F, 0.0F, -0.001F, 1, 1, 7, 0.0F, false));

		action9 = new ModelRenderer(this);
		action9.setRotationPoint(-3.5F, -52.0F, -33.5F);
		bolt2.addChild(action9);
		setRotationAngle(action9, 0.0F, 0.0F, -2.1564F);
		action9.cubeList.add(new ModelBox(action9, 72, 154, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		action8 = new ModelRenderer(this);
		action8.setRotationPoint(0.5F, -52.0F, -33.5F);
		bolt2.addChild(action8);
		setRotationAngle(action8, 0.0F, 0.0F, 2.1564F);
		action8.cubeList.add(new ModelBox(action8, 216, 285, 0.0F, 0.0F, -0.001F, 1, 1, 15, 0.0F, false));

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-2.4F, -53.5F, -33.5F);
		bolt2.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 0.2974F);
		action7.cubeList.add(new ModelBox(action7, 72, 0, 0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(-0.6F, -53.5F, -33.5F);
		bolt2.addChild(action6);
		setRotationAngle(action6, 0.0F, 0.0F, -0.2974F);
		action6.cubeList.add(new ModelBox(action6, 0, 71, -1.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(-1.5F, -54.0F, -39.5F);
		bolt2.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, -1.1154F);
		action4.cubeList.add(new ModelBox(action4, 104, 192, -1.0F, 0.0F, -0.002F, 1, 1, 18, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(-1.5F, -54.0F, -39.5F);
		bolt2.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, 1.1154F);
		action5.cubeList.add(new ModelBox(action5, 32, 191, 0.0F, 0.0F, -0.001F, 1, 1, 18, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-3.5F, -52.0F, -33.5F);
		bolt2.addChild(action2);
		action2.cubeList.add(new ModelBox(action2, 52, 71, 0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-3.3F, -52.0F, -25.5F);
		bolt2.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 86, 14, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-0.5F, -52.0F, -33.5F);
		bolt2.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 33, 260, -2.0F, 0.0F, 0.0F, 3, 2, 15, 0.0F, false));
		action3.cubeList.add(new ModelBox(action3, 42, 30, -2.0F, 1.3F, 12.3F, 1, 4, 3, -0.3F, false));
		action3.cubeList.add(new ModelBox(action3, 37, 20, -1.0F, 1.3F, 12.3F, 1, 4, 3, -0.3F, false));
		action3.cubeList.add(new ModelBox(action3, 89, 102, -1.0F, 3.3F, 8.2F, 1, 2, 5, -0.3F, false));
		action3.cubeList.add(new ModelBox(action3, 110, 111, -2.0F, 3.3F, 8.2F, 1, 2, 5, -0.3F, false));

		action21 = new ModelRenderer(this);
		action21.setRotationPoint(-6.7028F, -46.801F, -32.2595F);
		bolt2.addChild(action21);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.9279F, -0.599F, -0.3478F);
		action21.addChild(bone7);
		

		action18_r1 = new ModelRenderer(this);
		action18_r1.setRotationPoint(0.0F, -4.0F, 0.0F);
		bone7.addChild(action18_r1);
		setRotationAngle(action18_r1, 0.0F, -0.6545F, 0.0F);
		

		action17_r1 = new ModelRenderer(this);
		action17_r1.setRotationPoint(-0.0591F, -4.0F, -0.1874F);
		bone7.addChild(action17_r1);
		setRotationAngle(action17_r1, 0.0F, -0.3054F, 0.0F);
		

		action16_r1 = new ModelRenderer(this);
		action16_r1.setRotationPoint(0.485F, -4.0F, -0.1755F);
		bone7.addChild(action16_r1);
		setRotationAngle(action16_r1, 0.0F, 0.2618F, 0.0F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(1.9279F, -0.799F, -0.3478F);
		action21.addChild(bone8);
		

		action19_r1 = new ModelRenderer(this);
		action19_r1.setRotationPoint(0.0F, -3.9F, 0.0F);
		bone8.addChild(action19_r1);
		setRotationAngle(action19_r1, 0.0F, -0.6545F, 0.0F);
		

		action18_r2 = new ModelRenderer(this);
		action18_r2.setRotationPoint(-0.0591F, -4.0F, -0.1874F);
		bone8.addChild(action18_r2);
		setRotationAngle(action18_r2, 0.0F, -0.3054F, 0.0F);
		

		action19_r2 = new ModelRenderer(this);
		action19_r2.setRotationPoint(-0.1435F, -4.3762F, -0.2141F);
		bone8.addChild(action19_r2);
		setRotationAngle(action19_r2, 0.2223F, 0.1395F, 1.0192F);
		

		action17_r2 = new ModelRenderer(this);
		action17_r2.setRotationPoint(0.485F, -3.9F, -0.1755F);
		bone8.addChild(action17_r2);
		setRotationAngle(action17_r2, 0.0F, 0.2618F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bolt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}