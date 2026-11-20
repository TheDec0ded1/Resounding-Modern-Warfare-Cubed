package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer receiver15_r6;
	private final ModelRenderer receiver16_r6;
	private final ModelRenderer receiver15_r7;
	private final ModelRenderer receiver16_r7;

	public M110Action() {
		textureWidth = 544;
		textureHeight = 544;

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.05F, -14.775F, -18.25F);
		

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(0.95F, -1.025F, -2.25F);
		action.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, 0.0F, 0.0F, -0.4014F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 342, 209, -1.1841F, -0.0791F, -4.499F, 1, 1, 5, 0.0F, false));
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 366, 77, -1.0842F, 0.0689F, 0.499F, 1, 1, 4, 0.0F, false));
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 354, 209, -1.1841F, -0.0781F, 4.501F, 1, 1, 5, 0.0F, false));

		receiver16_r6 = new ModelRenderer(this);
		receiver16_r6.setRotationPoint(-0.35F, 0.275F, 1.75F);
		action.addChild(receiver16_r6);
		setRotationAngle(receiver16_r6, 0.0F, 0.0F, -0.4014F);
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 366, 209, -0.1851F, -0.0781F, 0.5F, 1, 1, 5, 0.0F, false));
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 378, 209, -0.1851F, -0.0781F, -8.5F, 1, 1, 5, 0.0F, false));
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 376, 77, -0.099F, 0.0748F, -3.501F, 1, 1, 4, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-0.35F, 0.275F, 1.75F);
		action.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 326, 82, -0.1851F, -0.9219F, 0.499F, 1, 1, 5, 0.0F, false));
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 390, 209, -0.1851F, -0.9219F, -8.501F, 1, 1, 5, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(-0.25F, 0.475F, -1.25F);
		action.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 0.4014F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 356, 77, -0.1851F, -1.0219F, -0.501F, 1, 1, 4, 0.0F, false));
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