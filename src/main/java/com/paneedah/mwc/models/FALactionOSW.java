package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALactionOSW extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone92;

	public FALactionOSW() {
		textureWidth = 384;
		textureHeight = 384;

		action = new ModelRenderer(this);
		action.setRotationPoint(-1.3093F, -15.6568F, -23.15F);
		action.cubeList.add(new ModelBox(action, 212, 353, -0.6682F, -1.5979F, -4.35F, 1, 2, 11, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 338, 178, -1.3753F, -0.8908F, -4.35F, 1, 1, 11, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 324, 353, 0.0389F, -0.8908F, -4.35F, 1, 1, 11, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 348, 353, -1.7843F, 0.3103F, -3.55F, 1, 2, 10, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 308, 373, -2.1008F, 0.247F, 4.1222F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 312, 373, -2.1008F, 0.247F, 1.8722F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 316, 373, -2.1008F, 0.247F, -0.6278F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 320, 373, -2.1008F, 0.247F, -2.8778F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 108, 354, 0.4479F, 0.3103F, -3.55F, 1, 2, 10, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 104, 366, -0.6682F, -1.3979F, -3.75F, 1, 2, 2, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.1008F, 3.7353F, -2.3F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 144, 259, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.1008F, 2.2353F, -5.0536F);
		action.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5236F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 144, 256, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.1008F, 2.2353F, -2.8036F);
		action.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 144, 253, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.1008F, 3.7353F, -0.05F);
		action.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 144, 250, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.1008F, 2.2353F, -0.3036F);
		action.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.5236F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 248, 56, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.1008F, 3.7353F, 2.45F);
		action.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.5236F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 248, 53, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.1008F, 2.2353F, 1.9464F);
		action.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.5236F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 248, 50, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.1008F, 3.7353F, 4.7F);
		action.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.5236F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 144, 247, -1.0F, -3.0F, 1.0F, 1, 2, 1, -0.3F, false));

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(1.0092F, -0.8432F, -3.6F);
		action.addChild(bone92);
		setRotationAngle(bone92, 0.0F, 0.0F, 0.7854F);
		bone92.cubeList.add(new ModelBox(bone92, 236, 354, -1.4369F, 0.6525F, 0.05F, 1, 1, 10, 0.0F, false));
		bone92.cubeList.add(new ModelBox(bone92, 258, 354, -1.0127F, 0.2283F, 0.05F, 1, 1, 10, 0.0F, false));
		bone92.cubeList.add(new ModelBox(bone92, 280, 354, -1.1597F, 1.791F, 0.05F, 1, 1, 10, 0.0F, false));
		bone92.cubeList.add(new ModelBox(bone92, 302, 354, 0.1258F, 0.5055F, 0.05F, 1, 1, 10, 0.0F, false));
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