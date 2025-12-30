package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class mp5kbolt extends ModelWithAttachments {
	private final ModelRenderer bolt;
	private final ModelRenderer action6_r1;
	private final ModelRenderer action5_r1;
	private final ModelRenderer action4_r1;
	private final ModelRenderer action3_r1;
	private final ModelRenderer action2;
	private final ModelRenderer action1;

	public mp5kbolt() {
		textureWidth = 280;
		textureHeight = 300;

		bolt = new ModelRenderer(this);
		bolt.setRotationPoint(0.0F, 24.0F, 4.0F);
		

		action6_r1 = new ModelRenderer(this);
		action6_r1.setRotationPoint(2.8478F, -38.4543F, -33.3F);
		bolt.addChild(action6_r1);
		setRotationAngle(action6_r1, 0.0F, -0.3665F, -0.1798F);
		action6_r1.cubeList.add(new ModelBox(action6_r1, 35, 8, -2.2F, -1.0F, 0.8F, 1, 1, 1, 0.001F, false));

		action5_r1 = new ModelRenderer(this);
		action5_r1.setRotationPoint(2.8478F, -38.4543F, -33.3F);
		bolt.addChild(action5_r1);
		setRotationAngle(action5_r1, 0.0F, 0.0F, -0.1798F);
		action5_r1.cubeList.add(new ModelBox(action5_r1, 35, 19, -2.6F, -1.0F, 0.4F, 1, 1, 1, -0.001F, false));

		action4_r1 = new ModelRenderer(this);
		action4_r1.setRotationPoint(2.8478F, -38.4543F, -33.3F);
		bolt.addChild(action4_r1);
		setRotationAngle(action4_r1, 0.0F, 0.192F, -0.1798F);
		action4_r1.cubeList.add(new ModelBox(action4_r1, 35, 22, -1.9F, -1.0F, 0.05F, 1, 1, 1, 0.0F, false));

		action3_r1 = new ModelRenderer(this);
		action3_r1.setRotationPoint(1.1478F, -38.0543F, -33.0F);
		bolt.addChild(action3_r1);
		setRotationAngle(action3_r1, 0.0F, 0.0F, -0.0227F);
		action3_r1.cubeList.add(new ModelBox(action3_r1, 13, 21, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.2F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-0.4F, -38.95F, -26.9F);
		bolt.addChild(action2);
		setRotationAngle(action2, 0.0F, 0.0F, 2.3051F);
		action2.cubeList.add(new ModelBox(action2, 63, 20, 0.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-0.8F, -38.95F, -37.0F);
		bolt.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 0, 0, -0.6F, 0.0F, 3.7F, 1, 1, 11, 0.0F, false));
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