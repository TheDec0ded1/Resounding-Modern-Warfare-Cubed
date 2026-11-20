package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1GarandAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action13;
	private final ModelRenderer action12;
	private final ModelRenderer action11;
	private final ModelRenderer action10;
	private final ModelRenderer action12_r1;
	private final ModelRenderer action11_r1;
	private final ModelRenderer action9;
	private final ModelRenderer action8;
	private final ModelRenderer action7;
	private final ModelRenderer action6;
	private final ModelRenderer action5;
	private final ModelRenderer action4;
	private final ModelRenderer action3;
	private final ModelRenderer action1;

	public M1GarandAction() {
		textureWidth = 496;
		textureHeight = 496;

		action = new ModelRenderer(this);
		action.setRotationPoint(-2.9083F, -15.1F, -33.5667F);
		

		action13 = new ModelRenderer(this);
		action13.setRotationPoint(-2.3917F, 0.7F, 2.1667F);
		action.addChild(action13);
		setRotationAngle(action13, 0.0F, -0.1859F, 0.0F);
		action13.cubeList.add(new ModelBox(action13, 459, 119, -0.3706F, 1.25F, 4.9693F, 3, 1, 1, -0.001F, false));

		action12 = new ModelRenderer(this);
		action12.setRotationPoint(-2.3917F, 0.3F, 2.1667F);
		action.addChild(action12);
		setRotationAngle(action12, 0.0F, -0.1859F, 0.0F);
		action12.cubeList.add(new ModelBox(action12, 459, 258, -0.3706F, 1.0F, 4.9693F, 3, 1, 1, 0.0F, false));

		action11 = new ModelRenderer(this);
		action11.setRotationPoint(-0.8917F, 0.7F, -0.4333F);
		action.addChild(action11);
		action11.cubeList.add(new ModelBox(action11, 456, 8, -0.3F, 1.25F, 2.0F, 1, 1, 7, 0.0F, false));

		action10 = new ModelRenderer(this);
		action10.setRotationPoint(-0.8917F, -0.4F, -0.4333F);
		action.addChild(action10);
		action10.cubeList.add(new ModelBox(action10, 188, 465, -0.4F, -0.05F, 1.9F, 1, 2, 3, -0.1F, false));

		action12_r1 = new ModelRenderer(this);
		action12_r1.setRotationPoint(1.3F, 0.2F, 0.3F);
		action10.addChild(action12_r1);
		setRotationAngle(action12_r1, -0.4014F, 0.0F, 0.0F);
		action12_r1.cubeList.add(new ModelBox(action12_r1, 396, 470, -1.7F, -1.333F, 4.8933F, 1, 1, 2, -0.102F, false));

		action11_r1 = new ModelRenderer(this);
		action11_r1.setRotationPoint(1.3F, -0.8F, -0.35F);
		action10.addChild(action11_r1);
		setRotationAngle(action11_r1, -0.8203F, 0.0F, 0.0F);
		action11_r1.cubeList.add(new ModelBox(action11_r1, 467, 306, -1.7F, -3.2748F, 4.0314F, 1, 2, 2, -0.101F, false));

		action9 = new ModelRenderer(this);
		action9.setRotationPoint(-0.8917F, 0.3F, -0.4333F);
		action.addChild(action9);
		action9.cubeList.add(new ModelBox(action9, 456, 17, -0.3F, 1.0F, 2.0F, 1, 1, 7, 0.001F, false));
		action9.cubeList.add(new ModelBox(action9, 448, 165, -0.1F, 1.7F, -15.0F, 1, 2, 19, 0.001F, false));

		action8 = new ModelRenderer(this);
		action8.setRotationPoint(1.9083F, -0.4F, -0.4333F);
		action.addChild(action8);
		setRotationAngle(action8, 0.0F, 0.0F, -1.1525F);
		action8.cubeList.add(new ModelBox(action8, 469, 414, -2.0965F, 0.4874F, 5.0F, 1, 1, 2, 0.0F, false));

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(0.9083F, -0.4F, -0.4333F);
		action.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 1.1525F);
		action7.cubeList.add(new ModelBox(action7, 467, 311, 1.0965F, 0.4874F, 5.0F, 1, 2, 2, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(0.9083F, -0.4F, -0.4333F);
		action.addChild(action6);
		action6.cubeList.add(new ModelBox(action6, 469, 418, 0.0F, 1.2F, 5.0F, 1, 1, 2, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(1.9083F, -0.2F, -0.4333F);
		action.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, -1.1525F);
		action5.cubeList.add(new ModelBox(action5, 50, 449, -2.0965F, 0.4874F, 6.0F, 1, 1, 10, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(0.9083F, -0.2F, -0.4333F);
		action.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, 1.1525F);
		action4.cubeList.add(new ModelBox(action4, 73, 449, 1.0965F, 0.4874F, 6.0F, 1, 1, 10, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(0.0083F, 0.2F, -0.4333F);
		action.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 25, 449, 0.0F, 1.2F, 5.0F, 1, 2, 11, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(0.9083F, -0.2F, -0.4333F);
		action.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 450, 65, 0.0F, 1.2F, 6.0F, 1, 1, 10, 0.0F, false));
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